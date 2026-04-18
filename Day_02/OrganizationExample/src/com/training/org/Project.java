package com.training.org;

import java.util.ArrayList;
import java.util.Date;

public class Project {
    private String projectName;
    private String clientName;
    private ArrayList<String> techStack;
    private ArrayList<Employee> members;
    private Date startDate;

    public Project(String projectName, String clientName) {
        this.projectName = projectName;
        this.clientName = clientName;
        this.techStack = new ArrayList<>();
        this.members = new ArrayList<>();
        this.startDate = new Date();
    }

    public void addTechnology(String tech) {
        techStack.add(tech);
    }

    public void addEmployee(Employee emp) {
        members.add(emp);
    }

    @Override
    public String toString() {
        return "Project [Name=" + projectName + ", Client=" + clientName +
               ", Tech=" + techStack + ", Members=" + members + "]";
    }
}