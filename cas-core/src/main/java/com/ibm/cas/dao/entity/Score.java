package com.ibm.cas.dao.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TP_SCORE")
@SuppressWarnings("serial")
public class Score implements Serializable {

	@Id
	@GeneratedValue
	private int id;

	@Column(nullable = false, name = "STUDENTID")
	private int studentID;

	@Column(nullable = false, name = "SUBJECTNAME")
	private String subjectName;

	@Column(nullable = false, name = "EXAMTIME")
	private Date examTime;

	@Column(nullable = false, name = "SCORE")
	private float score;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public Date getExamTime() {
		return examTime;
	}

	public void setExamTime(Date examTime) {
		this.examTime = examTime;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

}
