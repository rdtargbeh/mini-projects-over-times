package change;

/**
 * Program Name: Calculate the Change 
 * 		
 * Author: Ronaldo Doe Targbeh
 * Date: September 2, 2023
 * 
 * Description of the Problem:
 * Write a program that asks the user input a change between 1 and 99 cents. The program
 * then will display it in amount of quarters, dime, nickels and pennies.
 */

import java.util.*;

public class CalculateChange {

	public static void main(String[] args) {
		double numberA = 0;
		
		// Generate random number
//		double max = 99.0;
//		double min = 1.0;
//		double range = ((max - min)+ 1);
//		
//		for (double i = 0; i <= 500; i++) {
//			 numberA = new Random().nextDouble(range) + min;
//			//System.out.println(numberA);
//		}
		
		// Creating a Scanner object
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter an amount;  example 0.99:  ");
		double amount = scan.nextDouble();
	
		int changeAmount = (int)(amount * 100);
		
//		int changeAmount = (int)(numberA * 100);
		
		// Find the number of Dollars in the change amount
		int numberOfDollars = changeAmount / 100;
		changeAmount = changeAmount % 100;
		
		// Find the number of Quarter in the change amount
		int numberOfQuarters = changeAmount / 25;
		changeAmount = changeAmount % 25;
		
		// FInd the number of Dimes in the change amount
		int numberOfDimes = changeAmount / 10;
		changeAmount = changeAmount % 10;
		
		// FInd the number of Nickels in the change amount
		int numberOfNickels = changeAmount / 5;
		changeAmount = changeAmount % 5;
		
		// Find the number of Pennies in the change amount
		int numberOfPennies = changeAmount;
		
		// Display output result
		System.out.println("Your amount of " + amount + " consists of");
//		System.out.println("The amount " +String.format("%.2f", numberA) + " consists of");
		System.out.println("  " + numberOfDollars + " dollars");
		System.out.println("  " + numberOfQuarters + " quarters");
		System.out.println("  " + numberOfDimes + " dimes");
		System.out.println("  " + numberOfNickels + " nickels");
		System.out.println("  " + numberOfPennies + " pennies");
		
		
	}
}
