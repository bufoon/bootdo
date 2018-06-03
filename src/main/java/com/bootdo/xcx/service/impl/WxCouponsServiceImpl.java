package com.bootdo.xcx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.xcx.dao.WxCouponsDao;
import com.bootdo.xcx.domain.WxCouponsDO;
import com.bootdo.xcx.service.WxCouponsService;



@Service
public class WxCouponsServiceImpl implements WxCouponsService {
	@Autowired
	private WxCouponsDao wxCouponsDao;
	
	@Override
	public WxCouponsDO get(Long couponsId){
		return wxCouponsDao.get(couponsId);
	}
	
	@Override
	public List<WxCouponsDO> list(Map<String, Object> map){
		return wxCouponsDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return wxCouponsDao.count(map);
	}
	
	@Override
	public int save(WxCouponsDO wxCoupons){
		return wxCouponsDao.save(wxCoupons);
	}
	
	@Override
	public int update(WxCouponsDO wxCoupons){
		return wxCouponsDao.update(wxCoupons);
	}
	
	@Override
	public int remove(Long couponsId){
		return wxCouponsDao.remove(couponsId);
	}
	
	@Override
	public int batchRemove(Long[] couponsIds){
		return wxCouponsDao.batchRemove(couponsIds);
	}
	
}
