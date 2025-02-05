package email_app;

import java.util.*;
public class EmailApp {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter first Name: ");
		String Fname = scan.next();
		
		System.out.print("Enter last Name: ");
		String Lname = scan.next();
		
		System.out.print("Enter alternative email: ");
		String alternativeEmail = scan.next();
			
		Email em1 = new Email(Fname, Lname);
		
		System.out.println("\n" +em1.toString());

		em1.setAlternateEmail(alternativeEmail);
		System.out.println("\nYour alternate email is: " + em1.getAlternateEmail());
		

	}

}
