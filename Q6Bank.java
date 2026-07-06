/**
 * 
 */
package afia_first_project;

/**
 * 
 */
import java.util.Scanner;

public class Q6Bank {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//creating scanner object 
		
		Scanner sc = new Scanner(System.in);
		
		
		//taking colour command 
		 final String RED = "\u001B[31m";
		 final String GREEN = "\u001B[32m";
		 final String RESET = "\u001B[0m";

		// Show welcome message
		// Ask user to enter PIN
		// Read PIN from user
		System.out.println(RED + "=== WELCOME To Q6 BANK ===" + RESET);
		System.out.println("You have reached the PIN setup page");
		System.out.println();
		System.out.print("Enter a 4-digit PIN:  " );
		
		String enteredPin = sc.nextLine();
		
		//check boolean value true or false?
		boolean ispinEmpty = enteredPin.isEmpty();
		
		int pinLength = enteredPin.length();
		
		// If PIN is empty, show error
		// Else if PIN is shorter than 4, show missing digits
		// Else if PIN is longer than 4, show extra digits
		// Else save PIN
		//first condition check( empty pin  check)
		if(ispinEmpty) {
		
		   System.out.println(RED + "Error: PIN cannot be empty." + RESET);
		
		}
		
		
		//second condition check(less than 4 digit-check)
		else if(pinLength < 4){
			
			int missing = 4 - enteredPin.length();
			System.out.println("PIN too short. Add " + missing + " more digit(s).");
					
			
		}
		//third condition check(more than 4 digit check)
		else if (pinLength > 4) {
			
			int extra = enteredPin.length() - 4;
			System.out.println("PIN too long. Remove " + extra + " digit(s).");
			
		}
		
		//systemPin saved
		// Ask user for initial deposit
		// Convert deposit input to int
		// If deposit is 0 or less than 0, show error
		// Else save deposit as balance
		
		
		else {
		
			String systemPin = enteredPin;
			System.out.println(GREEN + "PIN saved successfully." + RESET);
			
			System.out.print("Enter your initial deposit (taka):  ");
			
			String depositText = sc.nextLine();
			int depositAmount = Integer.parseInt(depositText);
			
			int balance = 0;
			
			if(depositAmount <=0) {
				System.out.println(RED + "Error: Deposit must be greater than zero." + RESET);
			}
			
			//deposit else block(deposit balance check)
			else {
			
				balance = depositAmount;
				System.out.println("PIN setup complete. Balance: " + balance + " taka.");
				
				System.out.println();
				
				System.out.println(RED + "=== Welcome to Q6 Transaction Page ===" + RESET);
				
				
				
			
				//Pin verification
				// Ask user to enter PIN again
				// If login PIN matches saved PIN, allow access
				// Else deny access
				
				System.out.print("Enter your PIN to access your account: ");
				
				String loginPin = sc.nextLine();
			
				boolean isPinVerified = loginPin.equals(systemPin);
				
				if(isPinVerified) {
				
					System.out.println(GREEN + "Access granted. Welcome!" + RESET);
					
					
					//System.out.println();
					
					//System.out.println(RED + "--  Transaction Menu goes here --" + RESET);
					
					// Transaction Menu — Switch
					// Show transaction menu
					// Read user choice
					// Convert choice to uppercase
					// Use switch to run selected option
					
					System.out.println();
					System.out.println(RED + "=== Transaction Menu ===" + RESET);
					System.out.println("A - Show Balance");
					System.out.println("B - Withdraw");
					System.out.println("C - Deposit");
					System.out.println("D - Exit");
					System.out.print( "Choose an option: ");
					
					String choice = sc.nextLine().toUpperCase();
					
					//choice = choice.toUpperCase();
					
					//char letter = choice.charAt(0);
					
					// Case A: print current balance
					// Case B: withdraw money if amount is valid
					// Case C: deposit money if amount is valid
					// Case D: exit program
					// Default: show invalid option
					
					switch(choice) {
					
					case "A":
						System.out.println("Current balance: " + balance + " taka.");
						break;
						
					case "B":
						// Withdraw (Case B)
						// Ask user for withdraw amount
						// Convert withdraw input to int
						// If withdraw amount is greater than 0 and not more than and equal to balance, subtract it from balance
						// Else if amount is 0 or negative, show error
						// Else show insufficient balance error
						
					    System.out.print("Enter amount to withdraw: ");
					    
					    String withdrawText = sc.nextLine();
					    int withdrawAmount = Integer.parseInt(withdrawText);
					    
					    if(withdrawAmount > 0 && withdrawAmount <= balance) 
					    {
					         balance = balance - withdrawAmount;
					    	 System.out.println(GREEN + "Withdrawal successful. New balance: " + balance + " taka." + RESET);
					    }
					    
					    else if(withdrawAmount <=0){
					    	System.out.println(RED + "Error: Amount must be greater than zero." + RESET);
					    	
					    }
					    
					    else {
					    	System.out.println(RED + "Error: Insufficient balance. Available: " + balance + " taka." + RESET);
					    }
					    
					    break;
					    
					case "C":
						
						// Ask user for deposit amount
						// Convert deposit input to int
						// If deposit amount is 0 or less than 0, show error
						// Else add deposit amount to balance
						
						System.out.print("Enter deposit amount: ");
						String newDepositText = sc.nextLine();
						
						int newDepositAmount = Integer.parseInt(newDepositText);
						if(newDepositAmount< 0 || newDepositAmount ==0) {
							System.out.println(RED + "Error: Amount must be greater than zero." + RESET);
					} 
						else {
							
							balance = balance + newDepositAmount;
							System.out.println(GREEN + "Deposit successful. New balance: " + balance + " taka." + RESET);
						}
						break;
						
					case "D":
						System.out.println("Thank you for using Q6 Bank. Goodbye.");
						break;
						
					default:
						System.out.println( RED + "Invalid option. Please choose A, B, C, or D."+ RESET);
					}
				
				}
				
				else {
				
				    System.out.println(RED + "Wrong PIN. Access denied." + RESET);
				
				
		        }
				
				sc.close();
		       

	  }
	
  
   }
 
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
}

	
	
	
	
	
