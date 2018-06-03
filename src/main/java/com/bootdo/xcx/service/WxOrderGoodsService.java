package com.bootdo.xcx.service;


import com.bootdo.xcx.domain.WxOrderGoodsDO;

import java.util.List;
import java.util.Map;

/**
 * 订单商品表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:55
 */
public interface WxOrderGoodsService {
	
	WxOrderGoodsDO get(Long id);
	
	List<WxOrderGoodsDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WxOrderGoodsDO wxOrderGoods);
	
	int update(WxOrderGoodsDO wxOrderGoods);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
