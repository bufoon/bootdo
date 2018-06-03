package com.bootdo.xcx.controller;

import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;
import com.bootdo.xcx.domain.WxCartDO;
import com.bootdo.xcx.service.WxCartService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 购物车表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:54
 */
 
@Controller
@RequestMapping("/xcx/wxCart")
public class WxCartController {
	@Autowired
	private WxCartService wxCartService;
	
	@GetMapping()
	@RequiresPermissions("xcx:wxCart:wxCart")
	String WxCart(){
	    return "xcx/wxCart/wxCart";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("xcx:wxCart:wxCart")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<WxCartDO> wxCartList = wxCartService.list(query);
		int total = wxCartService.count(query);
		PageUtils pageUtils = new PageUtils(wxCartList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("xcx:wxCart:add")
	String add(){
	    return "xcx/wxCart/add";
	}

	@GetMapping("/edit/{cartId}")
	@RequiresPermissions("xcx:wxCart:edit")
	String edit(@PathVariable("cartId") Long cartId,Model model){
		WxCartDO wxCart = wxCartService.get(cartId);
		model.addAttribute("wxCart", wxCart);
	    return "xcx/wxCart/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("xcx:wxCart:add")
	public R save( WxCartDO wxCart){
		if(wxCartService.save(wxCart)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("xcx:wxCart:edit")
	public R update( WxCartDO wxCart){
		wxCartService.update(wxCart);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("xcx:wxCart:remove")
	public R remove( Long cartId){
		if(wxCartService.remove(cartId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("xcx:wxCart:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] cartIds){
		wxCartService.batchRemove(cartIds);
		return R.ok();
	}
	
}
