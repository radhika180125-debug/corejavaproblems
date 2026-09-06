package com.myfirstproject;

public class Constructor {
	String name;
	int rollnum;
	double salary;
	Constructor(String name,int rollnum,double salary){
		this.name=name;
		this.rollnum=rollnum;
		this.salary=salary;
	}
	public static void main(String[]args) {
		Constructor c=new Constructor("radhika",101,30000);
		System.out.println(c.name);
		System.out.println(c.rollnum);
		System.out.println(c.salary);
	}
}
	
	
	
