package com.myfirstproject;

public class Employee {
	int employeeId;
	String employeeName;
	double salary;
	int experiance;
	char grade;
	boolean permanentStatus;
	void displayDetails() {
		System.out.println("Employee ID:"+employeeId);
		System.out.println("Employee Name:"+ employeeName);
		System.out.println("Salary:"+salary);
		System.out.println("Experiance:"+ experiance);
		System.out.println("Grade:"+grade);
		System.out.println("Permanent Status:"+ permanentStatus);
	}
	public static void main(String[]args) {
		Employee e1 = new Employee();
		e1.employeeId=101;
		e1.employeeName="radhika";
		e1.salary=30000;
		e1.experiance=5;
		e1.grade='A';
		e1.permanentStatus=true;
		Employee e2= new Employee();
		e2.employeeId=200;
		e2.employeeName="shiri";
		e2.salary=40000;
		e2.experiance=3;
		e2.grade='b';
		e2.permanentStatus=true;
		Employee e3=new Employee();
		e3.employeeId=300;
		e3.employeeName="uday";
		e3.salary=50000;
		e3.experiance=2;
		e3.grade='A';
		e3.permanentStatus=true;
		e1.displayDetails();
		e2.displayDetails();
		e3.displayDetails();
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		



	


