package com.bootdo.xcx.service;


import com.bootdo.xcx.domain.WxFavoriteDO;

import java.util.List;
import java.util.Map;

/**
 * 收藏表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:54
 */
public interface WxFavoriteService {
	
	WxFavoriteDO get(Long facoriteId);
	
	List<WxFavoriteDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WxFavoriteDO wxFavorite);
	
	int update(WxFavoriteDO wxFavorite);
	
	int remove(Long facoriteId);
	
	int batchRemove(Long[] facoriteIds);
}
