package com.training.org;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainApp 
{
	public static void main(String[] args) {

        List<Employee> employees = EmployeeDao.getAllEmployees();

        // 1. Filter high salary employees (>50000)
        employees.stream()
            .filter(e -> e.getSalary() >= 50000)
            .forEach(e -> System.out.println(e.getName()));

        //  2. Total salary
        double totalSalary = employees.stream()
            .map(Employee::getSalary)
            .reduce(0.0, Double::sum);

        System.out.println("Total Salary: " + totalSalary);

        //  3. Group by department
        Map<String, List<Employee>> deptMap = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDepartment));

        deptMap.forEach((dept, empList) ->
            System.out.println(dept + " -> " + empList.size())
        );

        //  4. Highest paid employee
        employees.stream()
            .max(Comparator.comparing(Employee::getSalary))
            .ifPresent(e -> System.out.println("Top: " + e.getName()));

        //  5. Sort employees by salary
        employees.stream()
            .sorted(Comparator.comparing(Employee::getSalary).reversed())
            .forEach(e -> System.out.println(e.getSalary()));
    }
}
