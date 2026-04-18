package com.training.org;

import java.util.*;

public class ZOrganization {
    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1.Add Employee");
            System.out.println("2.Display All");
            System.out.println("3.Search by Name");
            System.out.println("4.Delete by Id");
            System.out.println("5.Update Salary <30000 (+10%)");
            System.out.println("6.Sort by Name");
            System.out.println("7.Highest Salary");
            System.out.println("8.Above Average Salary");
            System.out.println("9.Total Salary");
            System.out.println("10.Exit");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("1.Normal 2.Sales 3.Wage");
                    int type = sc.nextInt();

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter Name: ");
                    String name = sc.next();
                    System.out.print("Enter Basic Salary: ");
                    double sal = sc.nextDouble();

                    if (type == 1) {
                        list.add(new Employee(id, name, sal));
                    } else if (type == 2) {
                        System.out.print("Enter Sales: ");
                        int sales = sc.nextInt();
                        list.add(new SalesEmployee(id, name, sal, sales));
                    } else {
                        System.out.print("Enter Month: ");
                        String month = sc.next();
                        System.out.print("Enter Hours: ");
                        int hrs = sc.nextInt();
                        list.add(new WageEmployee(id, name, sal, month, hrs));
                    }

                    System.out.println("Added!");
                    break;

                case 2:
                    list.forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("Enter Name: ");
                    String search = sc.next();
                    list.stream()
                        .filter(e -> e.getName().equalsIgnoreCase(search))
                        .forEach(System.out::println);
                    break;

                case 4:
                    System.out.print("Enter ID: ");
                    int did = sc.nextInt();
                    list.removeIf(e -> e.getEmpId() == did);
                    System.out.println("Deleted if found");
                    break;

                case 5:
                    for (Employee e : list) {
                        if (e.getBasicSalary() < 30000) {
                            e.setBasicSalary(e.getBasicSalary() * 1.10);
                        }
                    }
                    System.out.println("Updated!");
                    break;

                case 6:
                    list.sort(Comparator.comparing(Employee::getName));
                    list.forEach(System.out::println);
                    break;

                case 7:
                    list.stream()
                        .max(Comparator.comparing(Employee::calculateSalary))
                        .ifPresent(System.out::println);
                    break;

                case 8:
                    double avg = list.stream()
                            .mapToDouble(Employee::calculateSalary)
                            .average().orElse(0);

                    System.out.println("Avg: " + avg);

                    list.stream()
                        .filter(e -> e.calculateSalary() > avg)
                        .forEach(System.out::println);
                    break;

                case 9:
                    double total = list.stream()
                            .mapToDouble(Employee::calculateSalary)
                            .sum();

                    System.out.println("Total Salary: " + total);
                    break;

                case 10:
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid");
            }

        } while (choice != 10);
    }
}