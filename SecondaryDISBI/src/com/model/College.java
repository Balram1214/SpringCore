package com.model;

public class College {
	String address;
	Student student;
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "College [address=" + address + ", student=" + student + "]";
	}
	public College(String address, Student student) {
		super();
		this.address = address;
		this.student = student;
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
