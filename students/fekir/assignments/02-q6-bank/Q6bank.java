package qa_automation_with_java;

import java.awt.im.InputContext;
import java.util.Scanner;

public class Q6bank {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int balance= 0;
		String choice="";
		int withdrawAmount= 0;
		int newDepositAmount= 0;
	
	
	//CREATE Scanner object
	//PRINT "=== Welcome to Q6 Bank ==="
	//PRINT "You have reached the PIN setup page."
	//PRINT blank line
	//PRINT "Enter a 4-digit PIN: "
	//READ enteredPin
		
	
	System.out.println("=== Welcome to Q6 Bank ===");
	System.out.println("You have reached the PIN setup page.");
	System.out.println();
	System.out.println("Enter a 4-digit PIN");
	
	String enteredPin = sc.nextLine();
	
	System.out.println("Enter PIN: " + enteredPin);
	
	//PIN cannot be empty
	//PIN must be 4 digits
	//If PIN too short or too long, print "PIN should be 4 digits"
	//If PIN too long, state how many to remove
	//If Valid, save PIN as systemPin
	
	
	if (enteredPin.isEmpty())
		System.out.println("Error: PIN cannot be empty.");
	else if (enteredPin.length() < 4)
		System.out.println("PIN too short. Add " + Math.abs(enteredPin.length() - 4) + " more digit(s).");
	else if (enteredPin.length() > 4)
		System.out.println("PIN too long. Remove " + Math.abs(enteredPin.length() - 4) + " digit(s).");
	else if (enteredPin.length() == 4) {
		String systemPin = enteredPin;
		System.out.println("PIN saved successfully.");
		
		//Ask for opening balance
		//Validate it is positive
		//Store as balance
		
			System.out.println("Enter your opening deposit: ");
			String userDeposit= sc.nextLine();
			int deposit= Integer.parseInt(userDeposit);
			if (deposit <= 0 )
				System.out.println("Error: Deposit must be greater than 0.");
					
			//Print a blank line
			//Print a transaction page header
			//Ask the user to enter their pin again
			//Read the PIN into a new variable
			
					else{
						balance= deposit;
							System.out.println("Balance:" + balance + " taka.");
							//Print a blank line
							//Print a transaction page header
							//Ask the user to enter their pin again
							//Read the PIN into a new variable
						System.out.println();
						System.out.println("== Welcome to Q6 Transaction Page ==");
						System.out.println("Enter your PIN to access your account: ");
						String loginPin= sc.nextLine();
						
						//compare loginPIN to systemPIN
						//Grant access or deny it
						
						if (loginPin.equals(systemPin))
						{
							System.out.println("Access granted. Welcome!");
	
						//Print menu
						//Read user's choice into a variable
						//convert to upper case
						//create a switch 
							
						System.out.println("== Transaction Menu ==");
						System.out.println("A - Show Balance");
						System.out.println("B - Withdraw");
						System.out.println("C - Deposit");
						System.out.println("D - Exit");
						System.out.println("Choose an option: ");
						
						String transChoice= sc.nextLine();
						choice= transChoice.toUpperCase();
						
						
						switch (choice) {
							case "A": 
								System.out.println("Current balance: "+ balance + " taka.");
								break;
							case "B": 
								//Print prompt
								//Read amount and covert to int
								//Amount must be greater then 0 and less than or equal to the current balance
								//both must be true
								//Subtract the amount from balance and print the new balance
								//If amount is 0 or negative - error message 
								//If amount is more than balance - a different error message
								System.out.println("Enter amount to withdraw: ");
								String withdrawText= sc.nextLine();
								withdrawAmount= Integer.parseInt(withdrawText);
								
								if (withdrawAmount > 0 && withdrawAmount <= balance) 
									{
									balance= balance - withdrawAmount;
									System.out.println("Withdrawal successful. New balance: " + balance + " taka.");
										}
									else if (withdrawAmount <= 0) {
										System.out.println("Error: Amount must be greater than zero.");
										}
									else 
										{
										
										System.out.println("Insufficient balance. Available: " + balance + " taka.");
									}
								
									
								break;
							case "C": 
								
								//Ask amount to deposit
								//covert to int
								//make sure amount is positive
								//Add the amount to balance and print the new balance
								
								System.out.println("Enter deposit amount: ");
								String newDepositeText= sc.nextLine();
								newDepositAmount= Integer.parseInt(newDepositeText);
								
								if (newDepositAmount <= 0)
								{
									System.out.println("Error: Amount must be greater than zero.");
								}
								else {
									balance= balance + newDepositAmount;
									System.out.println("Deposit successful. New balance: " + balance + " taka.");
								}
								break;
							case "D": 
								System.out.println("Thank you for using Q6 Bank. Goodbye.");
								break;
							default:
								System.out.println("Invalid option. Please choose A, B, C, or D.");
							}
						}
						else {
							System.out.println("Wrong PIN. Access denied.");
						}
						
						sc.close();
				}
		
	}
	
	
	}
}
