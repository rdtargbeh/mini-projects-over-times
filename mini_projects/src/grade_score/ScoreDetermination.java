package grade_score;

/**
 * Author: Ronald Doe Targbeh
 * Date: September 10, 2023
 * 
 * Description of the Problem
 * Write a game program. The computer will ask the user to input a score. The program will
 * first check if the score is valid (between 0 and 100, inclusive). If the score is not valid,
 * print out the error message and exit the program. Otherwise, display the corresponding
 * letter grade. .
 * 
 */

import java.util.*;
public class ScoreDetermination {
	
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner scan = new Scanner(System.in);
		
		// Prompt user to enter a score between 0 - 100
		System.out.print("Enter Your Score (0-100): ");
		int score = scan.nextInt();
		
		if (score < 0 || score > 100) {
			System.out.println("Error message: enter a numeric value (0-100)");
			System.exit(0);
		}
		
		// User grade
//			if (score >= 90)
//				System.out.println("Your grade is: A");
//			else if (score >= 80)
//				System.out.println("Your grade is: B");
//			else if (score >= 70)
//				System.out.println("Your grade is: C");
//			else if (score >= 60)
//				System.out.println("Your grade is: D");
//			else
//				System.out.println("Your grade is: F");

		// Converting if - else statement to switch statement
			switch(score / 10) {
				case 10: System.out.println("Your grade is: A");
				break;
				
				case 9:System.out.println("Your grade is: A"); 
				break;
				
				case 8: System.out.println("Your grade is: B");
				break;
				
				case 7: System.out.println("Your grade is: C");
				break;
				
				case 6: System.out.println("Your grade is: D");
				break;
				
				default: System.out.println("Your grade is: F");
			}
		
	}

}
