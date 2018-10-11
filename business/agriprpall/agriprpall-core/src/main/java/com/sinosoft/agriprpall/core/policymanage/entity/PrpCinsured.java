package com.sinosoft.agriprpall.core.policymanage.entity;

import com.sinosoft.agriprpall.core.proposalmanage.entity.PrpTinsured;
import com.sinosoft.framework.core.dao.BaseEntityImpl;
import javax.persistence.*;
import java.util.Date;

/**
 * @author codegen@研发中心
 * @mail codegen@sinosoft.com.cn
 * @time  2017-10-23 06:09:14.757
 * 保险人关系表实体操作对象
 */
@Entity
@Table(name = "PrpCinsured")
@IdClass(PrpCinsuredKey.class)
public class PrpCinsured extends BaseEntityImpl{

	private static final long serialVersionUID = 1L;
	/** 属性投保单号/投保单号 */
	@Id
	@Column(name = "policyNo")
	private String policyNo ;/** 属性序号/序号 */
	@Id
	@Column(name = "serialNo")
	private Integer serialNo ;

	/** 属性riskCode/riskCode */
	@Column(name = "riskCode")
	private String riskCode ;

	/** 属性语言/语言 */
	@Column(name = "language")
	private String language ;
	/** 属性insuredType/insuredType */
	@Column(name = "insuredType")
	private String insuredType ;
	/** 属性insuredCode/insuredCode */
	@Column(name = "insuredCode")
	private String insuredCode ;
	/** 属性insuredName/insuredName */
	@Column(name = "insuredName")
	private String insuredName ;
	/** 属性insuredAddress/insuredAddress */
	@Column(name = "insuredAddress")
	private String insuredAddress ;
	/** 属性insuredNature/insuredNature */
	@Column(name = "insuredNature")
	private String insuredNature ;
	/** 属性insuredFlag/insuredFlag */
	@Column(name = "insuredFlag")
	private String insuredFlag ;
	/** 属性insuredIdentity/insuredIdentity */
	@Column(name = "insuredIdentity")
	private String insuredIdentity ;
	/** 属性relateSerialNo/relateSerialNo */
	@Column(name = "relateSerialNo")
	private Integer relateSerialNo ;
	/** 属性identifyType/identifyType */
	@Column(name = "identifyType")
	private String identifyType ;
	/** 属性identifyNumber/identifyNumber */
	@Column(name = "identifyNumber")
	private String identifyNumber ;
	/** 属性creditlevel/creditlevel */
	@Column(name = "creditLevel")
	private String creditLevel ;
	/** 属性possessNature/possessNature */
	@Column(name = "possessNature")
	private String possessNature ;
	/** 属性businessSource/businessSource */
	@Column(name = "businessSource")
	private String businessSource ;
	/** 属性businessSort/businessSort */
	@Column(name = "businessSort")
	private String businessSort ;
	/** 属性occupationCode/occupationCode */
	@Column(name = "occupationCode")
	private String occupationCode ;
	/** 属性educationCode/educationCode */
	@Column(name = "educationCode")
	private String educationCode ;
	/** 属性bank/bank */
	@Column(name = "bank")
	private String bank ;
	/** 属性accountName/accountName */
	@Column(name = "accountName")
	private String accountName ;
	/** 属性account/account */
	@Column(name = "account")
	private String account ;
	/** 属性linkerName/linkerName */
	@Column(name = "linkerName")
	private String linkerName ;
	/** 属性邮寄地址/邮寄地址 */
	@Column(name = "postAddress")
	private String postAddress ;
	/** 属性邮编/邮编 */
	@Column(name = "postCode")
	private String postCode ;
	/** 属性phoneNumber/phoneNumber */
	@Column(name = "phoneNumber")
	private String phoneNumber ;
	/** 属性电话/电话 */
	@Column(name = "mobile")
	private String mobile ;
	/** 属性email/email */
	@Column(name = "email")
	private String email ;
	/** 属性benefitRate/benefitRate */
	@Column(name = "benefitRate")
	private Double benefitRate ;
	/** 属性benefitFlag/benefitFlag */
	@Column(name = "benefitFlag")
	private String benefitFlag ;
	/** 属性标志字段/标志字段 */
	@Column(name = "flag")
	private String flag ;
	/** 属性occupationgrade/occupationgrade */
	@Column(name = "occupationGrade")
	private String occupationGrade ;
	/** 属性风险等级/风险等级 */
	@Column(name = "riskLevel")
	private String riskLevel ;
	/** 属性是否关注理赔审计退保等信息/是否关注理赔审计退保等信息 */
	@Column(name = "isCareClaim")
	private String isCareClaim ;
	/** 属性行业现金密集程度/行业现金密集程度 */
	@Column(name = "cashFocus")
	private String cashFocus ;
	/** 属性证件有效期限/证件有效期限 */
	@Column(name = "validPeriod3")
	private String validPeriod3 ;
	/** 属性职称/职称 */
	@Column(name = "jobTitle")
	private String jobTitle ;
	/** 属性国籍/国籍 */
	@Column(name = "nationality")
	private String nationality ;
	/** 属性营业执照/营业执照 */
	@Column(name = "businessCode")
	private String businessCode ;
	/** 属性税务登记号码/税务登记号码 */
	@Column(name = "revenueRegistNo")
	private String revenueRegistNo ;
	/** 属性营业执照到期日/营业执照到期日 */
	@Column(name = "businessValidPeriod")
	private Date businessValidPeriod ;
	/** 属性税务登记有效期/税务登记有效期 */
	@Column(name = "revenueRegistValidPeriod")
	private String revenueRegistValidPeriod ;
	/** 属性其他证件号码/其他证件号码 */
	@Column(name = "otherCodeNo")
	private String otherCodeNo ;
	/** 属性其他证件有效期/其他证件有效期 */
	@Column(name = "otherCodeValidPeriod")
	private String otherCodeValidPeriod ;
	/** 属性性别/性别 */
	@Column(name = "sex")
	private String sex ;
	/** 属性wechatNo/wechatNo */
	@Column(name = "wechatNo")
	private String wechatNo ;
	/** 属性vipFlag/vipFlag */
	@Column(name = "vipFlag")
	private String vipFlag ;
	/** 属性certificateName/certificateName */
	@Column(name = "certificateName")
	private String certificateName ;
	/** 属性customerKind/customerKind */
	@Column(name = "customerKind")
	private String customerKind ;
	/** 属性insuredSort/insuredSort */
	@Column(name = "insuredSort")
	private String insuredSort ;
	/** 属性licenseStartDate/licenseStartDate */
	@Column(name = "licenseStartDate")
	private Date licenseStartDate ;
	/** 属性nationFlag/nationFlag */
	@Column(name = "nationFlag")
	private String nationFlag ;
	/** 属性benefitType/benefitType */
	@Column(name = "benefitType")
	private String benefitType ;
	/** 属性age/age */
	@Column(name = "age")
	private String age ;
	/** 属性修改人/修改人 */
	@Column(name = "update_By")
	private String update_By ;
	/** 属性修改时间/修改时间 */
	@Column(name = "update_Date")
	private Date update_Date ;
	@Column(name = "applyRealation")
	private String applyRealation;
	@Column(name = "customerSequenceNo")
	private String customerSequenceNo;
	/**
	 * 属性投保单号/投保单号的getter方法
	 */
	public String getPolicyNo() {
		return policyNo;
	}
	/**
	 * 属性投保单号/投保单号的setter方法
	 */
	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}
	/**
	 * 属性riskCode/riskCode的getter方法
	 */
	public String getRiskCode() {
		return riskCode;
	}
	/**
	 * 属性riskCode/riskCode的setter方法
	 */
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
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
	/**
	 * 属性语言/语言的getter方法
	 */
	public String getLanguage() {
		return language;
	}
	/**
	 * 属性语言/语言的setter方法
	 */
	public void setLanguage(String language) {
		this.language = language;
	}
	/**
	 * 属性insuredType/insuredType的getter方法
	 */
	public String getInsuredType() {
		return insuredType;
	}
	/**
	 * 属性insuredType/insuredType的setter方法
	 */
	public void setInsuredType(String insuredType) {
		this.insuredType = insuredType;
	}
	/**
	 * 属性insuredCode/insuredCode的getter方法
	 */
	public String getInsuredCode() {
		return insuredCode;
	}
	/**
	 * 属性insuredCode/insuredCode的setter方法
	 */
	public void setInsuredCode(String insuredCode) {
		this.insuredCode = insuredCode;
	}
	/**
	 * 属性insuredName/insuredName的getter方法
	 */
	public String getInsuredName() {
		return insuredName;
	}
	/**
	 * 属性insuredName/insuredName的setter方法
	 */
	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}
	/**
	 * 属性insuredAddress/insuredAddress的getter方法
	 */
	public String getInsuredAddress() {
		return insuredAddress;
	}
	/**
	 * 属性insuredAddress/insuredAddress的setter方法
	 */
	public void setInsuredAddress(String insuredAddress) {
		this.insuredAddress = insuredAddress;
	}
	/**
	 * 属性insuredNature/insuredNature的getter方法
	 */
	public String getInsuredNature() {
		return insuredNature;
	}
	/**
	 * 属性insuredNature/insuredNature的setter方法
	 */
	public void setInsuredNature(String insuredNature) {
		this.insuredNature = insuredNature;
	}
	/**
	 * 属性insuredFlag/insuredFlag的getter方法
	 */
	public String getInsuredFlag() {
		return insuredFlag;
	}
	/**
	 * 属性insuredFlag/insuredFlag的setter方法
	 */
	public void setInsuredFlag(String insuredFlag) {
		this.insuredFlag = insuredFlag;
	}
	/**
	 * 属性insuredIdentity/insuredIdentity的getter方法
	 */
	public String getInsuredIdentity() {
		return insuredIdentity;
	}
	/**
	 * 属性insuredIdentity/insuredIdentity的setter方法
	 */
	public void setInsuredIdentity(String insuredIdentity) {
		this.insuredIdentity = insuredIdentity;
	}

	/**
	 * 属性identifyType/identifyType的getter方法
	 */
	public String getIdentifyType() {
		return identifyType;
	}
	/**
	 * 属性identifyType/identifyType的setter方法
	 */
	public void setIdentifyType(String identifyType) {
		this.identifyType = identifyType;
	}
	/**
	 * 属性identifyNumber/identifyNumber的getter方法
	 */
	public String getIdentifyNumber() {
		return identifyNumber;
	}
	/**
	 * 属性identifyNumber/identifyNumber的setter方法
	 */
	public void setIdentifyNumber(String identifyNumber) {
		this.identifyNumber = identifyNumber;
	}

	/**
	 * 属性possessNature/possessNature的getter方法
	 */
	public String getPossessNature() {
		return possessNature;
	}
	/**
	 * 属性possessNature/possessNature的setter方法
	 */
	public void setPossessNature(String possessNature) {
		this.possessNature = possessNature;
	}
	/**
	 * 属性businessSource/businessSource的getter方法
	 */
	public String getBusinessSource() {
		return businessSource;
	}
	/**
	 * 属性businessSource/businessSource的setter方法
	 */
	public void setBusinessSource(String businessSource) {
		this.businessSource = businessSource;
	}
	/**
	 * 属性businessSort/businessSort的getter方法
	 */
	public String getBusinessSort() {
		return businessSort;
	}
	/**
	 * 属性businessSort/businessSort的setter方法
	 */
	public void setBusinessSort(String businessSort) {
		this.businessSort = businessSort;
	}
	/**
	 * 属性occupationCode/occupationCode的getter方法
	 */
	public String getOccupationCode() {
		return occupationCode;
	}
	/**
	 * 属性occupationCode/occupationCode的setter方法
	 */
	public void setOccupationCode(String occupationCode) {
		this.occupationCode = occupationCode;
	}
	/**
	 * 属性educationCode/educationCode的getter方法
	 */
	public String getEducationCode() {
		return educationCode;
	}
	/**
	 * 属性educationCode/educationCode的setter方法
	 */
	public void setEducationCode(String educationCode) {
		this.educationCode = educationCode;
	}
	/**
	 * 属性bank/bank的getter方法
	 */
	public String getBank() {
		return bank;
	}
	/**
	 * 属性bank/bank的setter方法
	 */
	public void setBank(String bank) {
		this.bank = bank;
	}
	/**
	 * 属性accountName/accountName的getter方法
	 */
	public String getAccountName() {
		return accountName;
	}
	/**
	 * 属性accountName/accountName的setter方法
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	/**
	 * 属性account/account的getter方法
	 */
	public String getAccount() {
		return account;
	}
	/**
	 * 属性account/account的setter方法
	 */
	public void setAccount(String account) {
		this.account = account;
	}
	/**
	 * 属性linkerName/linkerName的getter方法
	 */
	public String getLinkerName() {
		return linkerName;
	}
	/**
	 * 属性linkerName/linkerName的setter方法
	 */
	public void setLinkerName(String linkerName) {
		this.linkerName = linkerName;
	}
	/**
	 * 属性邮寄地址/邮寄地址的getter方法
	 */
	public String getPostAddress() {
		return postAddress;
	}
	/**
	 * 属性邮寄地址/邮寄地址的setter方法
	 */
	public void setPostAddress(String postAddress) {
		this.postAddress = postAddress;
	}
	/**
	 * 属性邮编/邮编的getter方法
	 */
	public String getPostCode() {
		return postCode;
	}
	/**
	 * 属性邮编/邮编的setter方法
	 */
	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}
	/**
	 * 属性phoneNumber/phoneNumber的getter方法
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * 属性phoneNumber/phoneNumber的setter方法
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * 属性电话/电话的getter方法
	 */
	public String getMobile() {
		return mobile;
	}
	/**
	 * 属性电话/电话的setter方法
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	/**
	 * 属性email/email的getter方法
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * 属性email/email的setter方法
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * 属性benefitRate/benefitRate的getter方法
	 */
	public Double getBenefitRate() {
		return benefitRate;
	}
	/**
	 * 属性benefitRate/benefitRate的setter方法
	 */
	public void setBenefitRate(Double benefitRate) {
		this.benefitRate = benefitRate;
	}
	/**
	 * 属性benefitFlag/benefitFlag的getter方法
	 */
	public String getBenefitFlag() {
		return benefitFlag;
	}
	/**
	 * 属性benefitFlag/benefitFlag的setter方法
	 */
	public void setBenefitFlag(String benefitFlag) {
		this.benefitFlag = benefitFlag;
	}
	/**
	 * 属性标志字段/标志字段的getter方法
	 */
	public String getFlag() {
		return flag;
	}
	/**
	 * 属性标志字段/标志字段的setter方法
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}

	/**
	 * 属性风险等级/风险等级的getter方法
	 */
	public String getRiskLevel() {
		return riskLevel;
	}
	/**
	 * 属性风险等级/风险等级的setter方法
	 */
	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
	}

	/**
	 * 属性行业现金密集程度/行业现金密集程度的getter方法
	 */
	public String getCashFocus() {
		return cashFocus;
	}
	/**
	 * 属性行业现金密集程度/行业现金密集程度的setter方法
	 */
	public void setCashFocus(String cashFocus) {
		this.cashFocus = cashFocus;
	}

	/**
	 * 属性国籍/国籍的getter方法
	 */
	public String getNationality() {
		return nationality;
	}
	/**
	 * 属性国籍/国籍的setter方法
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	/**
	 * 属性营业执照/营业执照的getter方法
	 */
	public String getBusinessCode() {
		return businessCode;
	}
	/**
	 * 属性营业执照/营业执照的setter方法
	 */
	public void setBusinessCode(String businessCode) {
		this.businessCode = businessCode;
	}

	public Integer getRelateSerialNo() {
		return relateSerialNo;
	}

	public void setRelateSerialNo(Integer relateSerialNo) {
		this.relateSerialNo = relateSerialNo;
	}

	public String getCreditLevel() {
		return creditLevel;
	}

	public void setCreditLevel(String creditLevel) {
		this.creditLevel = creditLevel;
	}

	public String getOccupationGrade() {
		return occupationGrade;
	}

	public void setOccupationGrade(String occupationGrade) {
		this.occupationGrade = occupationGrade;
	}

	public String getIsCareClaim() {
		return isCareClaim;
	}

	public void setIsCareClaim(String isCareClaim) {
		this.isCareClaim = isCareClaim;
	}

	public String getValidPeriod3() {
		return validPeriod3;
	}

	public void setValidPeriod3(String validPeriod3) {
		this.validPeriod3 = validPeriod3;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getRevenueRegistNo() {
		return revenueRegistNo;
	}

	public void setRevenueRegistNo(String revenueRegistNo) {
		this.revenueRegistNo = revenueRegistNo;
	}

	public Date getBusinessValidPeriod() {
		return businessValidPeriod;
	}

	public void setBusinessValidPeriod(Date businessValidPeriod) {
		this.businessValidPeriod = businessValidPeriod;
	}

	public String getRevenueRegistValidPeriod() {
		return revenueRegistValidPeriod;
	}

	public void setRevenueRegistValidPeriod(String revenueRegistValidPeriod) {
		this.revenueRegistValidPeriod = revenueRegistValidPeriod;
	}

	public String getOtherCodeNo() {
		return otherCodeNo;
	}

	public void setOtherCodeNo(String otherCodeNo) {
		this.otherCodeNo = otherCodeNo;
	}

	public String getOtherCodeValidPeriod() {
		return otherCodeValidPeriod;
	}

	public void setOtherCodeValidPeriod(String otherCodeValidPeriod) {
		this.otherCodeValidPeriod = otherCodeValidPeriod;
	}

	/**
	 * 属性性别/性别的getter方法
	 */
	public String getSex() {
		return sex;
	}
	/**
	 * 属性性别/性别的setter方法
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}
	/**
	 * 属性wechatNo/wechatNo的getter方法
	 */
	public String getWechatNo() {
		return wechatNo;
	}
	/**
	 * 属性wechatNo/wechatNo的setter方法
	 */
	public void setWechatNo(String wechatNo) {
		this.wechatNo = wechatNo;
	}
	/**
	 * 属性vipFlag/vipFlag的getter方法
	 */
	public String getVipFlag() {
		return vipFlag;
	}
	/**
	 * 属性vipFlag/vipFlag的setter方法
	 */
	public void setVipFlag(String vipFlag) {
		this.vipFlag = vipFlag;
	}
	/**
	 * 属性certificateName/certificateName的getter方法
	 */
	public String getCertificateName() {
		return certificateName;
	}
	/**
	 * 属性certificateName/certificateName的setter方法
	 */
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
	/**
	 * 属性customerKind/customerKind的getter方法
	 */
	public String getCustomerKind() {
		return customerKind;
	}
	/**
	 * 属性customerKind/customerKind的setter方法
	 */
	public void setCustomerKind(String customerKind) {
		this.customerKind = customerKind;
	}
	/**
	 * 属性insuredSort/insuredSort的getter方法
	 */
	public String getInsuredSort() {
		return insuredSort;
	}
	/**
	 * 属性insuredSort/insuredSort的setter方法
	 */
	public void setInsuredSort(String insuredSort) {
		this.insuredSort = insuredSort;
	}
	/**
	 * 属性licenseStartDate/licenseStartDate的getter方法
	 */
	public Date getLicenseStartDate() {
		return licenseStartDate;
	}
	/**
	 * 属性licenseStartDate/licenseStartDate的setter方法
	 */
	public void setLicenseStartDate(Date licenseStartDate) {
		this.licenseStartDate = licenseStartDate;
	}
	/**
	 * 属性nationFlag/nationFlag的getter方法
	 */
	public String getNationFlag() {
		return nationFlag;
	}
	/**
	 * 属性nationFlag/nationFlag的setter方法
	 */
	public void setNationFlag(String nationFlag) {
		this.nationFlag = nationFlag;
	}
	/**
	 * 属性benefitType/benefitType的getter方法
	 */
	public String getBenefitType() {
		return benefitType;
	}
	/**
	 * 属性benefitType/benefitType的setter方法
	 */
	public void setBenefitType(String benefitType) {
		this.benefitType = benefitType;
	}
	/**
	 * 属性age/age的getter方法
	 */
	public String getAge() {
		return age;
	}
	/**
	 * 属性age/age的setter方法
	 */
	public void setAge(String age) {
		this.age = age;
	}
	/**
	 * 属性修改人/修改人的getter方法
	 */
	public String getUpdate_By() {
		return update_By;
	}
	/**
	 * 属性修改人/修改人的setter方法
	 */
	public void setUpdate_By(String update_By) {
		this.update_By = update_By;
	}
	/**
	 * 属性修改时间/修改时间的getter方法
	 */
	public Date getUpdate_Date() {
		return update_Date;
	}
	/**
	 * 属性修改时间/修改时间的setter方法
	 */
	public void setUpdate_Date(Date update_Date) {
		this.update_Date = update_Date;
	}

	public String getApplyRealation() {
		return applyRealation;
	}

	public void setApplyRealation(String applyRealation) {
		this.applyRealation = applyRealation;
	}

	public String getCustomerSequenceNo() {
		return customerSequenceNo;
	}

	public void setCustomerSequenceNo(String customerSequenceNo) {
		this.customerSequenceNo = customerSequenceNo;
	}

	/**
	 * 保险关系人表PrpTinsuredToPrpCinsured
	 */
	public void setPrpTinsuredToPrpCinsured(PrpTinsured prpTinsured){
		this.riskCode=prpTinsured.getRiskCode();
		this.serialNo=prpTinsured.getSerialNo();
		this.language=prpTinsured.getLanguage();
		this.insuredType=prpTinsured.getInsuredType();
		this.insuredCode=prpTinsured.getInsuredCode();
		this.insuredName=prpTinsured.getInsuredName();
		this.insuredAddress=prpTinsured.getInsuredAddress();
		this.insuredNature=prpTinsured.getInsuredNature();
		this.insuredFlag=prpTinsured.getInsuredFlag();
		this.insuredIdentity=prpTinsured.getInsuredIdentity();
		this.relateSerialNo=prpTinsured.getRelateSerialNo();
		this.identifyType=prpTinsured.getIdentifyType();
		this.identifyNumber=prpTinsured.getIdentifyNumber();
		this.creditLevel=prpTinsured.getCreditLevel();
		this.possessNature=prpTinsured.getPossessNature();
		this.businessSource=prpTinsured.getBusinessSource();
		this.businessSort=prpTinsured.getBusinessSort();
		this.occupationCode=prpTinsured.getOccupationCode();
		this.educationCode=prpTinsured.getEducationCode();
		this.bank=prpTinsured.getBank();
		this.accountName=prpTinsured.getAccountName();
		this.account=prpTinsured.getAccount();
		this.linkerName=prpTinsured.getLinkerName();
		this.postAddress=prpTinsured.getPostAddress();
		this.postCode=prpTinsured.getPostCode();
		this.phoneNumber=prpTinsured.getPhoneNumber();
		this.mobile=prpTinsured.getMobile();
		this.email=prpTinsured.getEmail();
		this.benefitRate=prpTinsured.getBenefitRate();
		this.benefitFlag=prpTinsured.getBenefitFlag();
		this.flag=prpTinsured.getFlag();
		this.occupationGrade=prpTinsured.getOccupationGrade();
		this.riskLevel=prpTinsured.getRiskLevel();
		this.isCareClaim=prpTinsured.getIsCareClaim();
		this.cashFocus=prpTinsured.getCashFocus();
		this.validPeriod3=prpTinsured.getValidPeriod3();
		this.jobTitle=prpTinsured.getJobTitle();
		this.nationality=prpTinsured.getNationality();
		this.businessCode=prpTinsured.getBusinessCode();
		this.revenueRegistNo=prpTinsured.getRevenueRegistNo();
		this.businessValidPeriod=prpTinsured.getBusinessValidPeriod();
		this.revenueRegistValidPeriod=prpTinsured.getRevenueRegistValidPeriod();
		this.otherCodeNo=prpTinsured.getOtherCodeNo();
		this.otherCodeValidPeriod=prpTinsured.getOtherCodeValidPeriod();
		this.sex=prpTinsured.getSex();
		this.wechatNo=prpTinsured.getWechatNo();
		this.vipFlag=prpTinsured.getVipFlag();
		this.certificateName=prpTinsured.getCertificateName();
		this.customerKind=prpTinsured.getCustomerKind();
		this.insuredSort=prpTinsured.getInsuredSort();
		this.licenseStartDate=prpTinsured.getLicenseStartDate();
		this.nationFlag=prpTinsured.getNationFlag();
		this.benefitType=prpTinsured.getBenefitType();
		this.age=prpTinsured.getAge();
		this.applyRealation=prpTinsured.getApplyRealation();
		this.customerSequenceNo=prpTinsured.getCustomerSequenceNo();
	}
}