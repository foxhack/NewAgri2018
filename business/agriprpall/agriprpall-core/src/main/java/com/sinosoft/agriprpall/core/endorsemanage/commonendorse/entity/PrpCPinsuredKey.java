package com.sinosoft.agriprpall.core.endorsemanage.commonendorse.entity;

import com.sinosoft.framework.core.dao.BasePKImpl;

import javax.persistence.Column;

/**
 * @author codegen@研发中心
 * @mail codegen@sinosoft.com.cn
 * @time  2017-10-21 07:12:49.316 
 * 保险关系人表主键操作对象
 */
public class PrpCPinsuredKey extends BasePKImpl{
	private static final long serialVersionUID = 1L;
	public PrpCPinsuredKey(){}
	public PrpCPinsuredKey(String policyNo,Integer serialNo){
		this.policyNo = policyNo;
		this.serialNo = serialNo;
	}
	/** 属性保单号码/保单号码 */
	@Column(name = "policyNo")
	private String policyNo ;
	/** 属性序号/序号 */
	@Column(name = "serialNo")
	private Integer serialNo ;
	/**
	 * 属性保单号码/保单号码的getter方法
	 */
	public String getPolicyNo() {
    		return policyNo;
	}
	/**
	 * 属性保单号码/保单号码的setter方法
	 */
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	} 
	/**
	 * 属性序号/序号的getter方法
	 */
	public Integer getSerialNo() {
    		return serialNo;
	}
	/**
	 * 属性序号/序号的setter方法
	 */
	public void setSerialNo(Integer serialNo) {
		this.serialNo = serialNo;
	} 
}