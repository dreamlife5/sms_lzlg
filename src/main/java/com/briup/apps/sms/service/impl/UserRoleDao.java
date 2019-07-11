package com.briup.apps.sms.service.impl;

import java.util.List;

import com.briup.apps.sms.bean.UserRole;

public interface UserRoleDao {
	//查询所有
    List<UserRoleDao> selectAll();
    //插入
    void insert(Object UserRoleDao);
    //更新
    void update(Object UserRoleDao);
	Object getId();
}
