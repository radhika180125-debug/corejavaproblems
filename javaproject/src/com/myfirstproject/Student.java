package com.myfirstproject;

public class Student {
	Integer studentid;
	String studentname;
	String gender;
	String branchname;
	String collegename;
	void displaystudentdetails() {
		System.out.println("Student id:"+studentid);
		System.out.println("Student name:"+studentname);
		System.out.println("Gender:"+gender);
		System.out.println("Branch name:"+branchname);
		System.out.println("college name:"+collegename);
	}
	public static void main(String[]args) {
		Student s1=new Student(); 
			s1.studentid=100;
			s1.studentname="radhika";
			s1.gender="female";
			s1.branchname="cse";
			s1.collegename="petw";
	
		Student s2=new Student();
			s2.studentid=200;
			s2.studentname="shiri";
			s2.gender="female";
			s2.branchname="cse";
			s2.collegename="petw";
			s1.displaystudentdetails();
			s2.displaystudentdetails();
				
			}
		}

	
			
