package com.training.org;

import java.util.*;

public class EnumerationExample {
    public static void main(String[] args) {
        
        Vector<String> list = new Vector<>();
        list.add("Java");
        list.add("Spring");
        list.add("Hibernate");

        
        Enumeration<String> e = list.elements();

        
        while (e.hasMoreElements()) 
        {
            String value = e.nextElement();
            System.out.println(value);
        }
    }
}