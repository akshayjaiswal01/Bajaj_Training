package com.training.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.entity.State;
import com.training.service.LocationService;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		LocationService service = (LocationService) context.getBean("locationService");

		service.addState("Maharashtra");
		service.addState("Gujarat");

		service.addCity("Pune", 1);
		service.addCity("Mumbai", 1);
		service.addCity("Ahmedabad", 2);

		List<State> list = service.getAllStatesWithCities();

		for (State s : list) {
			System.out.println(s.getName() + " -> " + s.getCities());
		}
	}
}