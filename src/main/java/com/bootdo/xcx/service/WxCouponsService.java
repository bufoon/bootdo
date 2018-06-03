package com.bootdo.xcx.service;


import com.bootdo.xcx.domain.WxCouponsDO;

import java.util.List;
import java.util.Map;

/**
 * 优惠券表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:54
 */
public interface WxCouponsService {
	
	WxCouponsDO get(Long couponsId);
	
	List<WxCouponsDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WxCouponsDO wxCoupons);
	
	int update(WxCouponsDO wxCoupons);
	
	int remove(Long couponsId);
	
	int batchRemove(Long[] couponsIds);
}
