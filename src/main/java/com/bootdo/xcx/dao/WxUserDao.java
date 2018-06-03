package com.bootdo.xcx.dao;

import com.bootdo.xcx.domain.WxUserDO;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

/**
 * 用户表
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-06-02 22:30:17
 */
@Mapper
public interface WxUserDao {

	WxUserDO get(Long userId);
	
	List<WxUserDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WxUserDO wxUser);
	
	int update(WxUserDO wxUser);
	
	int remove(Long user_id);
	
	int batchRemove(Long[] userIds);
}
