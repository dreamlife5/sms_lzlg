package com.briup.apps.sms.bean;
/**
 * 校园信息
 * */
public class College {
	private Long id;
	private String name;
	private String description;
	public void setId(Long id) {
		this.id = id;
	}
	public void setSchool_id(Long school_id) {
		School_id = school_id;
	}
	private Long School_id;
	public Long getId() {
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
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getSchool_id() {
		return School_id;
	}
	public void setSchool_id(long school_id) {
		School_id = school_id;
	}

}
