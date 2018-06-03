package com.bootdo.xcx.service;


import com.bootdo.xcx.domain.WxGoodsDO;

import java.util.List;
import java.util.Map;

/**
 * 商品表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:55
 */
public interface WxGoodsService {
	
	WxGoodsDO get(Long goodsId);
	
	List<WxGoodsDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WxGoodsDO wxGoods);
	
	int update(WxGoodsDO wxGoods);
	
	int remove(Long goodsId);
	
	int batchRemove(Long[] goodsIds);
}
