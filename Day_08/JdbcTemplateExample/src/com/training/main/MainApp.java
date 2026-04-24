package com.training.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.dao.StudentJDBCTemplate;
import com.training.entity.Student;

public class MainApp {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        StudentJDBCTemplate studentDao =
                (StudentJDBCTemplate) context.getBean("studentDao");

//        System.out.println("Inserting records...");
//
//        studentDao.create("Akshay", 22);
//        studentDao.create("Rahul", 23);
//        studentDao.create("Priya", 21);
//
//        System.out.println("Records inserted successfully...");
//        
        
        System.out.println("Listing multiple records");
        
        List<Student> students = studentDao.listStudents();
        
        for(Student student: students)
        {
        	System.out.println("ID: "+student.getId());
        	System.out.println("Name: "+student.getName());
        	System.out.println("Age: "+student.getAge());
        	System.out.println();
        }
    }
}