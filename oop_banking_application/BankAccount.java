package oop_banking_application;

// CLASS BankAccount
public class BankAccount {

	// properties
	String accountNumber;
	double balance;
	private String current;

	// constructor method
	public BankAccount(String accountNumber) {

		// SET this accountNumber
		this.accountNumber = accountNumber;

		// SET balance to 0
		this.balance = 0;

		// END CONSTRUCTOR
	}

	// METHOD deposit(amount)
	public void deposit(double amount) { 

		// IF amount is greater than 0
		if (amount >0) {

			// ADD amount to balance
			balance = balance + amount;

            // PRINT "Deposit successful"
			System.out.println("Deposit successfull");

			// PRINT current balance
			System.out.println("current balance: $" + balance);
		}

		// ELSE PRINT "Invalid deposit amount"
		else {
			System.out.println("Invalid deposit amount");

			// END IF
		}

		// END METHOD
	}

// METHOD withdraw(amount)
	public void withdraw(double amount) {

		// IF amount is less than or equal to 0
		if (amount <= 0) {

			// PRINT "Invalid withdrawal amount"
			System.out.println("Invalid withdrawal amount");

			// ELSE IF amount is greater than balance
		} else if (amount > balance) {

			// PRINT "Insufficient balance"
			System.out.println("Insufficient balance");
		}

		// ELSE SUBTRACT amount from balance
		else {
			balance = balance - amount;

			// PRINT "Withdrawal successful"
			System.out.println("Withdrawal successful");

			// PRINT current balance
			System.out.println("current balance: $" + balance);

			// END IF
		}

// END METHOD
}
	
// METHOD showBalance()
	public void showBalance() {

		// PRINT current balance
		System.out.println("current balance: $" + balance);
		
		// END METHOD
	}
	
	public void showBonus() {
        double bonus = balance * 0.05;
        System.out.println("Your bonus is: $" + bonus);
        System.out.println("Bonus addition to balance: " + balance + bonus);
    }

	// END CLASS
}
