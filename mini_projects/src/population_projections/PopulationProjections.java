package population_projections;

/**
 * Author: Ronald Doe Targbeh
 * Date: August 29, 2023
 */

/**
 * PopulationProjections Class Overview
 * 
 * The PopulationProjections class is a Java program that estimates future population growth over a five-year 
 * period based on birth, death, and immigration rates. It initializes key variables, including a starting 
 * population of 312,032,486 and statistical rates for births (one every 7 seconds), deaths (one every 13 seconds), 
 * and immigration (one every 45 seconds). The program calculates the number of births, deaths, and immigrants per year 
 * using the total number of seconds in a year (31,536,000). By computing the net population change as the sum of births 
 * and immigrants minus deaths, the program determines how the population will increase each year. 
 * This information is then used to project the population size for the next five years.
 * 
 * While the program effectively demonstrates Java's arithmetic operations and console output, it has a few minor issues. 
 * The calculation for the fifth year's population mistakenly uses the value for year three instead of five, 
 * leading to incorrect output. Additionally, there are minor typographical errors, such as "immigrantion" instead of "immigration." 
 * The program could also benefit from improved variable naming for better readability and scalability, 
 * such as allowing user input for dynamic calculations. Despite these issues, 
 * the PopulationProjections class serves as a straightforward demonstration of population forecasting and fundamental programming concepts.
 * */

public class PopulationProjections {
	

	public static void main(String[] args) {
		// declare variables
		double birthRatePerSeconds = 7.0;
		double deathRatePerSeconds = 13.0;
		double newImmigrantRatePerSeconds = 45.0;
		
		// current population
		double currentPopulation = 312032486;
		System.out.println("The current population is: " + (int)currentPopulation);
		
		// Number of second per year
		double numberOfSecondPerYear = 365 * 24 * 60 * 60;
		
		//calculate the birth rate per Year
		double birthRatePerYear = numberOfSecondPerYear / birthRatePerSeconds;
		System.out.println("The number of birth rates per year is: " + birthRatePerYear);
		
		//calculate the death rate per Year
		double deathRatePerYear = numberOfSecondPerYear / deathRatePerSeconds;
		System.out.println("The number of death rates per year is: " + deathRatePerYear);
		
		//calculate the immigrant rate per Year
		double immigrantRatePerYear = numberOfSecondPerYear / newImmigrantRatePerSeconds;
		System.out.println("The number of immigrantion rates per year is: " + immigrantRatePerYear);
		System.out.println();
		
		//Obtaining new population 
		double newPopulation = birthRatePerYear + immigrantRatePerYear - deathRatePerYear;
		
		//displaying new population per year in five years
		System.out.println("The population after 1 year is: " + (int) (currentPopulation + (1 * newPopulation)));
		System.out.println("The population after 2 year is: " + (int) (currentPopulation + (2 * newPopulation)));
		System.out.println("The population after 3 year is: " + (int) (currentPopulation + (3 * newPopulation)));
		System.out.println("The population after 4 year is: " + (int) (currentPopulation + (4 * newPopulation)));
		System.out.println("The population after 5 year is: " + (int) (currentPopulation + (3 * newPopulation)));
		
	}

}
