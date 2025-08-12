package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student")
public class Student {

	@Value("${id}")
	 private int studentId;
	 
	@Value("${name}")
	 private String name;
	 
	 @Autowired
	 private Address addr;
	 
	public Student() {
		System.out.println("student object created..");
	}
	

	public Student(int studentId, String name, Address addr) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.addr = addr;
	}



	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	


	public Address getAddr() {
		return addr;
	}


	public void setAddr(Address addr) {
		this.addr = addr;
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", addr=" + addr + "]";
	}
	
}