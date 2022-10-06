package com.exe.LabWork;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Courses {

	@Id
	 private int id;
	 private String course_name;
	 private String dutarion;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getDutarion() {
		return dutarion;
	}
	public void setDutarion(String dutarion) {
		this.dutarion = dutarion;
	}
	 
	 

}
