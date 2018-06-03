package com.bootdo.xcx.service;

import com.bootdo.xcx.domain.WxOrderDO;

import java.util.List;
import java.util.Map;

/**
 * 订单表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:55
 */
public interface WxOrderService {
	
	WxOrderDO get(Long orderId);
	
	List<WxOrderDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WxOrderDO wxOrder);
	
	int update(WxOrderDO wxOrder);
	
	int remove(Long orderId);
	
	int batchRemove(Long[] orderIds);
}
