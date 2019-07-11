package com.briup.apps.sms.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.briup.apps.sms.bean.College;
import com.briup.apps.sms.dao.CollegeDao;
import com.briup.apps.sms.service.CollegeService;
/**
 *学院业务逻辑处理的实现类 
 **/
@Service
public class CollegeServiceImpl implements CollegeService{
     //依赖注入，实例化Collegerdao并且赋值给Collegedao这个变量
	@Resource
	private CollegeDao Collegedao;
	@Override
	public List<College> selectAll(){
	return Collegedao.selectAll();
	}
	@Override
	public void saveOrUpdate(College college) throws Exception{
		if(college.getId()==null) {
			Collegedao.insert(college);
		}else {
			Collegedao.update(college);
		}
	}
}