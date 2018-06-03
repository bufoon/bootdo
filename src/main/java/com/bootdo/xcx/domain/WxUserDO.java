package com.bootdo.xcx.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 用户表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-06-02 22:30:17
 */
public class WxUserDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//用户ID
	private Long userId;
	//手机号码
	private String phoneNumber;
	//微信昵称
	private String nickName;
	//微信头像地址
	private String avatarUrl;
	//性别，0未知1男2女
	private Integer gender;
	//城市
	private String city;
	//省份
	private String province;
	//国家
	private String country;
	//语言
	private String language;
	//微信用户开放ID
	private String openId;
	//微信用户会话key
	private String sessionKey;
	//创建时间
	private Date createTime;
	//修改时间
	private Date updateTime;
	//备注
	private String remarks;
	//状态
	private Integer status;
	//微信用户ID
	private String unionId;

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
	 * 设置：手机号码
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * 获取：手机号码
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * 设置：微信昵称
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	/**
	 * 获取：微信昵称
	 */
	public String getNickName() {
		return nickName;
	}
	/**
	 * 设置：微信头像地址
	 */
	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
	/**
	 * 获取：微信头像地址
	 */
	public String getAvatarUrl() {
		return avatarUrl;
	}
	/**
	 * 设置：性别，0未知1男2女
	 */
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	/**
	 * 获取：性别，0未知1男2女
	 */
	public Integer getGender() {
		return gender;
	}
	/**
	 * 设置：城市
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * 获取：城市
	 */
	public String getCity() {
		return city;
	}
	/**
	 * 设置：省份
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * 获取：省份
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * 设置：国家
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * 获取：国家
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * 设置：语言
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	/**
	 * 获取：语言
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * 设置：微信用户开放ID
	 */
	public void setOpenId(String openId) {
		this.openId = openId;
	}
	/**
	 * 获取：微信用户开放ID
	 */
	public String getOpenId() {
		return openId;
	}
	/**
	 * 设置：微信用户会话key
	 */
	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}
	/**
	 * 获取：微信用户会话key
	 */
	public String getSessionKey() {
		return sessionKey;
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
	 * 设置：状态
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：状态
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：微信用户ID
	 */
	public void setUnionId(String unionId) {
		this.unionId = unionId;
	}
	/**
	 * 获取：微信用户ID
	 */
	public String getUnionId() {
		return unionId;
	}
}
