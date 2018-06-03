package com.bootdo.xcx.controller;

import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;
import com.bootdo.xcx.domain.WxGoodsAttrDO;
import com.bootdo.xcx.service.WxGoodsAttrService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 商品属性表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:55
 */
 
@Controller
@RequestMapping("/xcx/wxGoodsAttr")
public class WxGoodsAttrController {
	@Autowired
	private WxGoodsAttrService wxGoodsAttrService;
	
	@GetMapping()
	@RequiresPermissions("xcx:wxGoodsAttr:wxGoodsAttr")
	String WxGoodsAttr(){
	    return "xcx/wxGoodsAttr/wxGoodsAttr";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("xcx:wxGoodsAttr:wxGoodsAttr")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<WxGoodsAttrDO> wxGoodsAttrList = wxGoodsAttrService.list(query);
		int total = wxGoodsAttrService.count(query);
		PageUtils pageUtils = new PageUtils(wxGoodsAttrList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("xcx:wxGoodsAttr:add")
	String add(){
	    return "xcx/wxGoodsAttr/add";
	}

	@GetMapping("/edit/{goodAttrId}")
	@RequiresPermissions("xcx:wxGoodsAttr:edit")
	String edit(@PathVariable("goodAttrId") Long goodAttrId,Model model){
		WxGoodsAttrDO wxGoodsAttr = wxGoodsAttrService.get(goodAttrId);
		model.addAttribute("wxGoodsAttr", wxGoodsAttr);
	    return "xcx/wxGoodsAttr/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("xcx:wxGoodsAttr:add")
	public R save( WxGoodsAttrDO wxGoodsAttr){
		if(wxGoodsAttrService.save(wxGoodsAttr)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("xcx:wxGoodsAttr:edit")
	public R update( WxGoodsAttrDO wxGoodsAttr){
		wxGoodsAttrService.update(wxGoodsAttr);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("xcx:wxGoodsAttr:remove")
	public R remove( Long goodAttrId){
		if(wxGoodsAttrService.remove(goodAttrId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("xcx:wxGoodsAttr:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] goodAttrIds){
		wxGoodsAttrService.batchRemove(goodAttrIds);
		return R.ok();
	}
	
}
