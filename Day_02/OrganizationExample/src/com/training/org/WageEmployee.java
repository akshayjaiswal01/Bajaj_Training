package com.training.org;

public class WageEmployee extends Employee {
    private String monthName;
    private int workingHours;

    public WageEmployee(int empId, String name, double basicSalary, String monthName, int workingHours) {
        super(empId, name, basicSalary);
        this.monthName = monthName;
        this.workingHours = workingHours;
    }

    @Override
    public double calculateSalary() {
        int days = getWorkingDays(monthName);
        double perDay = getBasicSalary() / days;
        double perHour = perDay / 8;

        return perHour * workingHours;
    }

    private int getWorkingDays(String month) {
        switch (month.toLowerCase()) {
            case "february": return 28;
            case "april":
            case "june":
            case "september":
            case "november": return 30;
            default: return 31;
        }
    }

    @Override
    public String toString() {
        return super.toString() + " [Month=" + monthName + ", Hours=" + workingHours + "]";
    }
}