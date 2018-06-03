package com.bootdo.xcx.dao;


import java.util.List;
import java.util.Map;

import com.bootdo.xcx.domain.WxCartDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 购物车表
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:54
 */
@Mapper
public interface WxCartDao {

	WxCartDO get(Long cartId);
	
	List<WxCartDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WxCartDO wxCart);
	
	int update(WxCartDO wxCart);
	
	int remove(Long cart_id);
	
	int batchRemove(Long[] cartIds);
}
