package com.exe.LabWork;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
public class Teacher {
	
	@Id
	@PrimaryKeyJoinColumn
	private int id;
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Courses> course = new ArrayList<Courses>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Courses> getCourse() {
		return course;
	}
	public void setCourse(List<Courses> course) {
		this.course = course;
	}

	
}
