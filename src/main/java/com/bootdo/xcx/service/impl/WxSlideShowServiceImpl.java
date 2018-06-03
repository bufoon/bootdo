package com.bootdo.xcx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.xcx.dao.WxSlideShowDao;
import com.bootdo.xcx.domain.WxSlideShowDO;
import com.bootdo.xcx.service.WxSlideShowService;



@Service
public class WxSlideShowServiceImpl implements WxSlideShowService {
	@Autowired
	private WxSlideShowDao wxSlideShowDao;
	
	@Override
	public WxSlideShowDO get(Long slideShowId){
		return wxSlideShowDao.get(slideShowId);
	}
	
	@Override
	public List<WxSlideShowDO> list(Map<String, Object> map){
		return wxSlideShowDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return wxSlideShowDao.count(map);
	}
	
	@Override
	public int save(WxSlideShowDO wxSlideShow){
		return wxSlideShowDao.save(wxSlideShow);
	}
	
	@Override
	public int update(WxSlideShowDO wxSlideShow){
		return wxSlideShowDao.update(wxSlideShow);
	}
	
	@Override
	public int remove(Long slideShowId){
		return wxSlideShowDao.remove(slideShowId);
	}
	
	@Override
	public int batchRemove(Long[] slideShowIds){
		return wxSlideShowDao.batchRemove(slideShowIds);
	}
	
}
