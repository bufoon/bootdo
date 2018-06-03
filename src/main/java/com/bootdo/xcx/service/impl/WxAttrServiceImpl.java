package com.bootdo.xcx.service.impl;

import com.bootdo.xcx.dao.WxAttrDao;
import com.bootdo.xcx.domain.WxAttrDO;
import com.bootdo.xcx.service.WxAttrService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;



@Service
public class WxAttrServiceImpl implements WxAttrService {
	@Autowired
	private WxAttrDao wxAttrDao;
	
	@Override
	public WxAttrDO get(Long attrId){
		return wxAttrDao.get(attrId);
	}
	
	@Override
	public List<WxAttrDO> list(Map<String, Object> map){
		return wxAttrDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return wxAttrDao.count(map);
	}
	
	@Override
	public int save(WxAttrDO wxAttr){
		return wxAttrDao.save(wxAttr);
	}
	
	@Override
	public int update(WxAttrDO wxAttr){
		return wxAttrDao.update(wxAttr);
	}
	
	@Override
	public int remove(Long attrId){
		return wxAttrDao.remove(attrId);
	}
	
	@Override
	public int batchRemove(Long[] attrIds){
		return wxAttrDao.batchRemove(attrIds);
	}
	
}
