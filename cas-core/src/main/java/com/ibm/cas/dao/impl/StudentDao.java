package com.ibm.cas.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.logging.LogLevel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ibm.cas.dao.entity.Student;
import com.ibm.cas.enums.ErrorCode;
import com.ibm.cas.exception.CASSystemException;

@Repository
public class StudentDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Student> getStudentList() throws CASSystemException {
		String sql = "SELECT ID, NAME, SCORE_SUM, SCORE_AVG, AGE FROM TP_STUDENT";

		try {
			List<Student> students = jdbcTemplate.query(sql, new RowMapper<Student>() {
				@Override
				public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
					Student student = new Student();
					student.setId(rs.getInt("ID"));
					student.setAge(rs.getInt("AGE"));
					student.setName(rs.getString("NAME"));
					student.setSumScore(rs.getString("SCORE_SUM"));
					student.setAvgScore(rs.getString("SCORE_AVG"));
					return student;
				}
			});
			return students;
		} catch (Exception e) {
			throw new CASSystemException(ErrorCode.DAO, LogLevel.ERROR, e.getMessage());
		}

	}
}
