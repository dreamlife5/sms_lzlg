package com.briup.apps.sms.service.impl;

import java.util.Collection;
import java.util.List;

import com.briup.apps.sms.bean.User;
import com.briup.apps.sms.bean.UserRole;

public class UserRoleServiceImpl {
	private UserRoleDao UserRoleDao;
	
	public Collection<UserRoleDao> selectAll(){
		return UserRoleDao.selectAll();
		}
	public void saveOrUpdate(UserRoleDao userRoleDao) throws Exception{
		if(userRoleDao.getId() == null) {
			UserRoleDao.insert(UserRoleDao);
		}
		else {
			UserRoleDao.update(userRoleDao);update(UserRoleDao);
		}
	}
	private com.briup.apps.sms.service.impl.UserRoleDao update(
			com.briup.apps.sms.service.impl.UserRoleDao userRoleDao2) {
		// TODO Auto-generated method stub
		return null;
	}
}
