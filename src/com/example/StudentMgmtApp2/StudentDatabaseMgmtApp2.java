package com.example.StudentMgmtApp2;

import java.util.Scanner;

/*
 * Student Database Management app
 * 
 * -Ask user how many new students will be added to database 
 * -User should be prompted to enter name and year for each student 
 * -Each student has a 5 digit unique ID with first number being grade level 
 * -Student can enroll in:
 * -History 101, Math 101, Eng 101, Chem 101, CS 101
 * -Each course costs $600
 * -Student should be able to view their balance and pay tuition
 * -For student status, we should see name,ID,courses enrolled, balance 
 * 
 */
public class StudentDatabaseMgmtApp2 {

	public static void main(String[] args) {
		// ask user how many students will be added
		System.out.println("Enter number of new students to enroll: ");
		Scanner scan = new Scanner(System.in);
		int numOfStudents = scan.nextInt();
		Student[] students = new Student[numOfStudents]; // create array of student objects
		
		// create n number of students
		for(int n = 0; n < numOfStudents; n++) {
			students[n] = new Student();
			students[n].enroll();
			students[n].payTuition();
			students[n].showInfo();
		}
		/*for(int n = 0; n < numOfStudents; n++) {
			System.out.println(students[n]);
		}*/
	}
}
