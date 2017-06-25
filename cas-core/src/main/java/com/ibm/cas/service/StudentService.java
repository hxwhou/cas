package com.ibm.cas.service;

import java.util.List;

import com.ibm.cas.dao.entity.Student;
import com.ibm.cas.exception.CASSystemException;

public interface StudentService {
	List<Student> getStudentList() throws CASSystemException;
}
