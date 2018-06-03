package com.bootdo.xcx.service;

import com.bootdo.xcx.domain.WxUserDO;

import java.util.List;
import java.util.Map;

/**
 * 用户表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-06-02 22:30:17
 */
public interface WxUserService {
	
	WxUserDO get(Long userId);
	
	List<WxUserDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WxUserDO wxUser);
	
	int update(WxUserDO wxUser);
	
	int remove(Long userId);
	
	int batchRemove(Long[] userIds);
}
