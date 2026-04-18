package com.training.org;

import java.util.ArrayList;

public class Manager {
    private String name;
    private ArrayList<Project> projects = new ArrayList<>();

    public Manager(String name) {
        this.name = name;
    }

    public void addProject(Project p) {
        projects.add(p);
    }

    @Override
    public String toString() {
        return "Manager [Name=" + name + ", Projects=" + projects + "]";
    }
}