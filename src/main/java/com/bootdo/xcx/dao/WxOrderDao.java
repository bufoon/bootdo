package com.bootdo.xcx.dao;


import com.bootdo.xcx.domain.WxOrderDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 订单表
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:55
 */
@Mapper
public interface WxOrderDao {

	WxOrderDO get(Long orderId);
	
	List<WxOrderDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WxOrderDO wxOrder);
	
	int update(WxOrderDO wxOrder);
	
	int remove(Long order_id);
	
	int batchRemove(Long[] orderIds);
}
