package com.example.Test.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Student {
	@Id
	private Long studentId;
	private String firstName;
	private String lastName;
	private Long rollNo;
	private String address;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Student(Long studentId, String firstName, String lastName, Long rollNo, String address) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.rollNo = rollNo;
		this.address = address;
	}



	public Long getStudentId() {
		return studentId;
	}



	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public Long getRollNo() {
		return rollNo;
	}



	public void setRollNo(Long rollNo) {
		this.rollNo = rollNo;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", rollNo="
				+ rollNo + ", address=" + address + "]";
	}

	

}
