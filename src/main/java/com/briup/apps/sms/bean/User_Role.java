package com.briup.apps.sms.bean;

public class User_Role {
	private Long id;
	private Long user_id;
	private Long role_id;
	public void setId(Long id) {
		this.id = id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public void setRole_id(Long role_id) {
		this.role_id = role_id;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public long getRole_id() {
		return role_id;
	}
	public void setRole_id(long role_id) {
		this.role_id = role_id;
	}
}
