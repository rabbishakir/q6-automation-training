package oop_banking_application;

// CLASS Main
public class Main {

	// MAIN METHOD
	public static void main(String[] args) {
		
		
		
// CREATE BankApp object
	
	// PRINT "BANK APPLICATION"
	System.out.println("===== BANK APPLICATION =====");
		
	BankApp bankApp = new BankApp();    // created a new bank app -> my bank app does not have any user
	// CALL bankApp.register. name = "John Smith" email = "john@gmail.com"
	
	bankApp.register("John Smith", "john@gmail.com") ;// i called the register method of bank app class to create a new user  -> so in this line we created an user 
			
	// CALL user's setPin.	PIN = 1234	
     bankApp.user.setPin(1234);	   // the user that belongs to the bank app will set the pick of users setpin mehtod from the user class
    
	// CALL user's createAccount. account number = "ACC1001"		
     bankApp.user.createAccount("ACC1001");
 
     // CALL user's showProfile
     bankApp.user.showProfile();
     
     // CALL bankApp.login PIN = 5555
     bankApp.login(5555);
     
     // PRINT "Trying correct PIN"
     System.out.println("Trying correct PIN");
     
     // CALL bankApp.login PIN = 1234
     bankApp.login(1234);
     
     System.out.println();
     
     // CALL user's account deposit amount = 1000
     bankApp.user.account.deposit(1000);  // user belongs to the bank app | accont belongs to user | 
     
     System.out.println();
     
     // CALL user's account withdraw amount = 300
     bankApp.user.account.withdraw(300);
     
     // CALL user's account withdraw amount = 1000
     bankApp.user.account.withdraw(1000);
     
     System.out.println();
     
     // CALL user's account showBalance
     bankApp.user.account.showBalance();
     
     System.out.println();
     bankApp.user.showBonus();

     
     System.out.println();

   
     // CALL bankApp.logout
     bankApp.logout();
 
     
     // END MAIN
     
	}

	// END CLASS
}
