package com.bootdo.xcx.dao;


import com.bootdo.xcx.domain.WxOrderGoodsDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 订单商品表
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:55
 */
@Mapper
public interface WxOrderGoodsDao {

	WxOrderGoodsDO get(Long id);
	
	List<WxOrderGoodsDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WxOrderGoodsDO wxOrderGoods);
	
	int update(WxOrderGoodsDO wxOrderGoods);
	
	int remove(Long id);
	
	int batchRemove(Long[] ids);
}
