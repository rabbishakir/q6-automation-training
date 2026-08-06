package oop_banking_application;

// CLASS User
public class User {
	
	// properties
	//PROPERTY name 
	String name;
	
	// PROPERTY email
	String email;
	
	// PROPERTY pin
	int pin;
	
	// PROPERTY BankAccount account
	BankAccount account;   
	
	
	
	//CONSTRUCTOR User(name, email)
	public User(String name, String email) {
		
		// SET this name
		this.name = name;
		
		// SET this email
		this.email = email;
		
		// SET account to null
		this.account = null;
		
		// END CONSTRUCTOR
	}
	
	
	// name , email and pin
	
	// construstor and user defined 
	// con -> called automatically 
	// user -defined -> manually
	
	
	
	//METHOD setPin(newPin)
	public void setPin(int newPin) {  //create and take input 
		
		// SET pin to newPin
		pin = newPin;
		
		// PRINT "PIN created successfully"
		System.out.println("PIN created successfully");
		
		// END METHOD
	}
	
	
	// METHOD checkPin(enteredPin)
	public boolean checkPin(int enteredPin) {
		
		// IF enteredPin equals pin
		if(enteredPin == pin) {
			return true;
		}
		
		// ELSE RETURN false
		else {
			return  false;
			
		// END IF
		}

	// END METHOD
	}


// METHOD createAccount(accountNumber)
     public void createAccount(String accountNumber) {
    	 
 // CREATE new BankAccount object. STORE the new BankAccount inside account
    	 account = new BankAccount(accountNumber); 

	// PRINT "Bank account created successfully"
System.out.println("Bank account created successfully");

// END METHOD
}

// METHOD showProfile()
public void showProfile() {
	
	System.out.println();
	System.out.println("===== USER PROFILE =====");
	
	// PRINT name
System.out.println("name:" + name);

// PRINT email
System.out.println("email:" + email);

// IF account is null
 if(account == null) {
	
	// PRINT "No bank account"
	System.out.println("No bank account");
	
	// ELSE PRINT account number
}else {
	System.out.println("My account number is :" + account.accountNumber);
	
	// END IF
}
 
 // END METHOD
}

public void showBonus() {

    if(account != null) {
        account.showBonus();
       
    } else {
        System.out.println("No account available");
    }
}


// END CLASS
}
