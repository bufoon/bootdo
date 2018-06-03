package com.bootdo.xcx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.xcx.dao.WxGoodsDao;
import com.bootdo.xcx.domain.WxGoodsDO;
import com.bootdo.xcx.service.WxGoodsService;



@Service
public class WxGoodsServiceImpl implements WxGoodsService {
	@Autowired
	private WxGoodsDao wxGoodsDao;
	
	@Override
	public WxGoodsDO get(Long goodsId){
		return wxGoodsDao.get(goodsId);
	}
	
	@Override
	public List<WxGoodsDO> list(Map<String, Object> map){
		return wxGoodsDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return wxGoodsDao.count(map);
	}
	
	@Override
	public int save(WxGoodsDO wxGoods){
		return wxGoodsDao.save(wxGoods);
	}
	
	@Override
	public int update(WxGoodsDO wxGoods){
		return wxGoodsDao.update(wxGoods);
	}
	
	@Override
	public int remove(Long goodsId){
		return wxGoodsDao.remove(goodsId);
	}
	
	@Override
	public int batchRemove(Long[] goodsIds){
		return wxGoodsDao.batchRemove(goodsIds);
	}
	
}
