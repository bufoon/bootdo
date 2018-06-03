package com.bootdo.xcx.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 收藏表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:54
 */
public class WxFavoriteDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//收藏ID
	private Long facoriteId;
	//商品ID
	private Long goodsId;
	//用户ID
	private Long userId;
	//备注
	private String remarks;
	//创建时间
	private Date createTime;
	//修改时间
	private Date updateTime;

	/**
	 * 设置：收藏ID
	 */
	public void setFacoriteId(Long facoriteId) {
		this.facoriteId = facoriteId;
	}
	/**
	 * 获取：收藏ID
	 */
	public Long getFacoriteId() {
		return facoriteId;
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
