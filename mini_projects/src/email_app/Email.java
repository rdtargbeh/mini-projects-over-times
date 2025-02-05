package email_app;

/**
 * By: Ronald Doe Targbeh
 * Date: November 21, 2023
 * 
 * Scenario: You are an IT Support Administration Specialist and are charged with the task
 * of creating email accounts for new hires.
 * 
 * Your application should do the following
 * 1. Generate an email with the following syntax: firstname.lastname@department.company.com
 * 2. Determine the department (Sale, development, accounting), if none leave blank
 * 3. Generate a random String for a password
 * 4. Have set methods to change the password, set the mailbox capacity, and define an alternate email address
 * 5. Have get methods to display the name, email and mailbox capacity
 */

import java.util.Scanner;
public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength = 10;
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private  String email;
	private String companySuffix = "dtechliberia.com";
	
	  
	// Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName =  lastName;
		//System.out.println("Email created: " + this.firstName + " " + this.lastName);
		
		// Call a method asking for the department -  return the department
		this.department = setDepartment();
		//System.out.println("Department: " + this.department);
		
		// Call a method that return a random password
		this.password = randomPassword(defaultPasswordLength);
		//System.out.println("Your password is: " + this.password);
		
		// Combine element to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		//System.out.println("Your email is: " + email);
	}
	
	// Ask for the department
	private String setDepartment() {
		System.out.print("New Worker: " + firstName + ", Department Codes\n1 for Sales\n2 for Development\n3 for Accounting\n0 for +"
				+ "none\nEnter department code: ");
		Scanner scan = new Scanner(System.in);
		int deptChoice = scan.nextInt();
		
		if (deptChoice == 1)
			return "sales";
		else if (deptChoice == 2)
			return "dev";
		else if (deptChoice == 3)
			return "acct";
		else 
			return "";
	}
	
	// Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@!%$#";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new  String(password);
	}
	
	// Set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	// Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}

	// Change the password
	public void changePassword(String password) {
		this.password = password;
	}
	
	// Return mailbox capacity
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	// return alternate email
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	// Return password
	public String getPassword() {
		return password;
	}

	public String  toString() {
		return "DISPLAY NAME:  " +firstName + " " + lastName + 
				"\nCOMPANY EMAIL: " + email +
				"\nMAILBOX CAPACITY " + mailboxCapacity+ "mb";
	}
}
