package com.bootdo.xcx.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 轮播图表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:55
 */
public class WxSlideShowDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//轮播图ID
	private Long slideShowId;
	//轮播图片
	private String slideShowImg;
	//轮播图跳转地址
	private String slideShowUrl;
	//轮播图描述
	private String slideShowDesc;
	//状态，1启用，0禁用
	private Integer status;
	//排序
	private Integer sort;
	//
	private Date createTime;
	//
	private Date updateTime;

	/**
	 * 设置：轮播图ID
	 */
	public void setSlideShowId(Long slideShowId) {
		this.slideShowId = slideShowId;
	}
	/**
	 * 获取：轮播图ID
	 */
	public Long getSlideShowId() {
		return slideShowId;
	}
	/**
	 * 设置：轮播图片
	 */
	public void setSlideShowImg(String slideShowImg) {
		this.slideShowImg = slideShowImg;
	}
	/**
	 * 获取：轮播图片
	 */
	public String getSlideShowImg() {
		return slideShowImg;
	}
	/**
	 * 设置：轮播图跳转地址
	 */
	public void setSlideShowUrl(String slideShowUrl) {
		this.slideShowUrl = slideShowUrl;
	}
	/**
	 * 获取：轮播图跳转地址
	 */
	public String getSlideShowUrl() {
		return slideShowUrl;
	}
	/**
	 * 设置：轮播图描述
	 */
	public void setSlideShowDesc(String slideShowDesc) {
		this.slideShowDesc = slideShowDesc;
	}
	/**
	 * 获取：轮播图描述
	 */
	public String getSlideShowDesc() {
		return slideShowDesc;
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
	 * 设置：排序
	 */
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	/**
	 * 获取：排序
	 */
	public Integer getSort() {
		return sort;
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
