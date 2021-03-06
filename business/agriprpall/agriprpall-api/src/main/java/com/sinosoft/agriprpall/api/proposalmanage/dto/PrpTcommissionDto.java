package com.sinosoft.agriprpall.api.proposalmanage.dto;

import java.io.Serializable;

import com.sinosoft.framework.dto.BaseRequest;
/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time  2017-11-04 09:41:15.792 
 * 手续费表Api操作对象
 */
public class PrpTcommissionDto extends BaseRequest implements Serializable{
	private static final long serialVersionUID = 1L;
	/** 属性投保单号/投保单号 */
	private String proposalNo ;		
	/** 属性agreementNo/agreementNo */
	private String agreementNo ;		
	/** 属性customerGroupCode/customerGroupCode */
	private String customerGroupCode ;		
	/** 属性costType/costType */
	private String costType ;		
	/** 属性险种代码/险种代码 */
	private String riskCode ;		
	/** 属性sumPremium/sumPremium */
	private java.lang.Double sumPremium ;		
	/** 属性costRate/costRate */
	private java.lang.Double costRate ;		
	/** 属性costRateUpper/costRateUpper */
	private java.lang.Double costRateUpper ;		
	/** 属性adjustFlag/adjustFlag */
	private String adjustFlag ;		
	/** 属性upperFlag/upperFlag */
	private String upperFlag ;		
	/** 属性auditRate/auditRate */
	private java.lang.Double auditRate ;		
	/** 属性auditFlag/auditFlag */
	private String auditFlag ;		
	/** 属性coinsRate/coinsRate */
	private java.lang.Double coinsRate ;		
	/** 属性coinsDeduct/coinsDeduct */
	private String coinsDeduct ;		
	/** 属性币别信息/币别信息 */
	private String currency ;		
	/** 属性costFee/costFee */
	private java.lang.Double costFee ;		
	/** 属性configCode/configCode */
	private String configCode ;		
	/** 属性分期偿还标志/分期偿还标志 */
	private String amortizeFlag ;		
	/** 属性clauseKindFlag/clauseKindFlag */
	private String clauseKindFlag ;		
	/** 属性remark/remark */
	private String remark ;		
	/** 属性flag/flag */
	private String flag ;		
	/** 属性insertTimeForHis/insertTimeForHis */
	private java.util.Date insertTimeForHis ;		
	/** 属性operateTimeForHis/operateTimeForHis */
	private java.util.Date operateTimeForHis ;		
	/** 属性planCode/planCode */
	private String planCode ;		
	/** 属性costFeeOrg/costFeeOrg */
	private java.lang.Double costFeeOrg ;		
	/**
	 * 属性投保单号/投保单号的getter方法
	 */
	public String getProposalNo() {
		return proposalNo;
	}
	/**
	 * 属性投保单号/投保单号的setter方法
	 */
	public void setProposalNo(String proposalNo) {
		this.proposalNo = proposalNo;
	}	
	/**
	 * 属性agreementNo/agreementNo的getter方法
	 */
	public String getAgreementNo() {
		return agreementNo;
	}
	/**
	 * 属性agreementNo/agreementNo的setter方法
	 */
	public void setAgreementNo(String agreementNo) {
		this.agreementNo = agreementNo;
	}	
	/**
	 * 属性customerGroupCode/customerGroupCode的getter方法
	 */
	public String getCustomerGroupCode() {
		return customerGroupCode;
	}
	/**
	 * 属性customerGroupCode/customerGroupCode的setter方法
	 */
	public void setCustomerGroupCode(String customerGroupCode) {
		this.customerGroupCode = customerGroupCode;
	}	
	/**
	 * 属性costType/costType的getter方法
	 */
	public String getCostType() {
		return costType;
	}
	/**
	 * 属性costType/costType的setter方法
	 */
	public void setCostType(String costType) {
		this.costType = costType;
	}	
	/**
	 * 属性险种代码/险种代码的getter方法
	 */
	public String getRiskCode() {
		return riskCode;
	}
	/**
	 * 属性险种代码/险种代码的setter方法
	 */
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}	
	/**
	 * 属性sumPremium/sumPremium的getter方法
	 */
	public java.lang.Double getSumPremium() {
		return sumPremium;
	}
	/**
	 * 属性sumPremium/sumPremium的setter方法
	 */
	public void setSumPremium(java.lang.Double sumPremium) {
		this.sumPremium = sumPremium;
	}	
	/**
	 * 属性costRate/costRate的getter方法
	 */
	public java.lang.Double getCostRate() {
		return costRate;
	}
	/**
	 * 属性costRate/costRate的setter方法
	 */
	public void setCostRate(java.lang.Double costRate) {
		this.costRate = costRate;
	}	
	/**
	 * 属性costRateUpper/costRateUpper的getter方法
	 */
	public java.lang.Double getCostRateUpper() {
		return costRateUpper;
	}
	/**
	 * 属性costRateUpper/costRateUpper的setter方法
	 */
	public void setCostRateUpper(java.lang.Double costRateUpper) {
		this.costRateUpper = costRateUpper;
	}	
	/**
	 * 属性adjustFlag/adjustFlag的getter方法
	 */
	public String getAdjustFlag() {
		return adjustFlag;
	}
	/**
	 * 属性adjustFlag/adjustFlag的setter方法
	 */
	public void setAdjustFlag(String adjustFlag) {
		this.adjustFlag = adjustFlag;
	}	
	/**
	 * 属性upperFlag/upperFlag的getter方法
	 */
	public String getUpperFlag() {
		return upperFlag;
	}
	/**
	 * 属性upperFlag/upperFlag的setter方法
	 */
	public void setUpperFlag(String upperFlag) {
		this.upperFlag = upperFlag;
	}	
	/**
	 * 属性auditRate/auditRate的getter方法
	 */
	public java.lang.Double getAuditRate() {
		return auditRate;
	}
	/**
	 * 属性auditRate/auditRate的setter方法
	 */
	public void setAuditRate(java.lang.Double auditRate) {
		this.auditRate = auditRate;
	}	
	/**
	 * 属性auditFlag/auditFlag的getter方法
	 */
	public String getAuditFlag() {
		return auditFlag;
	}
	/**
	 * 属性auditFlag/auditFlag的setter方法
	 */
	public void setAuditFlag(String auditFlag) {
		this.auditFlag = auditFlag;
	}	
	/**
	 * 属性coinsRate/coinsRate的getter方法
	 */
	public java.lang.Double getCoinsRate() {
		return coinsRate;
	}
	/**
	 * 属性coinsRate/coinsRate的setter方法
	 */
	public void setCoinsRate(java.lang.Double coinsRate) {
		this.coinsRate = coinsRate;
	}	
	/**
	 * 属性coinsDeduct/coinsDeduct的getter方法
	 */
	public String getCoinsDeduct() {
		return coinsDeduct;
	}
	/**
	 * 属性coinsDeduct/coinsDeduct的setter方法
	 */
	public void setCoinsDeduct(String coinsDeduct) {
		this.coinsDeduct = coinsDeduct;
	}	
	/**
	 * 属性币别信息/币别信息的getter方法
	 */
	public String getCurrency() {
		return currency;
	}
	/**
	 * 属性币别信息/币别信息的setter方法
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}	
	/**
	 * 属性costFee/costFee的getter方法
	 */
	public java.lang.Double getCostFee() {
		return costFee;
	}
	/**
	 * 属性costFee/costFee的setter方法
	 */
	public void setCostFee(java.lang.Double costFee) {
		this.costFee = costFee;
	}	
	/**
	 * 属性configCode/configCode的getter方法
	 */
	public String getConfigCode() {
		return configCode;
	}
	/**
	 * 属性configCode/configCode的setter方法
	 */
	public void setConfigCode(String configCode) {
		this.configCode = configCode;
	}	
	/**
	 * 属性分期偿还标志/分期偿还标志的getter方法
	 */
	public String getAmortizeFlag() {
		return amortizeFlag;
	}
	/**
	 * 属性分期偿还标志/分期偿还标志的setter方法
	 */
	public void setAmortizeFlag(String amortizeFlag) {
		this.amortizeFlag = amortizeFlag;
	}	
	/**
	 * 属性clauseKindFlag/clauseKindFlag的getter方法
	 */
	public String getClauseKindFlag() {
		return clauseKindFlag;
	}
	/**
	 * 属性clauseKindFlag/clauseKindFlag的setter方法
	 */
	public void setClauseKindFlag(String clauseKindFlag) {
		this.clauseKindFlag = clauseKindFlag;
	}	
	/**
	 * 属性remark/remark的getter方法
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * 属性remark/remark的setter方法
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}	
	/**
	 * 属性flag/flag的getter方法
	 */
	public String getFlag() {
		return flag;
	}
	/**
	 * 属性flag/flag的setter方法
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}	
	/**
	 * 属性insertTimeForHis/insertTimeForHis的getter方法
	 */
	public java.util.Date getInsertTimeForHis() {
		return insertTimeForHis;
	}
	/**
	 * 属性insertTimeForHis/insertTimeForHis的setter方法
	 */
	public void setInsertTimeForHis(java.util.Date insertTimeForHis) {
		this.insertTimeForHis = insertTimeForHis;
	}	
	/**
	 * 属性operateTimeForHis/operateTimeForHis的getter方法
	 */
	public java.util.Date getOperateTimeForHis() {
		return operateTimeForHis;
	}
	/**
	 * 属性operateTimeForHis/operateTimeForHis的setter方法
	 */
	public void setOperateTimeForHis(java.util.Date operateTimeForHis) {
		this.operateTimeForHis = operateTimeForHis;
	}	
	/**
	 * 属性planCode/planCode的getter方法
	 */
	public String getPlanCode() {
		return planCode;
	}
	/**
	 * 属性planCode/planCode的setter方法
	 */
	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}	
	/**
	 * 属性costFeeOrg/costFeeOrg的getter方法
	 */
	public java.lang.Double getCostFeeOrg() {
		return costFeeOrg;
	}
	/**
	 * 属性costFeeOrg/costFeeOrg的setter方法
	 */
	public void setCostFeeOrg(java.lang.Double costFeeOrg) {
		this.costFeeOrg = costFeeOrg;
	}	
}
