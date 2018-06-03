package com.bootdo.xcx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.xcx.dao.WxDeliveryDao;
import com.bootdo.xcx.domain.WxDeliveryDO;
import com.bootdo.xcx.service.WxDeliveryService;



@Service
public class WxDeliveryServiceImpl implements WxDeliveryService {
	@Autowired
	private WxDeliveryDao wxDeliveryDao;
	
	@Override
	public WxDeliveryDO get(Long deliveryId){
		return wxDeliveryDao.get(deliveryId);
	}
	
	@Override
	public List<WxDeliveryDO> list(Map<String, Object> map){
		return wxDeliveryDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return wxDeliveryDao.count(map);
	}
	
	@Override
	public int save(WxDeliveryDO wxDelivery){
		return wxDeliveryDao.save(wxDelivery);
	}
	
	@Override
	public int update(WxDeliveryDO wxDelivery){
		return wxDeliveryDao.update(wxDelivery);
	}
	
	@Override
	public int remove(Long deliveryId){
		return wxDeliveryDao.remove(deliveryId);
	}
	
	@Override
	public int batchRemove(Long[] deliveryIds){
		return wxDeliveryDao.batchRemove(deliveryIds);
	}
	
}
