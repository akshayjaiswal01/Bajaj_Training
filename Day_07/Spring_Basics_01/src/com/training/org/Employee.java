package com.training.org;

import java.util.List;

public class Employee 
{
	private int empId;
	private String name;
	private double salary;
	private String phoneNumber;
	private String designation;
	private List<String> address;
	private List<String> technologies;
	private List<Project> projects;
	private List<Certification> certifications;
	private Payslip payslip;
	
	public Employee() {
		super();
		System.out.println("Default constructor of employee is called");

	}

	public Employee(int empId, String name, double salary, String phoneNumber, String designation, List<String> address,
			List<String> technologies, List<Project> projects, List<Certification> certifications, Payslip payslip) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
		this.phoneNumber = phoneNumber;
		this.designation = designation;
		this.address = address;
		this.technologies = technologies;
		this.projects = projects;
		this.certifications = certifications;
		this.payslip = payslip;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	public List<String> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(List<String> technologies) {
		this.technologies = technologies;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public List<Certification> getCertifications() {
		return certifications;
	}

	public void setCertifications(List<Certification> certifications) {
		this.certifications = certifications;
	}

	public Payslip getPayslip() {
		return payslip;
	}

	public void setPayslip(Payslip payslip) {
		this.payslip = payslip;
	}

	@Override
	public String toString() {
		return "\nEmployee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", phoneNumber=" + phoneNumber
				+ ", designation=" + designation + ",\n\naddress=" + address + ",\n\ntechnologies=" + technologies
				+ ",\n\nprojects=" + projects + ",\n\ncertifications=" + certifications + ",\n\npayslip=" + payslip + "]";
	}
	
}
