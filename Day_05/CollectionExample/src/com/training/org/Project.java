package com.training.org;

import java.util.ArrayList;
import java.util.Date;

public class Project 
{
	private String projectName;
	private String managerName;
	private Date date;
	private ArrayList<String> members;
	
	
	public Project(String projectName, String managerName, Date date, ArrayList<String> members) {
		super();
		this.projectName = projectName;
		this.managerName = managerName;
		this.date = date;
		this.members = members;
	}


	public String getProjectName() {
		return projectName;
	}


	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}


	public String getManagerName() {
		return managerName;
	}


	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public ArrayList<String> getMembers() {
		return members;
	}


	public void setMembers(ArrayList<String> members) {
		this.members = members;
	}


	@Override
	public String toString() {
		return "Project [projectName=" + projectName + ", managerName=" + managerName + ", date=" + date + ", members="
				+ members + "]";
	}
	
	
	
}
