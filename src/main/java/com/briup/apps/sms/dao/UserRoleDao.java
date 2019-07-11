package com.briup.apps.sms.dao;

import java.util.List;

public interface UserRoleDao {
	//查询所有
    List<UserRoleDao> selectAll();
    //插入
    void insert(UserRoleDao UserRoleDao);
    //更新
    void update(UserRoleDao UserRoleDao);
}
