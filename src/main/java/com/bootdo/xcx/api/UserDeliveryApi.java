package com.bootdo.xcx.api;

import com.bootdo.common.utils.IDWorker;
import com.bootdo.xcx.api.support.AbstractApi;
import com.bootdo.xcx.api.support.ApiResponse;
import com.bootdo.xcx.domain.WxDeliveryDO;
import com.bootdo.xcx.service.WxDeliveryService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: bufoon
 * @Email: 285395841@qq.com
 * @Datetime: Created In 2018/5/27 18:13
 * @Desc: as follows.
 */
@RestController
@RequestMapping("api/userDelivery")
@Api(value = "用户收获地址接口")
public class UserDeliveryApi extends AbstractApi {

    @Autowired
    private WxDeliveryService deliveryService;
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ApiResponse list(){
        Map<String, Object> paramsMap = new HashMap<>();
        paramsMap.put("userId", WEIXIN_SESSION.get().getUserId());
        return new ApiResponse(1, "success", deliveryService.list(paramsMap));
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public ApiResponse add(WxDeliveryDO wxDeliveryDO){
        wxDeliveryDO.setDeliveryId(IDWorker.getId());
        wxDeliveryDO.setCreateTime(new Date());
        deliveryService.save(wxDeliveryDO);
        return new ApiResponse(1, "success", null);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public ApiResponse update(WxDeliveryDO wxDeliveryDO){
        wxDeliveryDO.setUpdateTime(new Date());
        deliveryService.update(wxDeliveryDO);
        return new ApiResponse(1, "success", null);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public ApiResponse delete(Long deliverId){
        deliveryService.remove(deliverId);
        return new ApiResponse(1, "success", null);
    }


}
