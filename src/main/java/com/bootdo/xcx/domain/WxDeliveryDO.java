package com.bootdo.xcx.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * 收货地址表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:54
 */
public class WxDeliveryDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//收获地址ID
	private Long deliveryId;
	//省份编码
	private String provinceCode;
	//省名称
	private String provinceName;
	//城市编码
	private String cityCode;
	//城市名称
	private String cityName;
	//区编码
	private String districtCode;
	//区名称
	private String districtName;
	//详细地址
	private String detailAddress;
	//用户ID
	private Long userId;
	//是否默认地址，1是，0否
	private Integer isDefault;
	//收获人名字
	private String deliveryName;
	//收获地址描述
	private String deliveryDesc;
	//收货人手机号
	private String deliveryMobile;
	//收货人手机号备用
	private String deliveryMobileStandby;
	//备注
	private String remarks;
	//
	private Date createTime;
	//
	private Date updateTime;

	/**
	 * 设置：收获地址ID
	 */
	public void setDeliveryId(Long deliveryId) {
		this.deliveryId = deliveryId;
	}
	/**
	 * 获取：收获地址ID
	 */
	public Long getDeliveryId() {
		return deliveryId;
	}
	/**
	 * 设置：省份编码
	 */
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}
	/**
	 * 获取：省份编码
	 */
	public String getProvinceCode() {
		return provinceCode;
	}
	/**
	 * 设置：省名称
	 */
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}
	/**
	 * 获取：省名称
	 */
	public String getProvinceName() {
		return provinceName;
	}
	/**
	 * 设置：城市编码
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}
	/**
	 * 获取：城市编码
	 */
	public String getCityCode() {
		return cityCode;
	}
	/**
	 * 设置：城市名称
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	/**
	 * 获取：城市名称
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * 设置：区编码
	 */
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	/**
	 * 获取：区编码
	 */
	public String getDistrictCode() {
		return districtCode;
	}
	/**
	 * 设置：区名称
	 */
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	/**
	 * 获取：区名称
	 */
	public String getDistrictName() {
		return districtName;
	}
	/**
	 * 设置：详细地址
	 */
	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}
	/**
	 * 获取：详细地址
	 */
	public String getDetailAddress() {
		return detailAddress;
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
	 * 设置：是否默认地址，1是，0否
	 */
	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}
	/**
	 * 获取：是否默认地址，1是，0否
	 */
	public Integer getIsDefault() {
		return isDefault;
	}
	/**
	 * 设置：收获人名字
	 */
	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}
	/**
	 * 获取：收获人名字
	 */
	public String getDeliveryName() {
		return deliveryName;
	}
	/**
	 * 设置：收获地址描述
	 */
	public void setDeliveryDesc(String deliveryDesc) {
		this.deliveryDesc = deliveryDesc;
	}
	/**
	 * 获取：收获地址描述
	 */
	public String getDeliveryDesc() {
		return deliveryDesc;
	}
	/**
	 * 设置：收货人手机号
	 */
	public void setDeliveryMobile(String deliveryMobile) {
		this.deliveryMobile = deliveryMobile;
	}
	/**
	 * 获取：收货人手机号
	 */
	public String getDeliveryMobile() {
		return deliveryMobile;
	}
	/**
	 * 设置：收货人手机号备用
	 */
	public void setDeliveryMobileStandby(String deliveryMobileStandby) {
		this.deliveryMobileStandby = deliveryMobileStandby;
	}
	/**
	 * 获取：收货人手机号备用
	 */
	public String getDeliveryMobileStandby() {
		return deliveryMobileStandby;
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
