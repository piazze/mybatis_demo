package com.hxzy.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1496924812268683935L;
	private int tId;
	private String loginName;
	private String loginPwd;
	private Date createTime;
	private Date lastLoginTime;
	private int state;
	private int role;
	public int gettId() {
		return tId;
	}
	public void settId(int tId) {
		this.tId = tId;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getLoginPwd() {
		return loginPwd;
	}
	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public User(int tId, String loginName, String loginPwd, Date createTime, Date lastLoginTime, int state, int role) {
		super();
		this.tId = tId;
		this.loginName = loginName;
		this.loginPwd = loginPwd;
		this.createTime = createTime;
		this.lastLoginTime = lastLoginTime;
		this.state = state;
		this.role = role;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [tId=" + tId + ", loginName=" + loginName + ", loginPwd=" + loginPwd + ", createTime=" + createTime
				+ ", lastLoginTime=" + lastLoginTime + ", state=" + state + ", role=" + role + "]";
	}
	
	
}
