package com.ibm.cas.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.cas.dao.impl.StudentDao;
import com.ibm.cas.exception.CASSystemException;
import com.ibm.cas.dao.entity.Student;
import com.ibm.cas.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public List<Student> getStudentList() throws CASSystemException {
		return studentDao.getStudentList();
	}

}
