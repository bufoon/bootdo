package com.bootdo.xcx.service.impl;

import com.bootdo.xcx.dao.WxCartDao;
import com.bootdo.xcx.domain.WxCartDO;
import com.bootdo.xcx.service.WxCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;




@Service
public class WxCartServiceImpl implements WxCartService {
	@Autowired
	private WxCartDao wxCartDao;
	
	@Override
	public WxCartDO get(Long cartId){
		return wxCartDao.get(cartId);
	}
	
	@Override
	public List<WxCartDO> list(Map<String, Object> map){
		return wxCartDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return wxCartDao.count(map);
	}
	
	@Override
	public int save(WxCartDO wxCart){
		return wxCartDao.save(wxCart);
	}
	
	@Override
	public int update(WxCartDO wxCart){
		return wxCartDao.update(wxCart);
	}
	
	@Override
	public int remove(Long cartId){
		return wxCartDao.remove(cartId);
	}
	
	@Override
	public int batchRemove(Long[] cartIds){
		return wxCartDao.batchRemove(cartIds);
	}
	
}
