package com.training.org;

public class Teacher 
{
	private String teacherName;
	private String subject;
	private long phoneNumber;
	private String std;
	
	
	public Teacher() {
		super();
		System.out.println("Default constructor of teacher is called");
	}
	
	
	public Teacher(String teacherName, String subject, long phoneNumber, String std) {
		super();
		System.out.println("parameterized constructor of teacher is called");
		this.teacherName = teacherName;
		this.subject = subject;
		this.phoneNumber = phoneNumber;
		this.std = std;
	}
	
	
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	
	
	@Override
	public String toString() {
		return "Teacher [teacherName=" + teacherName + ", subject=" + subject + ", phoneNumber=" + phoneNumber
				+ ", std=" + std + "]";
	}
	
	
}
