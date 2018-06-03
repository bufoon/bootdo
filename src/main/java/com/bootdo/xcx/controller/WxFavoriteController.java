package com.bootdo.xcx.controller;

import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;
import com.bootdo.xcx.domain.WxFavoriteDO;
import com.bootdo.xcx.service.WxFavoriteService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 收藏表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:54
 */
 
@Controller
@RequestMapping("/xcx/wxFavorite")
public class WxFavoriteController {
	@Autowired
	private WxFavoriteService wxFavoriteService;
	
	@GetMapping()
	@RequiresPermissions("xcx:wxFavorite:wxFavorite")
	String WxFavorite(){
	    return "xcx/wxFavorite/wxFavorite";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("xcx:wxFavorite:wxFavorite")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<WxFavoriteDO> wxFavoriteList = wxFavoriteService.list(query);
		int total = wxFavoriteService.count(query);
		PageUtils pageUtils = new PageUtils(wxFavoriteList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("xcx:wxFavorite:add")
	String add(){
	    return "xcx/wxFavorite/add";
	}

	@GetMapping("/edit/{facoriteId}")
	@RequiresPermissions("xcx:wxFavorite:edit")
	String edit(@PathVariable("facoriteId") Long facoriteId,Model model){
		WxFavoriteDO wxFavorite = wxFavoriteService.get(facoriteId);
		model.addAttribute("wxFavorite", wxFavorite);
	    return "xcx/wxFavorite/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("xcx:wxFavorite:add")
	public R save( WxFavoriteDO wxFavorite){
		if(wxFavoriteService.save(wxFavorite)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("xcx:wxFavorite:edit")
	public R update( WxFavoriteDO wxFavorite){
		wxFavoriteService.update(wxFavorite);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("xcx:wxFavorite:remove")
	public R remove( Long facoriteId){
		if(wxFavoriteService.remove(facoriteId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("xcx:wxFavorite:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] facoriteIds){
		wxFavoriteService.batchRemove(facoriteIds);
		return R.ok();
	}
	
}
