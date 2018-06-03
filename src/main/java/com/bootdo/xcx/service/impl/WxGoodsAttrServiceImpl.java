package com.bootdo.xcx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.xcx.dao.WxGoodsAttrDao;
import com.bootdo.xcx.domain.WxGoodsAttrDO;
import com.bootdo.xcx.service.WxGoodsAttrService;



@Service
public class WxGoodsAttrServiceImpl implements WxGoodsAttrService {
	@Autowired
	private WxGoodsAttrDao wxGoodsAttrDao;
	
	@Override
	public WxGoodsAttrDO get(Long goodAttrId){
		return wxGoodsAttrDao.get(goodAttrId);
	}
	
	@Override
	public List<WxGoodsAttrDO> list(Map<String, Object> map){
		return wxGoodsAttrDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return wxGoodsAttrDao.count(map);
	}
	
	@Override
	public int save(WxGoodsAttrDO wxGoodsAttr){
		return wxGoodsAttrDao.save(wxGoodsAttr);
	}
	
	@Override
	public int update(WxGoodsAttrDO wxGoodsAttr){
		return wxGoodsAttrDao.update(wxGoodsAttr);
	}
	
	@Override
	public int remove(Long goodAttrId){
		return wxGoodsAttrDao.remove(goodAttrId);
	}
	
	@Override
	public int batchRemove(Long[] goodAttrIds){
		return wxGoodsAttrDao.batchRemove(goodAttrIds);
	}
	
}
