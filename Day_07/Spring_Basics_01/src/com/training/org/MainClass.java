package com.training.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {

//		Resource resource=new ClassPathResource("applicationContext.xml");  
//		BeanFactory factory=new XmlBeanFactory(resource);  
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Student student=(Student)context.getBean("studentbean");  
		System.out.println(student);  
		
		Teacher teacher = (Teacher) context.getBean("teacherbean");
		System.out.println(teacher);
		
		Employee employee = (Employee) context.getBean("employeebean");
		System.out.println(employee);

	}
}


