package com.briup.apps.sms.web.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.briup.apps.sms.bean.College;
import com.briup.apps.sms.service.CollegeService;

@RestController
@RequestMapping("/college")
public class CollegeController {
	@Autowired
	private CollegeService collegeService;

	// http://localhost:8080/user/selectAll
	@GetMapping("selectAll")
	public List<College> selectAll(){
		return collegeService.selectAll();
	}
}