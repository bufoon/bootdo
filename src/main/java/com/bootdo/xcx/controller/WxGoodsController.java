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

import com.bootdo.xcx.domain.WxGoodsDO;
import com.bootdo.xcx.service.WxGoodsService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;

/**
 * 商品表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:55
 */
 
@Controller
@RequestMapping("/xcx/wxGoods")
public class WxGoodsController {
	@Autowired
	private WxGoodsService wxGoodsService;
	
	@GetMapping()
	@RequiresPermissions("xcx:wxGoods:wxGoods")
	String WxGoods(){
	    return "xcx/wxGoods/wxGoods";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("xcx:wxGoods:wxGoods")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<WxGoodsDO> wxGoodsList = wxGoodsService.list(query);
		int total = wxGoodsService.count(query);
		PageUtils pageUtils = new PageUtils(wxGoodsList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("xcx:wxGoods:add")
	String add(){
	    return "xcx/wxGoods/add";
	}

	@GetMapping("/edit/{goodsId}")
	@RequiresPermissions("xcx:wxGoods:edit")
	String edit(@PathVariable("goodsId") Long goodsId,Model model){
		WxGoodsDO wxGoods = wxGoodsService.get(goodsId);
		model.addAttribute("wxGoods", wxGoods);
	    return "xcx/wxGoods/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("xcx:wxGoods:add")
	public R save( WxGoodsDO wxGoods){
		if(wxGoodsService.save(wxGoods)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("xcx:wxGoods:edit")
	public R update( WxGoodsDO wxGoods){
		wxGoodsService.update(wxGoods);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("xcx:wxGoods:remove")
	public R remove( Long goodsId){
		if(wxGoodsService.remove(goodsId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("xcx:wxGoods:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] goodsIds){
		wxGoodsService.batchRemove(goodsIds);
		return R.ok();
	}
	
}
