package com.briup.apps.sms.dao;
/**
 * 关于dao的设定
 * */
import java.util.List;

import com.briup.apps.sms.bean.College;

public interface Collegedao {
	//查询所有
	List<College> selectAll();
	//插入
	void insert(College college);
	//更新 
	void update(College college);
}
