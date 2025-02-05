package income_tax;

import java.util.Scanner;

public class ComputeBMI {
	
	public static void main(String[] args) {
		// Declare final variables
		final double KILOGRAMS_PER_POUND = 0.45359237;
		final double MERTER_PER_INCH = 0.0254;
		//final double INCHES_PER_METER = 39.37007874;
		
		Scanner input = new Scanner(System.in);
	
		// Obtain weight in pounds from user
		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();
	
		// Obtain height in inches from user
		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();
		
		// Calculate BMI
		double weightInKilograms = weight * KILOGRAMS_PER_POUND;
		double heightInMeters = height * MERTER_PER_INCH;
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);
		
		// Output
		System.out.printf("Your BMI is %5.2f\n", bmi);
		
		if (bmi < 16)
			System.out.println("You are seriously underweight.");
		else if (bmi < 18)
			System.out.println("You are underweight.");
		else if (bmi <= 24)
			System.out.println("Your weight is normal.");
		else if (bmi < 29)
			System.out.println("You are overweight.");
		else 
			System.out.println("You are obese.");
	}

}
