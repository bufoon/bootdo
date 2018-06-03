package com.bootdo.xcx.dao;


import java.util.List;
import java.util.Map;

import com.bootdo.xcx.domain.WxAttrDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 属性表
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:54
 */
@Mapper
public interface WxAttrDao {

	WxAttrDO get(Long attrId);
	
	List<WxAttrDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WxAttrDO wxAttr);
	
	int update(WxAttrDO wxAttr);
	
	int remove(Long attr_id);
	
	int batchRemove(Long[] attrIds);
}
