package com.training.org;

import java.util.ArrayList;
import java.util.List;

public class Student 
{
	private String name;
	private String std;
	private double avgMarks;
	private List<String> subjects;
	
	public Student()
	{
		System.out.println("Default constructor of student is called");
	}
	
	

	public Student(String name, String std, double avgMarks, ArrayList<String> subjects) {
		super();
		System.out.println("Parameterized constructor of student is called");
		this.name = name;
		this.std = std;
		this.avgMarks = avgMarks;
		this.subjects = subjects;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	public double getAvgMarks() {
		return avgMarks;
	}

	public void setAvgMarks(double avgMarks) {
		this.avgMarks = avgMarks;
	}



	public List<String> getSubjects() {
		return subjects;
	}



	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", std=" + std + ", avgMarks=" + avgMarks + ", subjects=" + subjects + "]";
	}

	
	
	
	
	
	
}
