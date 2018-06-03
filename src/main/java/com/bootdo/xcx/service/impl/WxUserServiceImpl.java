package com.bootdo.xcx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.xcx.dao.WxUserDao;
import com.bootdo.xcx.domain.WxUserDO;
import com.bootdo.xcx.service.WxUserService;



@Service
public class WxUserServiceImpl implements WxUserService {
	@Autowired
	private WxUserDao wxUserDao;
	
	@Override
	public WxUserDO get(Long userId){
		return wxUserDao.get(userId);
	}
	
	@Override
	public List<WxUserDO> list(Map<String, Object> map){
		return wxUserDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return wxUserDao.count(map);
	}
	
	@Override
	public int save(WxUserDO wxUser){
		return wxUserDao.save(wxUser);
	}
	
	@Override
	public int update(WxUserDO wxUser){
		return wxUserDao.update(wxUser);
	}
	
	@Override
	public int remove(Long userId){
		return wxUserDao.remove(userId);
	}
	
	@Override
	public int batchRemove(Long[] userIds){
		return wxUserDao.batchRemove(userIds);
	}
	
}
