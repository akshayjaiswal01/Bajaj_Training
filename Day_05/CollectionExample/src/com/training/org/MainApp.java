package com.training.org;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class MainApp 
{
	public static void main(String[] args) 
	{
		ArrayList<Project> listOfProjects = new ArrayList<Project>();
		
		
		ArrayList<String> members = new ArrayList<String>();
		members.add("Akshay");
		members.add("Atharv");
		members.add("Ojas");
		members.add("Sumit");
		members.add("Yash");
		
		listOfProjects.add(new Project("AI Project", "Roshan Pal", new Date(), members));
		
		Iterator itr = listOfProjects.iterator();
		
		while(itr.hasNext()){  
			   System.out.println(itr.next());  
			  } 
	}
}
