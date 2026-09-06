package com.myfirstproject;

public class Student1 {
	String name;
	int age;
	Student1(String name,int age){
		this.name=name;
		this.age=age;
	}
	void display() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	public static void main(String[]args) {
		Student1 s=new Student1("radhika",21);
		s.display();
	}
}
		
