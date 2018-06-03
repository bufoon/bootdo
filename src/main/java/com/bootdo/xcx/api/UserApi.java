package com.bootdo.xcx.api;

import com.alibaba.fastjson.JSON;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.bootdo.common.utils.IDWorker;
import com.bootdo.xcx.api.model.UserInfoModel;
import com.bootdo.xcx.api.support.*;
import com.bootdo.xcx.domain.WxUserDO;
import com.bootdo.xcx.service.WxUserService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.lang3.time.DateUtils;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * @Author: bufoon
 * @Email: 285395841@qq.com
 * @Datetime: Created In 2018/5/5 18:21
 * @Desc: as follows.
 */
@RestController
@RequestMapping("/api/user")
public class UserApi extends AbstractApi {

    @ApiOperation(value = "小程序授权", notes = "微信小程序授权接口")
    @ApiImplicitParam(name = "code", value = "小程序登陆code", required = true, dataType = "String", paramType = "")
    @RequestMapping(value = "/authorization", method = {RequestMethod.GET, RequestMethod.POST})
    public ApiResponse authorization(String code) throws IOException {
        // 请求微信授权获取用户openId，sessionKey
        String url = weixinConfig.getSessionUrl();
        url = String.format(url, weixinConfig.getAppId(), weixinConfig.getAppSecret(), code);
        CloseableHttpClient httpclient=HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(url);
        CloseableHttpResponse response = httpclient.execute(httpGet);
        String content = EntityUtils.toString(response.getEntity());
        System.out.println("============================== \n" + content);
//        restTemplate.setMessageConverters(Arrays.asList(new MappingJackson2HttpMessageConverter()));
//        WeixinSession weixinSession = restTemplate.getForObject(url, WeixinSession.class);
        WeixinSession weixinSession = JSON.parseObject(content, WeixinSession.class);
        if (!weixinSession.getErrcode().equals(0)){
            return new ApiResponse(-1, "授权失败", "");
        }
        // 判断用户表里面有没有该用户，有则更新，没有则插入
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("openId", weixinSession.getOpenid());
        List<WxUserDO> list = wxUserService.list(paramMap);
        WxUserDO wxUserDO = null;
        if (list != null && !list.isEmpty()){
            // 用户存在
            wxUserDO = list.get(0);
            wxUserDO.setSessionKey(weixinSession.getSession_key());
            wxUserService.update(wxUserDO);
        } else {
            wxUserDO = new WxUserDO();
            wxUserDO.setUserId(IDWorker.getId());
            wxUserDO.setOpenId(weixinSession.getOpenid());
            wxUserDO.setSessionKey(weixinSession.getSession_key());
            wxUserDO.setCreateTime(new Date());
            wxUserService.save(wxUserDO);
        }
        // 生成本地session信息，返回给用户
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("alg", "HS256");
        map.put("typ", "JWT");
        String token = JWT.create()
                .withHeader(map)//header
                .withIssuedAt(new Date())
                .withExpiresAt(DateUtils.addDays(new Date(), 7)) // 7天有效期
                .withClaim("userId", String.valueOf(wxUserDO.getUserId()))//payload
                .withClaim("openId", wxUserDO.getOpenId())
                .withClaim("sessionKey", wxUserDO.getSessionKey())
                .withClaim("unionId", wxUserDO.getUnionId())
                .sign(Algorithm.HMAC256(TOKEN_SECRET));//加密
        return new ApiResponse(0, "成功", token);
    }

    @RequestMapping(value = "/submitWeixinUserInfo", method = {RequestMethod.POST})
    public ApiResponse submitWeixinUserInfo(@RequestBody UserInfoModel userInfo){
        // 根据用户ID找出用户
        WxUserDO wxUserDO = getWxUserByUserId();
        if (wxUserDO == null){
            return new ApiResponse(-1, "失败,用户不存在", null);
        }
        // 解密数据
        String encData = userInfo.getEncryptedData();
        String encResult = WeixinUtil.decrypt(weixinConfig.getAppId(), encData, WEIXIN_SESSION.get().getSession_key(), userInfo.getIv());
        WxUserDO update = JSON.parseObject(encResult, WxUserDO.class);
        org.springframework.beans.BeanUtils.copyProperties(update, wxUserDO);
        // 更新用户
        wxUserDO.setUpdateTime(new Date());
        wxUserService.update(wxUserDO);
        return new ApiResponse(0,"success", null);
    }

    @RequestMapping(value = "/userDetail", method = {RequestMethod.GET})
    public ApiResponse userDetail(){

        return new ApiResponse(0,"success", getWxUserByUserId());
    }

    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException, UnsupportedEncodingException {
        WeixinConfig weixinConfig = new WeixinConfig();
        weixinConfig.setAppId("111");
        weixinConfig.setAppSecret("22");
        System.out.println(BeanUtils.describe(weixinConfig));
        String s = "https://api.weixin.qq.com/sns/jscode2session?appid=%s&secret=%s&js_code=%s&grant_type=authorization_code";
        System.out.println(String.format(s, weixinConfig.getAppId(), weixinConfig.getAppSecret(), "ss"));
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("alg", "HS256");
        map.put("typ", "JWT");
        String token = JWT.create()
                .withHeader(map)//header
                .withIssuedAt(new Date())
                .withExpiresAt(DateUtils.addDays(new Date(), -1))
                .withClaim("userId", String.valueOf("aaa"))//payload
                .withClaim("openId", "ioebud")
                .withClaim("sessionKey", "www")
                .sign(Algorithm.HMAC256("shuhuaxiaochengxu"));//加

        JWTVerifier verifier = JWT.require(Algorithm.HMAC256("shuhuaxiaochengxu"))
                .build();
        DecodedJWT jwt = verifier.verify(token);
        Map<String, Claim> claims = jwt.getClaims();
        System.out.println(claims.get("userId").asString());
    }
}
