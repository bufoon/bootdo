package com.bootdo.xcx.service;


import com.bootdo.xcx.domain.WxAttrDO;

import java.util.List;
import java.util.Map;

/**
 * 属性表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:54
 */
public interface WxAttrService {
	
	WxAttrDO get(Long attrId);
	
	List<WxAttrDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WxAttrDO wxAttr);
	
	int update(WxAttrDO wxAttr);
	
	int remove(Long attrId);
	
	int batchRemove(Long[] attrIds);
}
