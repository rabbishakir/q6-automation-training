package bankApplication;

import java.util.Scanner;

public class bankAppMain {

	public static void main(String[] args) {
		
  //Create Scanner for input name, email, pin. 
	Scanner sc = new Scanner (System.in); 
	System.out.println("Enter your name. ");
	String name = sc.nextLine().strip();
	
	System.out.println("Enter your email. ");
	String email = sc.nextLine().toLowerCase().strip(); 
	

	
	// account registration 
	BankApp bankApp01 = new BankApp(); // call the method 
	
	bankApp01.register(name, email); // register new account holder 
	
	System.out.println("Create your PIN: ");
	int PIN = sc.nextInt(); 	
	
	
	bankApp01.user.setpin(PIN);// for this account pin set 
	
	bankApp01.user.showProfile(); // just profile show 
	
	System.out.println("Please enter PIN to loggin: ");
	int savedPin = sc.nextInt();
	 sc.nextLine(); 
	
	// String choice 
	
	
	
	
	
	
	
	
	
	
	
	// customer enter the correct pin and loggin 
	
	// create login value 
	
	
	// show option like deposit , withdraw, current balance
	
	
	
	
	
	

	
		

	}

}
