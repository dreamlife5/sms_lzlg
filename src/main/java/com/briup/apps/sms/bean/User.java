package com.briup.apps.sms.bean;

public class User{
	private long id;
	private String name;
	private Integer age;
	private String gender;
	private String telephone;
	private long clazz_id;
	public long getClazz_id() {
		return clazz_id;
	}
	public void setClazz_id(long clazz_id) {
		this.clazz_id = clazz_id;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
}
