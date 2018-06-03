package com.bootdo.xcx.api.support;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.bootdo.common.utils.StringUtils;
import com.bootdo.xcx.domain.WxUserDO;
import com.bootdo.xcx.service.WxUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author: bufoon
 * @Email: 285395841@qq.com
 * @Datetime: Created In 2018/6/3 13:36
 * @Desc: as follows.
 */
public class AbstractApi {

    @Autowired
    protected WxUserService wxUserService;
    @Autowired
    protected WeixinConfig weixinConfig;
    protected Logger logger = LoggerFactory.getLogger(getClass());

    protected final String TOKEN_SECRET = "shuhuaxiaochengxu2018";

    protected ThreadLocal<WeixinSession> WEIXIN_SESSION = new ThreadLocal<>();

    @ModelAttribute
    public WeixinSession preHandle(HttpServletRequest request) throws Exception {
        String requestUri = request.getRequestURI();
        if (StringUtils.isNotEmpty(requestUri) && requestUri.contains("authorization")){
            //不执行下面验证token逻辑
            return null;
        }
        String token = request.getHeader("auth_token");
        if (StringUtils.isEmpty(token)){
            throw new Exception("");
        }

        try {
            WeixinSession weixinSession = new WeixinSession();
            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(TOKEN_SECRET))
                    .build();
            DecodedJWT jwt = verifier.verify(token);
            weixinSession.setToken(token);
            Map<String, Claim> claims = jwt.getClaims();
            Claim temp = null;
            weixinSession.setOpenid((temp = claims.get("openId")) != null?temp.asString():"");
            weixinSession.setSession_key((temp = claims.get("sessionKey")) != null?temp.asString():"");
            weixinSession.setUnionid((temp = claims.get("unionId")) != null?temp.asString():"");
            weixinSession.setUserId((temp = claims.get("userId")) != null?temp.asString():"");
            WEIXIN_SESSION.set(weixinSession);
            return weixinSession;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            throw new Exception("token无效：" + e.getMessage());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw new Exception("token无效：" + e.getMessage());
        } catch (JWTVerificationException e) {
            e.printStackTrace();
            throw new Exception("token无效：" + e.getMessage());
        }
    }

    /**
     * 根据用户ID获取用户信息
     * @return
     */
    protected WxUserDO getWxUserByUserId(){
        return wxUserService.get(Long.valueOf(WEIXIN_SESSION.get().getUserId()));
    }
}
