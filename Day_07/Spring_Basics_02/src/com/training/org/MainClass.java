package com.training.org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {

//		Resource resource=new ClassPathResource("applicationContext.xml");  
//		BeanFactory factory=new XmlBeanFactory(resource);  
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		A a=(A)context.getBean("a");  
		System.out.println(a);
		a.display();

	}
}


