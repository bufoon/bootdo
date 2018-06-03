package com.bootdo.xcx.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



/**
 * 商品属性表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:55
 */
public class WxGoodsAttrDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//商品，属性中间表自增ID
	private Long goodAttrId;
	//属性ID
	private Long attrId;
	//商品ID
	private Long goodsId;
	//属性值
	private String attrVal;
	//属性名称
	private String attrName;
	//该属性价格
	private BigDecimal attrPrice;
	//状态，0禁用，1启用
	private Integer status;
	//属性库存
	private Integer attrStock;
	//
	private Date createTime;
	//
	private Date updateTime;
	//
	private String createUser;
	//
	private String updateUser;

	/**
	 * 设置：商品，属性中间表自增ID
	 */
	public void setGoodAttrId(Long goodAttrId) {
		this.goodAttrId = goodAttrId;
	}
	/**
	 * 获取：商品，属性中间表自增ID
	 */
	public Long getGoodAttrId() {
		return goodAttrId;
	}
	/**
	 * 设置：属性ID
	 */
	public void setAttrId(Long attrId) {
		this.attrId = attrId;
	}
	/**
	 * 获取：属性ID
	 */
	public Long getAttrId() {
		return attrId;
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
	 * 设置：属性值
	 */
	public void setAttrVal(String attrVal) {
		this.attrVal = attrVal;
	}
	/**
	 * 获取：属性值
	 */
	public String getAttrVal() {
		return attrVal;
	}
	/**
	 * 设置：属性名称
	 */
	public void setAttrName(String attrName) {
		this.attrName = attrName;
	}
	/**
	 * 获取：属性名称
	 */
	public String getAttrName() {
		return attrName;
	}
	/**
	 * 设置：该属性价格
	 */
	public void setAttrPrice(BigDecimal attrPrice) {
		this.attrPrice = attrPrice;
	}
	/**
	 * 获取：该属性价格
	 */
	public BigDecimal getAttrPrice() {
		return attrPrice;
	}
	/**
	 * 设置：状态，0禁用，1启用
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态，0禁用，1启用
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：属性库存
	 */
	public void setAttrStock(Integer attrStock) {
		this.attrStock = attrStock;
	}
	/**
	 * 获取：属性库存
	 */
	public Integer getAttrStock() {
		return attrStock;
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
	/**
	 * 设置：
	 */
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	/**
	 * 获取：
	 */
	public String getCreateUser() {
		return createUser;
	}
	/**
	 * 设置：
	 */
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	/**
	 * 获取：
	 */
	public String getUpdateUser() {
		return updateUser;
	}
}
