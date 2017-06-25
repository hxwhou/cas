package com.ibm.cas.subb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.logging.LogLevel;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.cas.service.StudentService;
import com.ibm.cas.dao.entity.Student;
import com.ibm.cas.log.LoggerContext;


@RestController
@RequestMapping("/rest/cas/v1/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/list")
	public List<Student> getStudentList() throws Exception{
		LoggerContext.recordLog("查询数据库读取Student集合", LogLevel.INFO);
		return studentService.getStudentList();
	} 

}
