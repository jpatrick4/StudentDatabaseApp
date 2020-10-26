package com.example.StudentMgmtApp2;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses ="";
	private int tuitionbalance = 0;
	// static variables belong to class, not object instance
	private static int courseCost = 600;
	private static int id = 1000;

	// constructor: prompt user to enter student name and year
	public Student() {
		Scanner scan = new Scanner(System.in);
		System.out.print("\nEnter student first name: ");
		this.firstName = scan.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName = scan.nextLine();
		
		
		System.out.println("\n1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior ");
		System.out.print("Enter grade year: ");
		this.gradeYear = scan.nextInt();
		
		setStudentID();
	}
	// generate a student ID
	private void setStudentID() {
		// gradeYear + id
		id++;
		studentID = gradeYear + "" + id;
	}
	
	// enroll in courses
	public void enroll() {
		// use a loop, go around loop until user hits 0
		do
		{
			System.out.print("Enter course to enroll in (enter Q to quit): ");
			Scanner scan = new Scanner(System.in);
			String course = scan.nextLine();
			if(!course.equalsIgnoreCase("Q")) {
				// add courses
				courses += "\n" + course;
				// increase tuition balance by course cost
				tuitionbalance += courseCost;
			}
			// if course = 'Q' or 'q', break out of loop
			else { 
				break ;
			}
		}	 while(1 != 0);
		
		
			
	}
	// view courses
	public String viewCourses(){
		return courses;
	}
	// view balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionbalance);
	}
	
	// pay tuition
	public void payTuition() {
		System.out.println("\nBalance: $" + tuitionbalance);
		System.out.println("\nWelcome to tuition pay section!");
		System.out.println("Enter amount to pay($): ");
		Scanner scan = new Scanner(System.in);
		int amt = scan.nextInt();
		tuitionbalance -= amt;
		System.out.print("\nThank you for you payment of $" + amt + '.');
		viewBalance();
		
	}
	// display status
	public void showInfo() {
		System.out.println("\n\nStudent Name: " + firstName + " " + lastName + 
				"\nGrade Level: "+ gradeYear +
				"\nStudentID: " + studentID +
				"\nCoursesEnrolled: " + courses +
				"\nBalance: $" + tuitionbalance); 
	}
	
	
}
