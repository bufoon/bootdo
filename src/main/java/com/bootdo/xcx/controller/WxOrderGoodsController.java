package com.bootdo.xcx.controller;

import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;
import com.bootdo.xcx.domain.WxOrderGoodsDO;
import com.bootdo.xcx.service.WxOrderGoodsService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 订单商品表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:55
 */
 
@Controller
@RequestMapping("/xcx/wxOrderGoods")
public class WxOrderGoodsController {
	@Autowired
	private WxOrderGoodsService wxOrderGoodsService;
	
	@GetMapping()
	@RequiresPermissions("xcx:wxOrderGoods:wxOrderGoods")
	String WxOrderGoods(){
	    return "xcx/wxOrderGoods/wxOrderGoods";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("xcx:wxOrderGoods:wxOrderGoods")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<WxOrderGoodsDO> wxOrderGoodsList = wxOrderGoodsService.list(query);
		int total = wxOrderGoodsService.count(query);
		PageUtils pageUtils = new PageUtils(wxOrderGoodsList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("xcx:wxOrderGoods:add")
	String add(){
	    return "xcx/wxOrderGoods/add";
	}

	@GetMapping("/edit/{id}")
	@RequiresPermissions("xcx:wxOrderGoods:edit")
	String edit(@PathVariable("id") Long id,Model model){
		WxOrderGoodsDO wxOrderGoods = wxOrderGoodsService.get(id);
		model.addAttribute("wxOrderGoods", wxOrderGoods);
	    return "xcx/wxOrderGoods/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("xcx:wxOrderGoods:add")
	public R save( WxOrderGoodsDO wxOrderGoods){
		if(wxOrderGoodsService.save(wxOrderGoods)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("xcx:wxOrderGoods:edit")
	public R update( WxOrderGoodsDO wxOrderGoods){
		wxOrderGoodsService.update(wxOrderGoods);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("xcx:wxOrderGoods:remove")
	public R remove( Long id){
		if(wxOrderGoodsService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("xcx:wxOrderGoods:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] ids){
		wxOrderGoodsService.batchRemove(ids);
		return R.ok();
	}
	
}
