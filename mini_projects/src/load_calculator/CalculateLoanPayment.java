package load_calculator;

/**
 * Author: Ronaldo Doe Targbeh
 * Date: September 4, 2023
 * 
 * The CalculateLoanPayment class is a Java program that calculates and displays a loan’s monthly payment, 
 * total payment over the loan term, and a detailed amortization schedule. It takes user input for the loan amount, 
 * annual interest rate, and loan duration, then computes monthly payments using the standard loan formula. 
 * The program dynamically updates the interest charged, principal paid, and remaining balance for each month, 
 * providing an accurate breakdown of how the loan is paid off over time.
 * 
 */

import java.util.Scanner;
public class CalculateLoanPayment {
	
	public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get loan amount from user
        System.out.print("Please enter the loan amount: ");
        double loanAmount = input.nextDouble();

        // Get annual interest rate from user
        System.out.print("Please enter the annual interest rate (as a percentage, e.g., 5 for 5%): ");
        double annualInterestRate = input.nextDouble();

        // Get number of years from user
        System.out.print("Please enter the number of years: ");
        int numberOfYears = input.nextInt();

        // Close scanner
        input.close();

        // Convert annual interest rate to monthly interest rate
        double monthlyInterestRate = annualInterestRate / 1200;

        // Calculate monthly payment using the loan formula
        double monthlyPayment = loanAmount * monthlyInterestRate /
                (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));

        // Calculate total payment over the entire loan term
        double totalPayment = monthlyPayment * numberOfYears * 12;

        // Display loan summary
        System.out.println();
        System.out.printf("The monthly payment amount is: %.2f%n", monthlyPayment);
        System.out.printf("The total amount to be paid over %d years is: %.2f%n", numberOfYears, totalPayment);
        System.out.println();

        // Initialize balance to loan amount
        double balance = loanAmount;

        // Display headers for amortization schedule
        System.out.printf("%-10s %-20s %-20s %-20s%n", "Month", "Interest Charged", "Principal Paid", "Remaining Balance");
        System.out.println("------------------------------------------------------------------------------------------");

        // Compute and display monthly breakdown
        for (int month = 1; month <= numberOfYears * 12; month++) {
            double interestCharged = balance * monthlyInterestRate;
            double principalPaid = monthlyPayment - interestCharged;
            balance -= principalPaid; // Update the balance after payment

            // Ensure balance doesn't become negative due to rounding errors
            if (balance < 0) {
                balance = 0;
            }

            // Display monthly breakdown
            System.out.printf("%-10d %-20.2f %-20.2f %-20.2f%n", month, interestCharged, principalPaid, balance);
        }
    }
	
	

}
