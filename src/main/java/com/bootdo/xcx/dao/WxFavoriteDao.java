package com.bootdo.xcx.dao;


import java.util.List;
import java.util.Map;

import com.bootdo.xcx.domain.WxFavoriteDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 收藏表
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:54
 */
@Mapper
public interface WxFavoriteDao {

	WxFavoriteDO get(Long facoriteId);
	
	List<WxFavoriteDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WxFavoriteDO wxFavorite);
	
	int update(WxFavoriteDO wxFavorite);
	
	int remove(Long facorite_id);
	
	int batchRemove(Long[] facoriteIds);
}
