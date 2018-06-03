package com.bootdo.xcx.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * 分类表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:54
 */
public class WxCategoryDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//分类ID
	private Long catId;
	//分类名称
	private String catName;
	//分类图片
	private String catImg;
	//排序
	private Integer catSort;
	//状态，1启用，0禁用
	private Integer status;
	//删除标识
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

	private List<WxGoodsDO> wxGoodsDOList = new ArrayList<>();

	/**
	 * 设置：分类ID
	 */
	public void setCatId(Long catId) {
		this.catId = catId;
	}
	/**
	 * 获取：分类ID
	 */
	public Long getCatId() {
		return catId;
	}
	/**
	 * 设置：分类名称
	 */
	public void setCatName(String catName) {
		this.catName = catName;
	}
	/**
	 * 获取：分类名称
	 */
	public String getCatName() {
		return catName;
	}
	/**
	 * 设置：分类图片
	 */
	public void setCatImg(String catImg) {
		this.catImg = catImg;
	}
	/**
	 * 获取：分类图片
	 */
	public String getCatImg() {
		return catImg;
	}
	/**
	 * 设置：排序
	 */
	public void setCatSort(Integer catSort) {
		this.catSort = catSort;
	}
	/**
	 * 获取：排序
	 */
	public Integer getCatSort() {
		return catSort;
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
	 * 设置：删除标识
	 */
	public void setDeleted(Integer deleted) {
		this.deleted = deleted;
	}
	/**
	 * 获取：删除标识
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

	public List<WxGoodsDO> getWxGoodsDOList() {
		return wxGoodsDOList;
	}

	public void setWxGoodsDOList(List<WxGoodsDO> wxGoodsDOList) {
		this.wxGoodsDOList = wxGoodsDOList;
	}
}
