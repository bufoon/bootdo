package com.bootdo.xcx.service;


import com.bootdo.xcx.domain.WxCartDO;

import java.util.List;
import java.util.Map;

/**
 * 购物车表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:54
 */
public interface WxCartService {
	
	WxCartDO get(Long cartId);
	
	List<WxCartDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WxCartDO wxCart);
	
	int update(WxCartDO wxCart);
	
	int remove(Long cartId);
	
	int batchRemove(Long[] cartIds);
}
