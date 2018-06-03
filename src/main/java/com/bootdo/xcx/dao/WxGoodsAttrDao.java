package com.bootdo.xcx.dao;


import com.bootdo.xcx.domain.WxGoodsAttrDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 商品属性表
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:55
 */
@Mapper
public interface WxGoodsAttrDao {

	WxGoodsAttrDO get(Long goodAttrId);
	
	List<WxGoodsAttrDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WxGoodsAttrDO wxGoodsAttr);
	
	int update(WxGoodsAttrDO wxGoodsAttr);
	
	int remove(Long good_attr_id);
	
	int batchRemove(Long[] goodAttrIds);
}
