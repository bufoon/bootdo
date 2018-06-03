package com.bootdo.xcx.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.bootdo.xcx.dao.WxOrderGoodsDao;
import com.bootdo.xcx.domain.WxOrderGoodsDO;
import com.bootdo.xcx.service.WxOrderGoodsService;



@Service
public class WxOrderGoodsServiceImpl implements WxOrderGoodsService {
	@Autowired
	private WxOrderGoodsDao wxOrderGoodsDao;
	
	@Override
	public WxOrderGoodsDO get(Long id){
		return wxOrderGoodsDao.get(id);
	}
	
	@Override
	public List<WxOrderGoodsDO> list(Map<String, Object> map){
		return wxOrderGoodsDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return wxOrderGoodsDao.count(map);
	}
	
	@Override
	public int save(WxOrderGoodsDO wxOrderGoods){
		return wxOrderGoodsDao.save(wxOrderGoods);
	}
	
	@Override
	public int update(WxOrderGoodsDO wxOrderGoods){
		return wxOrderGoodsDao.update(wxOrderGoods);
	}
	
	@Override
	public int remove(Long id){
		return wxOrderGoodsDao.remove(id);
	}
	
	@Override
	public int batchRemove(Long[] ids){
		return wxOrderGoodsDao.batchRemove(ids);
	}
	
}
