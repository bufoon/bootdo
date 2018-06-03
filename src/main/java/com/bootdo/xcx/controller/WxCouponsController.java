package com.bootdo.xcx.controller;

import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;
import com.bootdo.xcx.domain.WxCouponsDO;
import com.bootdo.xcx.service.WxCouponsService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 优惠券表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:54
 */
 
@Controller
@RequestMapping("/xcx/wxCoupons")
public class WxCouponsController {
	@Autowired
	private WxCouponsService wxCouponsService;
	
	@GetMapping()
	@RequiresPermissions("xcx:wxCoupons:wxCoupons")
	String WxCoupons(){
	    return "xcx/wxCoupons/wxCoupons";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("xcx:wxCoupons:wxCoupons")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<WxCouponsDO> wxCouponsList = wxCouponsService.list(query);
		int total = wxCouponsService.count(query);
		PageUtils pageUtils = new PageUtils(wxCouponsList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("xcx:wxCoupons:add")
	String add(){
	    return "xcx/wxCoupons/add";
	}

	@GetMapping("/edit/{couponsId}")
	@RequiresPermissions("xcx:wxCoupons:edit")
	String edit(@PathVariable("couponsId") Long couponsId,Model model){
		WxCouponsDO wxCoupons = wxCouponsService.get(couponsId);
		model.addAttribute("wxCoupons", wxCoupons);
	    return "xcx/wxCoupons/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("xcx:wxCoupons:add")
	public R save( WxCouponsDO wxCoupons){
		if(wxCouponsService.save(wxCoupons)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("xcx:wxCoupons:edit")
	public R update( WxCouponsDO wxCoupons){
		wxCouponsService.update(wxCoupons);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("xcx:wxCoupons:remove")
	public R remove( Long couponsId){
		if(wxCouponsService.remove(couponsId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("xcx:wxCoupons:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] couponsIds){
		wxCouponsService.batchRemove(couponsIds);
		return R.ok();
	}
	
}
