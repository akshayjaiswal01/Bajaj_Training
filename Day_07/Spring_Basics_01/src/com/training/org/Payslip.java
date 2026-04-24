package com.training.org;

public class Payslip 
{
	private double basic;
	private double hra;
	private double da;
	private double deductions;
	public Payslip() {
		super();
	}
	public Payslip(double basic, double hra, double da, double deductions) {
		super();
		this.basic = basic;
		this.hra = hra;
		this.da = da;
		this.deductions = deductions;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getDa() {
		return da;
	}
	public void setDa(double da) {
		this.da = da;
	}
	public double getDeductions() {
		return deductions;
	}
	public void setDeductions(double deductions) {
		this.deductions = deductions;
	}
	
	
	public double calculateGross()
	{
		return basic+hra+da;
	}
	
	public double calculateNetSlary()
	{
		return calculateGross() - deductions;
	}
	
	@Override
	public String toString() {
		return "Payslip [basic=" + basic + ", hra=" + hra + ", da=" + da + ", deductions=" + deductions + "]";
	}
	
	
}
