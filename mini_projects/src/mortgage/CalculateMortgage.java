package mortgage;

/** 
 * Author: Ronaldo Doe Targbeh
 * Date: September 24, 2023
 * 
 * Write	a	mortgage	calculator	program	to	calculate	fixed	rate	mortgage	payment.	Your	program	should	
 * print	out	an	amortization table	on	screen. For	mortgage	calculator	and	its	related	formula,	please	visit	
 * http://en.wikipedia.org/wiki/Mortgage_calculator
 * The	program	input	will	be	Principle,	Term	(in	year),	Quoted	Interest	Rate.	To	simplify the	program,	the	
 * program	output,	i.e.	your	amortization	table	only	need	to	contain the	following	four	columns:		Month,	
 * Payment,	Total	Interest,	and	Balance.	Please	see	the	attached	screen	shot	(page	2)	for	an	input	and	
 * output	example.
 */

import java.text.DecimalFormat;
import java.util.Scanner;
public class CalculateMortgage {
	
	public static void main(String[] args) {
//		// Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		DecimalFormat df = new  DecimalFormat(".00");
		
		// obtain load amount
		System.out.print("Enter loan amount to borrow: $");
		double loanAmount = input.nextDouble();
		
		//obtain yearly interest rate
		System.out.print("Enter the interest rate in decimal: ");
		double annualInterestRate = input.nextDouble();
		
		//obtain the number of years
		System.out.print("Enter the term (in years): ");
		int numberOfYears = input.nextInt();
		
		//obtain monthly interest rate
		//double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyInterestRate = annualInterestRate / 12;
		
		double numberOfTerms = numberOfYears * 12;
		
		// Printing out month, payment, total interest and balance
		System.out.println("Month  \tPayment \tTotalInterst  \tBalance");
		
		// Calculate the monthly payment
		double monthlyPayment = loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfTerms) 
				/ (Math.pow(1 + monthlyInterestRate, numberOfTerms)- 1);
		
		// Using a while loop here
		int i = 1;
		while (i <= numberOfTerms) {
			
			// Calculate the total balance remaining
			double balance = (Math.pow(1 + monthlyInterestRate, i) * loanAmount) - (Math.pow(1 + monthlyInterestRate, i)- 1)
					* monthlyPayment / monthlyInterestRate;
			
			// Calculate the total interest paid
			double totalInterestPaid = monthlyPayment * i - (loanAmount - balance);
			
			System.out.println(i + "  \t$" + df.format(monthlyPayment) + "   \t" + df.format(totalInterestPaid)  +
					"   \t$" + df.format(balance));
			i++;
		}
//		
		// Using a for loop here
//		for (int k = 0; k <= numberOfTerms; k++) {
//		// Calculate the total balance remaining
//			double balance = (Math.pow(1 + monthlyInterestRate, k) * loanAmount) - (Math.pow(1 + monthlyInterestRate, k)- 1)
//					* monthlyPayment / monthlyInterestRate;
//						
//		// Calculate the total interest paid
//			double totalInterestPaid = monthlyPayment * k - (loanAmount - balance);
//									
////						
//		System.out.println(i + "  \t$" + df.format(monthlyPayment) + "   \t" + df.format(totalInterestPaid)  +
//				"   \t$" + df.format(balance));
//		}
		  System.out.println();
		 // Using do_while() in another function
        do_while();
       
	}
	
	// declare a do_while method
	   public  static void do_while(){
		   System.out.println("Calculate another loan amount again.");
	        int choice = 1;
	        do {
	        	// Create a Scanner object
	    		Scanner input = new Scanner(System.in);
	    		
	    		// obtain load amount
	    		System.out.print("Enter loan amount to borrow: $");
	    		double loanAmount = input.nextDouble();
	    		
	    		//obtain yearly interest rate
	    		System.out.print("Enter the interest rate in decimal: ");
	    		double annualInterestRate = input.nextDouble();
	    		
	    		//obtain the number of years
	    		System.out.print("Enter the term (in years): ");
	    		int numberOfYears = input.nextInt();
	    		
	    		//obtain monthly interest rate
	    		//double monthlyInterestRate = annualInterestRate / 1200;
	    		double monthlyInterestRate = annualInterestRate / 12;
	    		
	    		double numberOfTerms = numberOfYears * 12;
	    		
	    		// Printing out month, payment, total interest and balance
	    		System.out.println("Month  \tPayment \tTotalInterst  \tBalance");
	    		
	    		// Calculate the monthly payment
	    		double monthlyPayment = loanAmount * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfTerms) 
	    				/ (Math.pow(1 + monthlyInterestRate, numberOfTerms)- 1);
	    		
	            // Using loop to print
	            for(int k=1; k<= numberOfTerms; k++){
	            	// Calculate the total balance remaining
	            	double balance = (Math.pow(1 + monthlyInterestRate, k) * loanAmount) - (Math.pow(1 + monthlyInterestRate, k)- 1)
	    				* monthlyPayment / monthlyInterestRate;
	    						
	    		// Calculate the total interest paid
	    			double totalInterestPaid = monthlyPayment * k - (loanAmount - balance);
	    			
	    			DecimalFormat df = new  DecimalFormat(".00");
	    						
	    			System.out.println(k + "  \t$  " + df.format(monthlyPayment)  + "   \t$  " + df.format(totalInterestPaid ) +
	    					"   \t$  " + df.format(balance));
	            }
	            System.out.println();
	            System.out.print("Press 0 to stop or \nPress 1 to calculate another loan: ");
	            // Choice to exit the program
	            int ch = input.nextInt();
	            if(ch==0){
	                choice = 0;
	            }
	        } while (choice!=0);
	    }
	    

}
