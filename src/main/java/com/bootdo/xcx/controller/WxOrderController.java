package com.bootdo.xcx.controller;

import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;
import com.bootdo.xcx.domain.WxOrderDO;
import com.bootdo.xcx.service.WxOrderService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 订单表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:55
 */
 
@Controller
@RequestMapping("/xcx/wxOrder")
public class WxOrderController {
	@Autowired
	private WxOrderService wxOrderService;
	
	@GetMapping()
	@RequiresPermissions("xcx:wxOrder:wxOrder")
	String WxOrder(){
	    return "xcx/wxOrder/wxOrder";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("xcx:wxOrder:wxOrder")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<WxOrderDO> wxOrderList = wxOrderService.list(query);
		int total = wxOrderService.count(query);
		PageUtils pageUtils = new PageUtils(wxOrderList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("xcx:wxOrder:add")
	String add(){
	    return "xcx/wxOrder/add";
	}

	@GetMapping("/edit/{orderId}")
	@RequiresPermissions("xcx:wxOrder:edit")
	String edit(@PathVariable("orderId") Long orderId,Model model){
		WxOrderDO wxOrder = wxOrderService.get(orderId);
		model.addAttribute("wxOrder", wxOrder);
	    return "xcx/wxOrder/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("xcx:wxOrder:add")
	public R save( WxOrderDO wxOrder){
		if(wxOrderService.save(wxOrder)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("xcx:wxOrder:edit")
	public R update( WxOrderDO wxOrder){
		wxOrderService.update(wxOrder);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("xcx:wxOrder:remove")
	public R remove( Long orderId){
		if(wxOrderService.remove(orderId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("xcx:wxOrder:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] orderIds){
		wxOrderService.batchRemove(orderIds);
		return R.ok();
	}
	
}
