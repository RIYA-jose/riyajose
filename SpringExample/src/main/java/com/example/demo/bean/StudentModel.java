package com.example.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Spring_Student")

public class StudentModel {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="stu_sequence")
	@SequenceGenerator(sequenceName ="springstudent",allocationSize=1,name="stu_sequence")
	private int id;
	private String name;
	private String subject;
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
	public String getSubject() {
	return subject;
	}
	public void setSubject(String subject) {
	this.subject = subject;
	}


	}


