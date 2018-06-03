package com.bootdo.xcx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.xcx.dao.WxOrderDao;
import com.bootdo.xcx.domain.WxOrderDO;
import com.bootdo.xcx.service.WxOrderService;



@Service
public class WxOrderServiceImpl implements WxOrderService {
	@Autowired
	private WxOrderDao wxOrderDao;
	
	@Override
	public WxOrderDO get(Long orderId){
		return wxOrderDao.get(orderId);
	}
	
	@Override
	public List<WxOrderDO> list(Map<String, Object> map){
		return wxOrderDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return wxOrderDao.count(map);
	}
	
	@Override
	public int save(WxOrderDO wxOrder){
		return wxOrderDao.save(wxOrder);
	}
	
	@Override
	public int update(WxOrderDO wxOrder){
		return wxOrderDao.update(wxOrder);
	}
	
	@Override
	public int remove(Long orderId){
		return wxOrderDao.remove(orderId);
	}
	
	@Override
	public int batchRemove(Long[] orderIds){
		return wxOrderDao.batchRemove(orderIds);
	}
	
}
