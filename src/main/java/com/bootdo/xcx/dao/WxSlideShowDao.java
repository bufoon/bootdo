package com.bootdo.xcx.dao;


import com.bootdo.xcx.domain.WxSlideShowDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 轮播图表
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:55
 */
@Mapper
public interface WxSlideShowDao {

	WxSlideShowDO get(Long slideShowId);
	
	List<WxSlideShowDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WxSlideShowDO wxSlideShow);
	
	int update(WxSlideShowDO wxSlideShow);
	
	int remove(Long slide_show_id);
	
	int batchRemove(Long[] slideShowIds);
}
