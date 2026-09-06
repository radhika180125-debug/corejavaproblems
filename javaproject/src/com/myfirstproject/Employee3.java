package com.myfirstproject;

public class Employee3 {
	String employeename;
	double salary;
	String companyname;
	Employee3(String employeename,double salary,String companyname){
		this.employeename=employeename;
		this.salary=salary;
		this.companyname=companyname;
	}
	void display() {
		System.out.println("Employee name:"+employeename);
		System.out.println("Salary:"+salary);
		System.out.println("Company name:"+companyname);
	}
	public static void main(String[]args) {
		Employee3 e1 =new Employee3("ravi",300000,"tcs");
		e1.display();
	}
}
		
		

