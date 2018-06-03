package com.bootdo.xcx.dao;


import java.util.List;
import java.util.Map;

import com.bootdo.xcx.domain.WxDeliveryDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 收货地址表
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:54
 */
@Mapper
public interface WxDeliveryDao {

	WxDeliveryDO get(Long deliveryId);
	
	List<WxDeliveryDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WxDeliveryDO wxDelivery);
	
	int update(WxDeliveryDO wxDelivery);
	
	int remove(Long delivery_id);
	
	int batchRemove(Long[] deliveryIds);
}
