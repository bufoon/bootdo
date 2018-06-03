package com.bootdo.xcx.dao;


import com.bootdo.xcx.domain.WxGoodsCommentDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 商品评论表
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:55
 */
@Mapper
public interface WxGoodsCommentDao {

	WxGoodsCommentDO get(Long commentId);
	
	List<WxGoodsCommentDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(WxGoodsCommentDO wxGoodsComment);
	
	int update(WxGoodsCommentDO wxGoodsComment);
	
	int remove(Long comment_id);
	
	int batchRemove(Long[] commentIds);
}
