package com.bootdo.xcx.controller;

import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;
import com.bootdo.xcx.domain.WxAttrDO;
import com.bootdo.xcx.service.WxAttrService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 属性表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:54
 */
 
@Controller
@RequestMapping("/xcx/wxAttr")
public class WxAttrController {
	@Autowired
	private WxAttrService wxAttrService;
	
	@GetMapping()
	@RequiresPermissions("xcx:wxAttr:wxAttr")
	String WxAttr(){
	    return "xcx/wxAttr/wxAttr";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("xcx:wxAttr:wxAttr")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<WxAttrDO> wxAttrList = wxAttrService.list(query);
		int total = wxAttrService.count(query);
		PageUtils pageUtils = new PageUtils(wxAttrList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("xcx:wxAttr:add")
	String add(){
	    return "xcx/wxAttr/add";
	}

	@GetMapping("/edit/{attrId}")
	@RequiresPermissions("xcx:wxAttr:edit")
	String edit(@PathVariable("attrId") Long attrId,Model model){
		WxAttrDO wxAttr = wxAttrService.get(attrId);
		model.addAttribute("wxAttr", wxAttr);
	    return "xcx/wxAttr/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("xcx:wxAttr:add")
	public R save( WxAttrDO wxAttr){
		if(wxAttrService.save(wxAttr)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("xcx:wxAttr:edit")
	public R update( WxAttrDO wxAttr){
		wxAttrService.update(wxAttr);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("xcx:wxAttr:remove")
	public R remove( Long attrId){
		if(wxAttrService.remove(attrId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("xcx:wxAttr:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] attrIds){
		wxAttrService.batchRemove(attrIds);
		return R.ok();
	}
	
}
