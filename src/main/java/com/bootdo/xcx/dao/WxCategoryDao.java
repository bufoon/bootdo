package com.bootdo.xcx.dao;


import java.util.List;
import java.util.Map;

import com.bootdo.xcx.domain.WxCategoryDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 分类表
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:54
 */
@Mapper
public interface WxCategoryDao {

	WxCategoryDO get(Long catId);
	
	List<WxCategoryDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WxCategoryDO wxCategory);
	
	int update(WxCategoryDO wxCategory);
	
	int remove(Long cat_id);
	
	int batchRemove(Long[] catIds);
}
