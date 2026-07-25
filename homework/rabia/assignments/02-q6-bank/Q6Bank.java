package assinement_for_bank;

import java.util.Scanner;

public class Q6Bank {

	public static void main(String[] args) {


		// CREATE Scanner object
		Scanner sc = new Scanner(System.in);

		// PRINT "=== Welcome to Q6 Bank ==="
		System.out.println("=== Welcome to Q6 Bank ===");

		// PRINT "You have reached the PIN setup page."
		System.out.println("You have reached the PIN setup page.");

		// PRINT blank line
		System.out.println();

		// PRINT "Enter a 4-digit PIN: "
		System.out.println("Enter a 4-digit PIN: ");

		// READ enteredPin
		String enteredPin = sc.nextLine();

		// SET systemPin = ""
		String systemPin = "";

		// IF enteredPin is empty THEN PRINT "Error: PIN cannot be empty."
		if (enteredPin.isEmpty()) {
			;
			System.out.println("Error: PIN cannot be empty.");
		}
		// ELSE IF length of enteredPin is less than 4 THEN SET missing = 4 minus length
		// of enteredPin PRINT "PIN too short. Add " + missing + " more digit(s)."
		else if (enteredPin.length() < 4) {
			int missing = 4 - enteredPin.length();
			System.out.println("PIN too short. Add " + missing + " more digit(s).");
		}
		// ELSE IF length of enteredPin is greater than 4 THEN SET extra = length of
		// enteredPin minus 4 PRINT "PIN too long. Remove " + extra + " digit(s)."
		else if (enteredPin.length() > 4) {
			int extra = enteredPin.length() - 4;
			System.out.println("PIN too long. Remove " + extra + " digit(s).");
		}

		// ELSE SET systemPin = enteredPin PRINT "PIN saved successfully."
		else {
			systemPin = enteredPin;
			System.out.println("PIN saved successfully.");
		}
		
		// PRINT "Enter your initial deposit (taka): "READ depositText SET depositAmount = convert depositText to int
		System.out.println("Enter your initial deposit (taka): ");
		
		// READ depositText
		String depositText = sc.nextLine();
		
		//SET depositAmount = convert depositText to int
		int depositAmount = Integer.parseInt(depositText);

        //IF depositAmount is less than or equal to 0 THEN PRINT "Error: Deposit must be greater than zero."
		
		if(depositAmount <= 0) {
		System.out.println("Error: Deposit must be greater than zero.");
		}
		
		// ELSE SET balance = depositAmount PRINT "PIN setup complete. Balance: " + balance + " taka."
		else {
			int balance = depositAmount;
			System.out.println("PIN setup complete. Balance: " + balance + " taka.");
		}
		
		//PRINT blank line
		System.out.println();
		
		//PRINT "=== Welcome to Q6 Transaction Page ==="
		System.out.println("=== Welcome to Q6 Transaction Page ===");
		
		//PRINT "Enter your PIN to access your account: "
		System.out.println("Enter your PIN to access your account: ");
		
		//READ loginPin
		String loginPin = sc.nextLine();
		
		//IF loginPin equals systemPin THen  PRINT "Access granted. Welcome!"
		
		if(loginPin.equals(systemPin)) {
		System.out.println("Access granted. Welcome!");	
		}
		
		//ELSE PRINT "Wrong PIN. Access denied."
		  else {
			System.out.println("Wrong PIN. Access denied.");
		}
		
		// PRINT blank line
		System.out.println();
		
		// PRINT "=== Transaction Menu ==="
		System.out.println("=== Transaction Menu ===");
		
		//PRINT "A - Show Balance"
		System.out.println("A - Show Balance");
		
		// PRINT "B - Withdraw"
		System.out.println("");
		
		// PRINT "C - Deposit"
		System.out.println("");
		
		// PRINT "D - Exit"
		System.out.println("D - Exit");
		
		// PRINT "Choose an option: "
		System.out.println("Choose an option: ");
		
		//READ choice
		String choice = sc.nextLine();
		
		// SET choice = choice in UPPERCASE
		String name = "choice";
		String uperCaseName = name.toUpperCase();

		// SWITCH choice CASE "A": PRINT "Current balance: " + balance + " taka." BREAk
		int balance = 1000;
		
		switch (choice) {
		case "A":
		System.out.println("Current balance: " + balance + " taka.");
		break;
		
		// CASE "B":-- Withdraw logic — Stage 7 --BREAK
		case "B":
		System.out.println("Coming in Stage 7");
		break;
		
		//CASE "C": -- Deposit logic — Stage 7 --BREAK
		case "C":
		System.out.println("Stage 7 --BREAK");	
		break;
		
		//CASE "D":PRINT "Thank you for using Q6 Bank. Goodbye." BREAK
		case "D":
		System.out.println("Thank you for using Q6 Bank. Goodbye.");
		break;
		
		//DEFAULT: PRINT "Invalid option. Please choose A, B, C, or D."
		default:
		System.out.println("Invalid option. Please choose A, B, C, or D.");
		}
		
		
		//PRINT "Enter amount to withdraw: "
		System.out.println("Enter amount to withdraw: ");
		
		//READ withdrawText
		String withdrawText = sc.nextLine();
		
		// SET withdrawAmount = convert withdrawText to int
		
		int withdrawAmount = Integer.parseInt(withdrawText);
		
       // IF withdrawAmount is greater than 0 AND withdrawAmount is less than or equal to balance THEN
		
		if(withdrawAmount > 0 && withdrawAmount <= balance) {
		
		// SET balance = balance minus withdrawAmount
			
			balance = balance - withdrawAmount;
			
		//PRINT "Withdrawal successful. New balance: " + balance + " taka."	
		System.out.println("Withdrawal successful. New balance: " + balance + " taka.");	
			
		}
		
		// ELSE IF withdrawAmount is less than or equal to 0 THEN PRINT "Error: Amount must be greater than zero."
		  else if ( withdrawAmount <= 0 ){
	    System.err.println("Error: Amount must be greater than zero.");			  
		 
		}
		
		//ELSE PRINT "Error: Insufficient balance. Available: " + balance + " taka."
	    else {
	    	System.out.println("Error: Insufficient balance. Available: " + balance + " taka.");
		}
		
		
		//PRINT "Enter deposit amount: "
		System.out.println("Enter deposit amount: ");
		
		// READ newDepositText
		String newDepositText = sc.nextLine();
		
		//SET newDepositAmount = convert to int
		
		int newDepositAmount = Integer.parseInt(newDepositText);
		
		// IF newDepositAmount is less than or equal to 0 THEN PRINT "Error: Amount must be greater than zero."
		if (newDepositAmount <= 0) {
		System.out.println("Error: Amount must be greater than zero.");
		}
		
		// ELSE SET balance = balance plus newDepositAmount
		
		else {
			balance = balance + newDepositAmount;
		}
		
		// PRINT "Deposit successful. New balance: " + balance + " taka."
		System.out.println("Deposit successful. New balance: " + balance + " taka.");
		
		sc.close();
	}
	

}













