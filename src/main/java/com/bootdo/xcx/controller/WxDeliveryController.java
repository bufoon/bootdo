package com.bootdo.xcx.controller;

import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;
import com.bootdo.xcx.domain.WxDeliveryDO;
import com.bootdo.xcx.service.WxDeliveryService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 收货地址表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:54
 */
 
@Controller
@RequestMapping("/xcx/wxDelivery")
public class WxDeliveryController {
	@Autowired
	private WxDeliveryService wxDeliveryService;
	
	@GetMapping()
	@RequiresPermissions("xcx:wxDelivery:wxDelivery")
	String WxDelivery(){
	    return "xcx/wxDelivery/wxDelivery";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("xcx:wxDelivery:wxDelivery")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<WxDeliveryDO> wxDeliveryList = wxDeliveryService.list(query);
		int total = wxDeliveryService.count(query);
		PageUtils pageUtils = new PageUtils(wxDeliveryList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("xcx:wxDelivery:add")
	String add(){
	    return "xcx/wxDelivery/add";
	}

	@GetMapping("/edit/{deliveryId}")
	@RequiresPermissions("xcx:wxDelivery:edit")
	String edit(@PathVariable("deliveryId") Long deliveryId,Model model){
		WxDeliveryDO wxDelivery = wxDeliveryService.get(deliveryId);
		model.addAttribute("wxDelivery", wxDelivery);
	    return "xcx/wxDelivery/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("xcx:wxDelivery:add")
	public R save( WxDeliveryDO wxDelivery){
		if(wxDeliveryService.save(wxDelivery)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("xcx:wxDelivery:edit")
	public R update( WxDeliveryDO wxDelivery){
		wxDeliveryService.update(wxDelivery);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("xcx:wxDelivery:remove")
	public R remove( Long deliveryId){
		if(wxDeliveryService.remove(deliveryId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("xcx:wxDelivery:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] deliveryIds){
		wxDeliveryService.batchRemove(deliveryIds);
		return R.ok();
	}
	
}
