package com.bootdo.xcx.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



/**
 * 商品表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:55
 */
public class WxGoodsDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//商品id
	private Long goodsId;
	//分类ID
	private Long catId;
	//商品名称
	private String goodsName;
	//显示价格
	private BigDecimal price;
	//折扣
	private BigDecimal discount;
	//市场价
	private BigDecimal marketPrice;
	//商品图片
	private String goodsImg;
	//库存量
	private Integer inventory;
	//商品描述
	private String goodsDesc;
	//商品状态，0下架，1上架
	private Integer status;
	//是否删除0未删除，1已删除
	private Integer deleted;
	//备注
	private String remarks;
	//
	private String createUser;
	//
	private String updateUser;
	//
	private Date createTime;
	//
	private Date updateTime;

	/**
	 * 设置：商品id
	 */
	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}
	/**
	 * 获取：商品id
	 */
	public Long getGoodsId() {
		return goodsId;
	}

	public Long getCatId() {
		return catId;
	}

	public void setCatId(Long catId) {
		this.catId = catId;
	}

	/**
	 * 设置：商品名称
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	/**
	 * 获取：商品名称
	 */
	public String getGoodsName() {
		return goodsName;
	}
	/**
	 * 设置：显示价格
	 */
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	/**
	 * 获取：显示价格
	 */
	public BigDecimal getPrice() {
		return price;
	}
	/**
	 * 设置：折扣
	 */
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}
	/**
	 * 获取：折扣
	 */
	public BigDecimal getDiscount() {
		return discount;
	}
	/**
	 * 设置：市场价
	 */
	public void setMarketPrice(BigDecimal marketPrice) {
		this.marketPrice = marketPrice;
	}
	/**
	 * 获取：市场价
	 */
	public BigDecimal getMarketPrice() {
		return marketPrice;
	}
	/**
	 * 设置：商品图片
	 */
	public void setGoodsImg(String goodsImg) {
		this.goodsImg = goodsImg;
	}
	/**
	 * 获取：商品图片
	 */
	public String getGoodsImg() {
		return goodsImg;
	}
	/**
	 * 设置：库存量
	 */
	public void setInventory(Integer inventory) {
		this.inventory = inventory;
	}
	/**
	 * 获取：库存量
	 */
	public Integer getInventory() {
		return inventory;
	}
	/**
	 * 设置：商品描述
	 */
	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}
	/**
	 * 获取：商品描述
	 */
	public String getGoodsDesc() {
		return goodsDesc;
	}
	/**
	 * 设置：商品状态，0下架，1上架
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：商品状态，0下架，1上架
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：是否删除0未删除，1已删除
	 */
	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}
	/**
	 * 获取：是否删除0未删除，1已删除
	 */
	public Integer getDeleted() {
		return deleted;
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
