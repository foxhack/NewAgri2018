package com.sinosoft.agriprpall.core.proposalmanage.entity;

import com.sinosoft.framework.core.dao.BaseEntityImpl;

import javax.persistence.*;

/**
 * @author codegen@研发中心
 * @mail admin@sinosoft.com.cn
 * @time  2017-10-18 08:03:36.446 
 * 投保单地址信息表实体操作对象
 */
@Entity
@Table(name = "PrpTaddress")
@IdClass(PrpTaddressKey.class)
public class PrpTaddress extends BaseEntityImpl{

	private static final long serialVersionUID = 1L;
	/** 属性投保单号码/投保单号码 */
	@Id
	@Column(name = "proposalNo")
	private String proposalNo ;/** 属性地址序号/地址序号 */
	@Id
	@Column(name = "addressNo")
	private Integer addressNo ;

	/** 属性险种代码/险种代码 */
	@Column(name = "riskCode")
	private String riskCode ;

	/** 属性地址编码/地址编码 */
	@Column(name = "addressCode")
	private String addressCode ;
	/** 属性地址/地址 */
	@Column(name = "addressName")
	private String addressName ;
	/** 属性标志字段/标志字段 */
	@Column(name = "flag")
	private String flag ;
	/** 属性projectName/projectName */
	@Column(name = "projectName")
	private String projectName ;
	/** 属性市代码/市代码 */
	@Column(name = "cityCode")
	private String cityCode ;
	/** 属性cityFlag/cityFlag */
	@Column(name = "cityFlag")
	private String cityFlag ;
	/** 属性市名称/市名称 */
	@Column(name = "cityName")
	private String cityName ;
	/** 属性地区代码/地区代码 */
	@Column(name = "districtCode")
	private String districtCode ;
	/** 属性描述/描述 */
	@Column(name = "districtFlag")
	private String districtFlag ;
	/** 属性地区名称/地区名称 */
	@Column(name = "districtName")
	private String districtName ;
	/** 属性省级区划/省级区划 */
	@Column(name = "provinceCode")
	private String provinceCode ;
	/** 属性provinceFlag/provinceFlag */
	@Column(name = "provinceFlag")
	private String provinceFlag ;
	/** 属性省名称/省名称 */
	@Column(name = "provinceName")
	private String provinceName ;
	/** 属性备注/备注 */
	@Column(name = "remark")
	private String remark ;
	/**
	 * 属性投保单号码/投保单号码的getter方法
	 */
	public String getProposalNo() {
		return proposalNo;
	}
	/**
	 * 属性投保单号码/投保单号码的setter方法
	 */
	public void setProposalNo(String proposalNo) {
		this.proposalNo = proposalNo;
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
	 * 属性地址序号/地址序号的getter方法
	 */
	public Integer getAddressNo() {
		return addressNo;
	}
	/**
	 * 属性地址序号/地址序号的setter方法
	 */
	public void setAddressNo(Integer addressNo) {
		this.addressNo = addressNo;
	} 	
	/**
	 * 属性地址编码/地址编码的getter方法
	 */
	public String getAddressCode() {
		return addressCode;
	}
	/**
	 * 属性地址编码/地址编码的setter方法
	 */
	public void setAddressCode(String addressCode) {
		this.addressCode = addressCode;
	} 	
	/**
	 * 属性地址/地址的getter方法
	 */
	public String getAddressName() {
		return addressName;
	}
	/**
	 * 属性地址/地址的setter方法
	 */
	public void setAddressName(String addressName) {
		this.addressName = addressName;
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
	 * 属性projectName/projectName的getter方法
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * 属性projectName/projectName的setter方法
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	} 	
	/**
	 * 属性市代码/市代码的getter方法
	 */
	public String getCityCode() {
		return cityCode;
	}
	/**
	 * 属性市代码/市代码的setter方法
	 */
	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	} 	
	/**
	 * 属性cityFlag/cityFlag的getter方法
	 */
	public String getCityFlag() {
		return cityFlag;
	}
	/**
	 * 属性cityFlag/cityFlag的setter方法
	 */
	public void setCityFlag(String cityFlag) {
		this.cityFlag = cityFlag;
	} 	
	/**
	 * 属性市名称/市名称的getter方法
	 */
	public String getCityName() {
		return cityName;
	}
	/**
	 * 属性市名称/市名称的setter方法
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
	} 	
	/**
	 * 属性地区代码/地区代码的getter方法
	 */
	public String getDistrictCode() {
		return districtCode;
	}
	/**
	 * 属性地区代码/地区代码的setter方法
	 */
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	} 	
	/**
	 * 属性描述/描述的getter方法
	 */
	public String getDistrictFlag() {
		return districtFlag;
	}
	/**
	 * 属性描述/描述的setter方法
	 */
	public void setDistrictFlag(String districtFlag) {
		this.districtFlag = districtFlag;
	} 	
	/**
	 * 属性地区名称/地区名称的getter方法
	 */
	public String getDistrictName() {
		return districtName;
	}
	/**
	 * 属性地区名称/地区名称的setter方法
	 */
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	} 	
	/**
	 * 属性省级区划/省级区划的getter方法
	 */
	public String getProvinceCode() {
		return provinceCode;
	}
	/**
	 * 属性省级区划/省级区划的setter方法
	 */
	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	} 	
	/**
	 * 属性provinceFlag/provinceFlag的getter方法
	 */
	public String getProvinceFlag() {
		return provinceFlag;
	}
	/**
	 * 属性provinceFlag/provinceFlag的setter方法
	 */
	public void setProvinceFlag(String provinceFlag) {
		this.provinceFlag = provinceFlag;
	} 	
	/**
	 * 属性省名称/省名称的getter方法
	 */
	public String getProvinceName() {
		return provinceName;
	}
	/**
	 * 属性省名称/省名称的setter方法
	 */
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	} 	
	/**
	 * 属性备注/备注的getter方法
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * 属性备注/备注的setter方法
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	} 	
}