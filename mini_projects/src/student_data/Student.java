package student_data;

/**
 * Author: Ronald Targbeh
 * Date: November 21, 2023
 * 
 * SCENARIO: You are a Database Administrator for a university and need to create an application 
 * to manage student enrollments and balance.
 * 
 * Your application should do the following:
 * 1. Ask the user how many new students will be added to the database
 * 2. The user should be prompted to enter the name and year of each student
 * 3. The student should have a 5-digit unique ID, with the first number being their level
 * 4. A student can enroll in the following courses:
 * 	a. History 101
 * 	b. Mathematics 101
 * 	c. English 101
 * 	d. Chemistry 101
 * 	e. Computer Science 101
 * 
 * 5. Each course cost $600 to enroll
 * 6. The student should be able to view their balance and pay the tuition
 * 7. To see the status of the student, we should see their name, ID, courses enrolled and balance
 * 
 */

import java.util.*;
public class Student {

	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses = "";
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// Constructor prompt user to enter student's name and year
	public Student() {
		//System.out.println(); // Extra blank line
		Scanner  scan = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName =  scan.nextLine();
		
		System.out.print("Enter student last name: ");
		this.lastName =  scan.nextLine();
		
		
		System.out.print("1 - Freshmen\n2 - Sophomore\n3 -  Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear =  scan.nextInt();
		
		setStudentID();
		//System.out.println(firstName + " " + lastName + " " + gradeYear + " " +studentID);
		//System.out.println(firstName + " " + lastName + " " +studentID);
	}
	
	// Generate ID
	private void setStudentID() {
		// Grade level + ID
		id++; // incrementing ID every time a new student is added
		this.studentID = gradeYear + "" + id;
	}
	
	// Enroll in courses
	public void enroll() {
		do {
			System.out.print("Enter course to enroll (Q to quit): ");
			Scanner  scan = new Scanner(System.in);
			String course = scan.nextLine();
			if (!course.equals("Q")&& !course.equals("q")) {
			//if (!course.equals("Q")) {
				courses =  courses + "\n  " + course;
				tuitionBalance += costOfCourse;
			}
			else {
				//System.out.println("BREAK!");
				break;
				}
		}while (1 != 0);
		
//		System.out.println("Enrolled In: " + courses);
//		System.out.println("Tuition Balance: " + tuitionBalance);
	}
 	
	// View balance
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	
	//  Pay tuition
	public void payTuition() {
		System.out.println();
		viewBalance();
		System.out.print("Enter your payment amount: $");
		Scanner  scan = new Scanner(System.in);
		
		int payment = scan.nextInt();
		tuitionBalance -= payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
	}
	
	// Show status
	public String toString() {
		System.out.println();
		return "Name: " + firstName + " " + lastName +
				"\nStudent ID: " + studentID +
				"\nGrade Level: " +gradeYear +
				"\nCourses Enrolled: " + courses +
				"\nTuition Balance: " + tuitionBalance;
	}

	
}
