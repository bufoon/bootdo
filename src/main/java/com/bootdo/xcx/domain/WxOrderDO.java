package com.bootdo.xcx.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



/**
 * 订单表
 * 
 * @author bufoon
 * @email 1992lcg@163.com
 * @date 2018-04-21 23:13:55
 */
public class WxOrderDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//订单ID
	private Long orderId;
	//订单号
	private String orderNo;
	//订单价格
	private BigDecimal orderPrice;
	//订单状态：0初始，1
	private Integer orderStatus;
	//收货地址ID
	private Long deliveryId;
	//优惠券ID
	private Long couponId;
	//优惠券金额
	private BigDecimal couponAmount;
	//支付类型：1支付宝，2微信
	private Integer payType;
	//备注
	private String remarks;
	//支付时间
	private Date payTime;
	//订单完成时间
	private Date finishedTime;
	//用户ID
	private Long userId;
	//创建时间
	private Date createTime;
	//修改时间
	private Date updateTime;

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
	 * 设置：订单号
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	/**
	 * 获取：订单号
	 */
	public String getOrderNo() {
		return orderNo;
	}
	/**
	 * 设置：订单价格
	 */
	public void setOrderPrice(BigDecimal orderPrice) {
		this.orderPrice = orderPrice;
	}
	/**
	 * 获取：订单价格
	 */
	public BigDecimal getOrderPrice() {
		return orderPrice;
	}
	/**
	 * 设置：订单状态：0初始，1
	 */
	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}
	/**
	 * 获取：订单状态：0初始，1
	 */
	public Integer getOrderStatus() {
		return orderStatus;
	}
	/**
	 * 设置：收货地址ID
	 */
	public void setDeliveryId(Long deliveryId) {
		this.deliveryId = deliveryId;
	}
	/**
	 * 获取：收货地址ID
	 */
	public Long getDeliveryId() {
		return deliveryId;
	}
	/**
	 * 设置：优惠券ID
	 */
	public void setCouponId(Long couponId) {
		this.couponId = couponId;
	}
	/**
	 * 获取：优惠券ID
	 */
	public Long getCouponId() {
		return couponId;
	}
	/**
	 * 设置：优惠券金额
	 */
	public void setCouponAmount(BigDecimal couponAmount) {
		this.couponAmount = couponAmount;
	}
	/**
	 * 获取：优惠券金额
	 */
	public BigDecimal getCouponAmount() {
		return couponAmount;
	}
	/**
	 * 设置：支付类型：1支付宝，2微信
	 */
	public void setPayType(Integer payType) {
		this.payType = payType;
	}
	/**
	 * 获取：支付类型：1支付宝，2微信
	 */
	public Integer getPayType() {
		return payType;
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
	 * 设置：支付时间
	 */
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	/**
	 * 获取：支付时间
	 */
	public Date getPayTime() {
		return payTime;
	}
	/**
	 * 设置：订单完成时间
	 */
	public void setFinishedTime(Date finishedTime) {
		this.finishedTime = finishedTime;
	}
	/**
	 * 获取：订单完成时间
	 */
	public Date getFinishedTime() {
		return finishedTime;
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
