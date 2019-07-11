package com.briup.apps.sms.service;

import java.util.List;

import com.briup.apps.sms.bean.UserRole;

public interface UserRoleService {
    List<UserRole> selectAll();
    void insert(UserRole UserRole) throws Exception;
	void saveOrUpdate(UserRole UserRole) throws Exception;
}

