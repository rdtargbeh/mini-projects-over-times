package lottery;


/**
 * Author: Ronaldo Doe Targbeh
 * Date: September 9, 2023
 * 
 * Write a program that randomly generates a lottery of a two-digit number, prompt the user
 * to enter a two-digit number and determines whether the user wins according to the following rules
 * 
 * 1. If the user input matches the lottery number in the exact order, the award is $10,000
 * 2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
 * 3. If one digit in the user input matches a digit in the lottery number, the award is $1,000
 */

import java.util.*;

public class Lottery {

	public static void main(String[] args) {
		// Generate a lottery
		int lottery = (int)(Math.random() * 100);
		
		// Prompt user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your lottery pick (two digits): ");
		int guess = input.nextInt();
		
		// Get digits from lottery
		int lotteryDigit1 = lottery / 10;
		int lotteryDigit2 = lottery % 10;
		
		// Get digits from guess
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		System.out.println("The lottry number is " + lottery);
		
		// Check the guess
		if (guess == lottery)
			System.out.println("Exact match:\nYou win $10,000.00");
		else if (guessDigit1 == guessDigit1 && guessDigit1 == guessDigit2)
			System.out.println("Match all digits:\nYou win $3,000.00");
		else if (guessDigit1 == lotteryDigit1
				|| guessDigit1 == lotteryDigit2
				|| guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2)
			System.out.println("Match one digit:\nYou win $1,000.00");
		else
			System.out.println("Sorry, no match");

	}

}

