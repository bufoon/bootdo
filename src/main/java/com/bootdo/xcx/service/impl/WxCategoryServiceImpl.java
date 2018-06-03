package com.bootdo.xcx.service.impl;

import com.bootdo.xcx.dao.WxCategoryDao;
import com.bootdo.xcx.domain.WxCategoryDO;
import com.bootdo.xcx.service.WxCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;




@Service
public class WxCategoryServiceImpl implements WxCategoryService {
	@Autowired
	private WxCategoryDao wxCategoryDao;
	
	@Override
	public WxCategoryDO get(Long catId){
		return wxCategoryDao.get(catId);
	}
	
	@Override
	public List<WxCategoryDO> list(Map<String, Object> map){
		return wxCategoryDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return wxCategoryDao.count(map);
	}
	
	@Override
	public int save(WxCategoryDO wxCategory){
		return wxCategoryDao.save(wxCategory);
	}
	
	@Override
	public int update(WxCategoryDO wxCategory){
		return wxCategoryDao.update(wxCategory);
	}
	
	@Override
	public int remove(Long catId){
		return wxCategoryDao.remove(catId);
	}
	
	@Override
	public int batchRemove(Long[] catIds){
		return wxCategoryDao.batchRemove(catIds);
	}
	
}
