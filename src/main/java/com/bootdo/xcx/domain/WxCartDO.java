package com.bootdo.xcx.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 购物车表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:54
 */
public class WxCartDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//购物车ID
	private Long cartId;
	//用户ID
	private Long userId;
	//商品ID
	private Long goodsId;
	//商品数量
	private Integer goodsCount;
	//商品属性ID
	private Long goodsAttrId;
	//状态，0初始，1过期，2已购买
	private Integer status;
	//创建时间
	private Date createTime;
	//修改时间
	private Date updateTime;

	/**
	 * 设置：购物车ID
	 */
	public void setCartId(Long cartId) {
		this.cartId = cartId;
	}
	/**
	 * 获取：购物车ID
	 */
	public Long getCartId() {
		return cartId;
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
	 * 设置：商品数量
	 */
	public void setGoodsCount(Integer goodsCount) {
		this.goodsCount = goodsCount;
	}
	/**
	 * 获取：商品数量
	 */
	public Integer getGoodsCount() {
		return goodsCount;
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
	 * 设置：状态，0初始，1过期，2已购买
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态，0初始，1过期，2已购买
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：修改时间
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	/**
	 * 获取：修改时间
	 */
	public Date getUpdateTime() {
		return updateTime;
	}
}
