package com.bootdo.xcx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.xcx.dao.WxGoodsCommentDao;
import com.bootdo.xcx.domain.WxGoodsCommentDO;
import com.bootdo.xcx.service.WxGoodsCommentService;



@Service
public class WxGoodsCommentServiceImpl implements WxGoodsCommentService {
	@Autowired
	private WxGoodsCommentDao wxGoodsCommentDao;
	
	@Override
	public WxGoodsCommentDO get(Long commentId){
		return wxGoodsCommentDao.get(commentId);
	}
	
	@Override
	public List<WxGoodsCommentDO> list(Map<String, Object> map){
		return wxGoodsCommentDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return wxGoodsCommentDao.count(map);
	}
	
	@Override
	public int save(WxGoodsCommentDO wxGoodsComment){
		return wxGoodsCommentDao.save(wxGoodsComment);
	}
	
	@Override
	public int update(WxGoodsCommentDO wxGoodsComment){
		return wxGoodsCommentDao.update(wxGoodsComment);
	}
	
	@Override
	public int remove(Long commentId){
		return wxGoodsCommentDao.remove(commentId);
	}
	
	@Override
	public int batchRemove(Long[] commentIds){
		return wxGoodsCommentDao.batchRemove(commentIds);
	}
	
}
