package com.bootdo.xcx.controller;

import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;
import com.bootdo.xcx.domain.WxGoodsCommentDO;
import com.bootdo.xcx.service.WxGoodsCommentService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 商品评论表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:55
 */
 
@Controller
@RequestMapping("/xcx/wxGoodsComment")
public class WxGoodsCommentController {
	@Autowired
	private WxGoodsCommentService wxGoodsCommentService;
	
	@GetMapping()
	@RequiresPermissions("xcx:wxGoodsComment:wxGoodsComment")
	String WxGoodsComment(){
	    return "xcx/wxGoodsComment/wxGoodsComment";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("xcx:wxGoodsComment:wxGoodsComment")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<WxGoodsCommentDO> wxGoodsCommentList = wxGoodsCommentService.list(query);
		int total = wxGoodsCommentService.count(query);
		PageUtils pageUtils = new PageUtils(wxGoodsCommentList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	@RequiresPermissions("xcx:wxGoodsComment:add")
	String add(){
	    return "xcx/wxGoodsComment/add";
	}

	@GetMapping("/edit/{commentId}")
	@RequiresPermissions("xcx:wxGoodsComment:edit")
	String edit(@PathVariable("commentId") Long commentId,Model model){
		WxGoodsCommentDO wxGoodsComment = wxGoodsCommentService.get(commentId);
		model.addAttribute("wxGoodsComment", wxGoodsComment);
	    return "xcx/wxGoodsComment/edit";
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("xcx:wxGoodsComment:add")
	public R save( WxGoodsCommentDO wxGoodsComment){
		if(wxGoodsCommentService.save(wxGoodsComment)>0){
			return R.ok();
		}
		return R.error();
	}
	/**
	 * 修改
	 */
	@ResponseBody
	@RequestMapping("/update")
	@RequiresPermissions("xcx:wxGoodsComment:edit")
	public R update( WxGoodsCommentDO wxGoodsComment){
		wxGoodsCommentService.update(wxGoodsComment);
		return R.ok();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("xcx:wxGoodsComment:remove")
	public R remove( Long commentId){
		if(wxGoodsCommentService.remove(commentId)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("xcx:wxGoodsComment:batchRemove")
	public R remove(@RequestParam("ids[]") Long[] commentIds){
		wxGoodsCommentService.batchRemove(commentIds);
		return R.ok();
	}
	
}
