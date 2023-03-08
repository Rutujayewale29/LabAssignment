package com.example.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity//used for automic table creation
@Table(name="Student_record")//define the table name
public class Student {
    @Id//for primary key
	private int rollno;
	private String name;
	private String email;
	private int age;
	private String address;
	//constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parameterized constructor
	public Student(int rollno, String name, String email, int age, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.email = email;
		this.age = age;
		this.address = address;
	}
	//getter and setter method
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
	
}
