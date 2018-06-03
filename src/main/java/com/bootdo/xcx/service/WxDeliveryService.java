package com.bootdo.xcx.service;

import com.bootdo.xcx.domain.WxDeliveryDO;

import java.util.List;
import java.util.Map;

/**
 * 收货地址表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:54
 */
public interface WxDeliveryService {
	
	WxDeliveryDO get(Long deliveryId);
	
	List<WxDeliveryDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WxDeliveryDO wxDelivery);
	
	int update(WxDeliveryDO wxDelivery);
	
	int remove(Long deliveryId);
	
	int batchRemove(Long[] deliveryIds);
}
