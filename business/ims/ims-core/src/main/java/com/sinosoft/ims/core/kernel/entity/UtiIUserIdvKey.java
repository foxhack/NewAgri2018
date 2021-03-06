package com.sinosoft.ims.core.kernel.entity;

import com.sinosoft.framework.core.dao.BasePKImpl;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author codegen@研发中心
 * @mail hongzhongkai
 * @time  2016-09-23 17:19:21.110 
 * 个人用户信息表-UtiIUserIdv 主键操作类
 */
public class UtiIUserIdvKey extends BasePKImpl implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	/** 属性登录账号/ */
	@Id
	@Column(name = "userCode")
	private String userCode ;
	/**
	 * 属性登录账号/的getter方法
	 */
	public String getUserCode() {
		return userCode;
	}
	/**
	 * 属性登录账号/的setter方法
	 */
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	} 
}