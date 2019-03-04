package com.hxzy.entity;

import java.util.Date;

/**
 * ¶©µ¥±í
 * @author Nick
 *
 */
public class Orders {
	private Integer id;
	private Integer userId;
	private String number;
	private Date createTime;
	private String note;
	
	private User user;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", userId=" + userId + ", number=" + number + ", createTime=" + createTime
				+ ", note=" + note + "]";
	}
	public Orders() {
		super();
	}
	public Orders(Integer id, Integer userId, String number, Date createTime, String note, User user) {
		super();
		this.id = id;
		this.userId = userId;
		this.number = number;
		this.createTime = createTime;
		this.note = note;
		this.user = user;
	}
	
	
}
