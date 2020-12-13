package com.swarnava.testapp.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	private String roll;
	private String fname;
	private String lname;
	private int age;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Student(String roll, String fname, String lname, int age) {
		super();
		this.roll = roll;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}


	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
