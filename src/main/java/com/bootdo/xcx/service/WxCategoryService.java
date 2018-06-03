package com.bootdo.xcx.service;


import com.bootdo.xcx.domain.WxCategoryDO;

import java.util.List;
import java.util.Map;

/**
 * 分类表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:54
 */
public interface WxCategoryService {
	
	WxCategoryDO get(Long catId);
	
	List<WxCategoryDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WxCategoryDO wxCategory);
	
	int update(WxCategoryDO wxCategory);
	
	int remove(Long catId);
	
	int batchRemove(Long[] catIds);
}
