package com.ibm.cas.dao.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Student implements Serializable {
	private int id;
	private String name;
	private String sumScore;
	private String avgScore;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSumScore() {
		return sumScore;
	}

	public void setSumScore(String sumScore) {
		this.sumScore = sumScore;
	}

	public String getAvgScore() {
		return avgScore;
	}

	public void setAvgScore(String avgScore) {
		this.avgScore = avgScore;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
