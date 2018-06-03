package com.bootdo.xcx.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 属性表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:54
 */
public class WxAttrDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//属性ID
	private Long attrId;
	//属性名称
	private String attrName;
	//属性描述
	private String attrDesc;
	//分类ID
	private Long catId;
	//属性内容
	private String attrContent;
	//属性排序
	private Integer attrSort;
	//属性类型，0输入框，1下拉框，2多选框
	private Integer attrType;
	//是否是价格属性
	private Integer isPriceAttr;
	//状态，0禁用，1启用
	private Integer status;
	//
	private Date createTime;
	//
	private Date updateTime;
	//
	private String createUser;
	//
	private String updateUser;

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
	 * 设置：属性描述
	 */
	public void setAttrDesc(String attrDesc) {
		this.attrDesc = attrDesc;
	}
	/**
	 * 获取：属性描述
	 */
	public String getAttrDesc() {
		return attrDesc;
	}
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
	 * 设置：属性内容
	 */
	public void setAttrContent(String attrContent) {
		this.attrContent = attrContent;
	}
	/**
	 * 获取：属性内容
	 */
	public String getAttrContent() {
		return attrContent;
	}
	/**
	 * 设置：属性排序
	 */
	public void setAttrSort(Integer attrSort) {
		this.attrSort = attrSort;
	}
	/**
	 * 获取：属性排序
	 */
	public Integer getAttrSort() {
		return attrSort;
	}
	/**
	 * 设置：属性类型，0输入框，1下拉框，2多选框
	 */
	public void setAttrType(Integer attrType) {
		this.attrType = attrType;
	}
	/**
	 * 获取：属性类型，0输入框，1下拉框，2多选框
	 */
	public Integer getAttrType() {
		return attrType;
	}
	/**
	 * 设置：是否是价格属性
	 */
	public void setIsPriceAttr(Integer isPriceAttr) {
		this.isPriceAttr = isPriceAttr;
	}
	/**
	 * 获取：是否是价格属性
	 */
	public Integer getIsPriceAttr() {
		return isPriceAttr;
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
