package com.bootdo.xcx.controller;

import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;
import com.bootdo.xcx.domain.WxCategoryDO;
import com.bootdo.xcx.service.WxCategoryService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 分类表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:54
 */
 
@Controller
@RequestMapping("/xcx/wxCategory")
public class WxCategoryController {
	@Autowired
	private WxCategoryService wxCategoryService;
	
	@GetMapping()
	@RequiresPermissions("xcx:wxCategory:wxCategory")
	String WxCategory(){
	    return "xcx/wxCategory/wxCategory";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("xcx:wxCategory:wxCategory")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<WxCategoryDO> wxCategoryList = wxCategoryService.list(query);
		int total = wxCategoryService.count(query);
		PageUtils pageUtils = new PageUtils(wxCategoryList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("xcx:wxCategory:add")
	String add(){
	    return "xcx/wxCategory/add";
	}

	@GetMapping("/edit/{catId}")
	@RequiresPermissions("xcx:wxCategory:edit")
	String edit(@PathVariable("catId") Long catId,Model model){
		WxCategoryDO wxCategory = wxCategoryService.get(catId);
		model.addAttribute("wxCategory", wxCategory);
	    return "xcx/wxCategory/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("xcx:wxCategory:add")
	public R save( WxCategoryDO wxCategory){
		if(wxCategoryService.save(wxCategory)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("xcx:wxCategory:edit")
	public R update( WxCategoryDO wxCategory){
		wxCategoryService.update(wxCategory);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("xcx:wxCategory:remove")
	public R remove( Long catId){
		if(wxCategoryService.remove(catId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("xcx:wxCategory:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] catIds){
		wxCategoryService.batchRemove(catIds);
		return R.ok();
	}
	
}
