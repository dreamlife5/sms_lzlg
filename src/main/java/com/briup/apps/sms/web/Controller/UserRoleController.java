package com.briup.apps.sms.web.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.briup.apps.sms.bean.User;
import com.briup.apps.sms.bean.UserRole;

public class UserRoleController {
	@Autowired
	private UserRole UserRoleService;
	@GetMapping("selectAll")
	public List<UserRole> selectAll(){
		return UserRole.selectAll();
	}
}
