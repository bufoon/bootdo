package com.bootdo.xcx.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



/**
 * 订单商品表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:55
 */
public class WxOrderGoodsDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//主键ID
	private Long id;
	//订单ID
	private Long orderId;
	//商品ID
	private Long goodsId;
	//商品价格
	private BigDecimal price;
	//商品数量
	private Integer goodsNum;
	//商品属性ID
	private Long goodAttrId;
	//备注
	private String remarks;
	//
	private Date createTime;
	//
	private Date updateTime;

	/**
	 * 设置：主键ID
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：主键ID
	 */
	public Long getId() {
		return id;
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
	 * 设置：商品价格
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	/**
	 * 获取：商品价格
	 */
	public BigDecimal getPrice() {
		return price;
	}
	/**
	 * 设置：商品数量
	 */
	public void setGoodsNum(Integer goodsNum) {
		this.goodsNum = goodsNum;
	}
	/**
	 * 获取：商品数量
	 */
	public Integer getGoodsNum() {
		return goodsNum;
	}
	/**
	 * 设置：商品属性ID
	 */
	public void setGoodAttrId(Long goodAttrId) {
		this.goodAttrId = goodAttrId;
	}
	/**
	 * 获取：商品属性ID
	 */
	public Long getGoodAttrId() {
		return goodAttrId;
	}
	/**
	 * 设置：备注
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	/**
	 * 获取：备注
	 */
	public String getRemarks() {
		return remarks;
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
