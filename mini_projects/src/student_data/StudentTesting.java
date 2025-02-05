package student_data;

import java.util.*;
public class StudentTesting {
	
	public static void main(String[] args) {
		// Ask how many new students we want to add
		System.out.print("Enter number of new students to enroll: ");
		Scanner  scan = new Scanner(System.in);
		int numberOfStudents = scan.nextInt();
		Student[] students =  new Student[numberOfStudents];
		
		// Create n number of new students
		for (int n = 0; n < numberOfStudents; n++ ) {
			students[n] =  new Student();
			students[n].enroll();
			students[n].payTuition();
			System.out.println(students[n].toString());
		}
		
//		for (int n = 0; n < numberOfStudents; n++ ) {
//			System.out.println(students[n].toString());
//		}
	}

}
