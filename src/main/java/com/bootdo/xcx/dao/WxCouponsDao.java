package com.bootdo.xcx.dao;


import java.util.List;
import java.util.Map;

import com.bootdo.xcx.domain.WxCouponsDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券表
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:54
 */
@Mapper
public interface WxCouponsDao {

	WxCouponsDO get(Long couponsId);
	
	List<WxCouponsDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WxCouponsDO wxCoupons);
	
	int update(WxCouponsDO wxCoupons);
	
	int remove(Long coupons_id);
	
	int batchRemove(Long[] couponsIds);
}
