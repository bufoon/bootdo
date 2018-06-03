package com.bootdo.xcx.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 商品评论表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:55
 */
public class WxGoodsCommentDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//评论ID
	private Long commentId;
	//商品ID
	private Long goodsId;
	//用户ID
	private Long userId;
	//评论内容
	private String content;
	//评论图片地址列表，逗号分割
	private String imgUrlList;
	//订单ID
	private Long orderId;
	//商品属性ID
	private Long goodsAttrId;
	//商品得分，1-5，差评，中评，好评
	private Integer goodsScore;
	//状态，1启用，0禁用
	private Integer status;
	//
	private Date createTime;
	//
	private Date updateTime;

	/**
	 * 设置：评论ID
	 */
	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}
	/**
	 * 获取：评论ID
	 */
	public Long getCommentId() {
		return commentId;
	}
	/**
	 * 设置：商品ID
	 */
	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}
	/**
	 * 获取：商品ID
	 */
	public Long getGoodsId() {
		return goodsId;
	}
	/**
	 * 设置：用户ID
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * 获取：用户ID
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * 设置：评论内容
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * 获取：评论内容
	 */
	public String getContent() {
		return content;
	}
	/**
	 * 设置：评论图片地址列表，逗号分割
	 */
	public void setImgUrlList(String imgUrlList) {
		this.imgUrlList = imgUrlList;
	}
	/**
	 * 获取：评论图片地址列表，逗号分割
	 */
	public String getImgUrlList() {
		return imgUrlList;
	}
	/**
	 * 设置：订单ID
	 */
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	/**
	 * 获取：订单ID
	 */
	public Long getOrderId() {
		return orderId;
	}
	/**
	 * 设置：商品属性ID
	 */
	public void setGoodsAttrId(Long goodsAttrId) {
		this.goodsAttrId = goodsAttrId;
	}
	/**
	 * 获取：商品属性ID
	 */
	public Long getGoodsAttrId() {
		return goodsAttrId;
	}
	/**
	 * 设置：商品得分，1-5，差评，中评，好评
	 */
	public void setGoodsScore(Integer goodsScore) {
		this.goodsScore = goodsScore;
	}
	/**
	 * 获取：商品得分，1-5，差评，中评，好评
	 */
	public Integer getGoodsScore() {
		return goodsScore;
	}
	/**
	 * 设置：状态，1启用，0禁用
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态，1启用，0禁用
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
}
