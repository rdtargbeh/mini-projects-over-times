package income_tax;


/**
 * Author: Ronald Doe Targbeh
 * Date: Sept 8, 2023
 * 
 * Compute personal income tax base filling status
 */

import java.util.*;
public class ComputeIncomeTax {
	
	public static void main(String[] args) {
		// Create a scanner object
		Scanner input = new Scanner(System.in);
		
		System.out.println("0 = Single filing\n1 = Married jointly or qualifying Widow(er)\n"+
		"2 = Married separately\n3 = head of household");
		
		//Prompt user to enter filling status
		System.out.print("Please the enter filing status: ");
		int status = input.nextInt();
		
		//Prompt user to enter filling status
		System.out.print("Please enter taxable income: ");
		double income = input.nextDouble();
		
		// compute income tax
		double tax = 0;
		if (status == 0) {  // Single filing status
			if (income <= 8350)
				tax = income * 0.10;
			
			else if (income <= 33950)
				tax = 8350 * 0.10 +(income - 8350) * 0.15;
			
			else if (income <= 82250)
				tax = 8350 * 0.10 + (8350 - 33950)* 0.15 + (income - 33950) * 0.25;
			
			else if (income <= 171500)
				tax = 8350 * 0.10 + (8350 - 33950)* 0.15 + 
				(33950 - 82250) * 0.25 + (income - 82250) * 0.28;
			
			else if (income <= 372950)
				tax = 8350 * 0.10 + (33950 - 8350)* 0.15 + (82250 - 33950) * 0.25 + 
				(82250 - 171500) * 0.28 + (income - 171500) * 0.33;
			
			else
				tax = 8350 * 0.10 + (33950 - 8350)* 0.15 + (82250 - 33950) * 0.25 + 
				(82250 - 171500) * 0.28 + (372950 - 171500) * 0.33 + (income - 372950) * 0.35;
		}
		
		//married file jointly
		else if (status == 1) {  // Compute tax for married file jointly
			if (income <= 16700)
				tax = income * 0.10;
			
			else if (income <= 67900)
				tax = 16700 * 0.10 +(income - 16700) * 0.15;
			
			else if (income <= 137050)
				tax = 16700 * 0.10 + (16700 - 67900)* 0.15 + (income - 67900) * 0.25;
			
			else if (income <= 208850)
				tax = 16700 * 0.10 + (16700 - 67900)* 0.15 + 
				(67900 - 137050) * 0.25 + (income - 137050) * 0.28;
			
			else if (income <= 372950)
				tax = 16700 * 0.10 + (67900 - 16700)* 0.15 + (137050 - 67900) * 0.25 + 
				(137050 - 208850) * 0.28 + (income - 208850) * 0.33;
			
			else
				tax = 16700 * 0.10 + (67900 - 16700)* 0.15 + (137050 - 67900) * 0.25 + 
				(137050 - 208850) * 0.28 + (208850 - 372950) * 0.33 + (income - 372950) * 0.35;
		}
		
		
		else if (status == 2) {  // Compute tax for married separately
			// do something
		}
		
		else if (status == 3) {  // Compute tax for head of household
			// do something
		}
		
		else {
			System.out.println("Error: invalid status");
			System.exit(1);
		}
		
		// compute take home balance
		double balance = income - tax;
		
		// Display the result
		 System.out.println("Tax is " + (int)(tax * 100) / 100.0);
		 System.out.println("Total income after tax is " + (int)(balance * 100) / 100.0);
	}


}
