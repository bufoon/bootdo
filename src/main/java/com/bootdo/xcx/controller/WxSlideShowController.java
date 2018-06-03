package com.bootdo.xcx.controller;

import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;
import com.bootdo.xcx.domain.WxSlideShowDO;
import com.bootdo.xcx.service.WxSlideShowService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 轮播图表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:55
 */
 
@Controller
@RequestMapping("/xcx/wxSlideShow")
public class WxSlideShowController {
	@Autowired
	private WxSlideShowService wxSlideShowService;
	
	@GetMapping()
	@RequiresPermissions("xcx:wxSlideShow:wxSlideShow")
	String WxSlideShow(){
	    return "xcx/wxSlideShow/wxSlideShow";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("xcx:wxSlideShow:wxSlideShow")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<WxSlideShowDO> wxSlideShowList = wxSlideShowService.list(query);
		int total = wxSlideShowService.count(query);
		PageUtils pageUtils = new PageUtils(wxSlideShowList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("xcx:wxSlideShow:add")
	String add(){
	    return "xcx/wxSlideShow/add";
	}

	@GetMapping("/edit/{slideShowId}")
	@RequiresPermissions("xcx:wxSlideShow:edit")
	String edit(@PathVariable("slideShowId") Long slideShowId,Model model){
		WxSlideShowDO wxSlideShow = wxSlideShowService.get(slideShowId);
		model.addAttribute("wxSlideShow", wxSlideShow);
	    return "xcx/wxSlideShow/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("xcx:wxSlideShow:add")
	public R save( WxSlideShowDO wxSlideShow){
		if(wxSlideShowService.save(wxSlideShow)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("xcx:wxSlideShow:edit")
	public R update( WxSlideShowDO wxSlideShow){
		wxSlideShowService.update(wxSlideShow);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("xcx:wxSlideShow:remove")
	public R remove( Long slideShowId){
		if(wxSlideShowService.remove(slideShowId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("xcx:wxSlideShow:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] slideShowIds){
		wxSlideShowService.batchRemove(slideShowIds);
		return R.ok();
	}
	
}
