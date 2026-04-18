package com.training.org;

public class SalesEmployee extends Employee {
    private int sales;
    private double commission;

    public SalesEmployee(int empId, String name, double basicSalary, int sales) {
        super(empId, name, basicSalary);
        this.sales = sales;
    }

    @Override
    public double calculateSalary() {
        if (sales < 5000)
            commission = 0.05 * sales;
        else if (sales < 10000)
            commission = 0.10 * sales;
        else if (sales < 15000)
            commission = 0.15 * sales;
        else if (sales < 50000)
            commission = 0.25 * sales;
        else
            commission = 0.50 * sales;

        return getBasicSalary() + commission;
    }

    @Override
    public String toString() {
        return super.toString() + " [Sales=" + sales + ", Commission=" + commission + "]";
    }
}