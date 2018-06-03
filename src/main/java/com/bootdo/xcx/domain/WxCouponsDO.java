package com.bootdo.xcx.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



/**
 * 优惠券表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:54
 */
public class WxCouponsDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//优惠券ID
	private Long couponsId;
	//优惠券名称
	private String couponsName;
	//优惠券类型
	private Integer couponsType;
	//优惠券面额
	private BigDecimal couponsAmount;
	//背景图片
	private String backgroundImg;
	//优惠券描述
	private String couponsDesc;
	//最低消费
	private BigDecimal minExpense;
	//有效期开始时间
	private Date startTime;
	//有效期结束时间
	private Date endTime;
	//状态，1启用，0禁用
	private Integer status;
	//
	private Date createTime;
	//
	private Date updateTime;

	/**
	 * 设置：优惠券ID
	 */
	public void setCouponsId(Long couponsId) {
		this.couponsId = couponsId;
	}
	/**
	 * 获取：优惠券ID
	 */
	public Long getCouponsId() {
		return couponsId;
	}
	/**
	 * 设置：优惠券名称
	 */
	public void setCouponsName(String couponsName) {
		this.couponsName = couponsName;
	}
	/**
	 * 获取：优惠券名称
	 */
	public String getCouponsName() {
		return couponsName;
	}
	/**
	 * 设置：优惠券类型
	 */
	public void setCouponsType(Integer couponsType) {
		this.couponsType = couponsType;
	}
	/**
	 * 获取：优惠券类型
	 */
	public Integer getCouponsType() {
		return couponsType;
	}
	/**
	 * 设置：优惠券面额
	 */
	public void setCouponsAmount(BigDecimal couponsAmount) {
		this.couponsAmount = couponsAmount;
	}
	/**
	 * 获取：优惠券面额
	 */
	public BigDecimal getCouponsAmount() {
		return couponsAmount;
	}
	/**
	 * 设置：背景图片
	 */
	public void setBackgroundImg(String backgroundImg) {
		this.backgroundImg = backgroundImg;
	}
	/**
	 * 获取：背景图片
	 */
	public String getBackgroundImg() {
		return backgroundImg;
	}
	/**
	 * 设置：优惠券描述
	 */
	public void setCouponsDesc(String couponsDesc) {
		this.couponsDesc = couponsDesc;
	}
	/**
	 * 获取：优惠券描述
	 */
	public String getCouponsDesc() {
		return couponsDesc;
	}
	/**
	 * 设置：最低消费
	 */
	public void setMinExpense(BigDecimal minExpense) {
		this.minExpense = minExpense;
	}
	/**
	 * 获取：最低消费
	 */
	public BigDecimal getMinExpense() {
		return minExpense;
	}
	/**
	 * 设置：有效期开始时间
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	/**
	 * 获取：有效期开始时间
	 */
	public Date getStartTime() {
		return startTime;
	}
	/**
	 * 设置：有效期结束时间
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	/**
	 * 获取：有效期结束时间
	 */
	public Date getEndTime() {
		return endTime;
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
