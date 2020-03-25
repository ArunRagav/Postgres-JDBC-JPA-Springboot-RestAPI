package com.javatakies.postgres.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class StudentEntity {

	private String name;
	private int Id;
	private String dept;
	private String grade;

	public StudentEntity() {
	}

	public StudentEntity(String name, int id, String dept, String grade) {
		super();
		this.name = name;
		Id = id;
		this.dept = dept;
		this.grade = grade;
	}

	@Column(name = "StudentName", nullable = false)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	@Column(name = "Department", nullable = false)
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Column(name = "Grade", nullable = false)
	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "studentID : " + getId() + " name: " + getName();
	}

}
