package com.bootdo.xcx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.xcx.dao.WxFavoriteDao;
import com.bootdo.xcx.domain.WxFavoriteDO;
import com.bootdo.xcx.service.WxFavoriteService;



@Service
public class WxFavoriteServiceImpl implements WxFavoriteService {
	@Autowired
	private WxFavoriteDao wxFavoriteDao;
	
	@Override
	public WxFavoriteDO get(Long facoriteId){
		return wxFavoriteDao.get(facoriteId);
	}
	
	@Override
	public List<WxFavoriteDO> list(Map<String, Object> map){
		return wxFavoriteDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return wxFavoriteDao.count(map);
	}
	
	@Override
	public int save(WxFavoriteDO wxFavorite){
		return wxFavoriteDao.save(wxFavorite);
	}
	
	@Override
	public int update(WxFavoriteDO wxFavorite){
		return wxFavoriteDao.update(wxFavorite);
	}
	
	@Override
	public int remove(Long facoriteId){
		return wxFavoriteDao.remove(facoriteId);
	}
	
	@Override
	public int batchRemove(Long[] facoriteIds){
		return wxFavoriteDao.batchRemove(facoriteIds);
	}
	
}
