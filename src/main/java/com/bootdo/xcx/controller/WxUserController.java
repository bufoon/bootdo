package com.bootdo.xcx.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bootdo.xcx.domain.WxUserDO;
import com.bootdo.xcx.service.WxUserService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 用户表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-06-02 22:30:17
 */
 
@Controller
@RequestMapping("/xcx/wxUser")
public class WxUserController {
	@Autowired
	private WxUserService wxUserService;
	
	@GetMapping()
	@RequiresPermissions("xcx:wxUser:wxUser")
	String WxUser(){
	    return "xcx/wxUser/wxUser";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("xcx:wxUser:wxUser")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<WxUserDO> wxUserList = wxUserService.list(query);
		int total = wxUserService.count(query);
		PageUtils pageUtils = new PageUtils(wxUserList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("xcx:wxUser:add")
	String add(){
	    return "xcx/wxUser/add";
	}

	@GetMapping("/edit/{userId}")
	@RequiresPermissions("xcx:wxUser:edit")
	String edit(@PathVariable("userId") Long userId,Model model){
		WxUserDO wxUser = wxUserService.get(userId);
		model.addAttribute("wxUser", wxUser);
	    return "xcx/wxUser/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("xcx:wxUser:add")
	public R save( WxUserDO wxUser){
		if(wxUserService.save(wxUser)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("xcx:wxUser:edit")
	public R update( WxUserDO wxUser){
		wxUserService.update(wxUser);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("xcx:wxUser:remove")
	public R remove( Long userId){
		if(wxUserService.remove(userId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("xcx:wxUser:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] userIds){
		wxUserService.batchRemove(userIds);
		return R.ok();
	}
	
}
