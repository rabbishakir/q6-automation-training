package oop_banking_application;

// CLASS BankApp
public class BankApp {

	// PROPERTY User user
	User user;

	// PROPERTY loggedIn
	boolean loggedin;

	// CONSTRUCTOR BankApp()
	public BankApp() {

		// SET user to null
		this.user = null;

		// SET loggedIn to false
		this.loggedin = false;

		// END CONSTRUCTOR
	}

	// METHOD register(name, email)
	public void register(String name, String email) {

		// CREATE new User object. STORE the User object inside user

		user = new User(name, email);  //  you or anyone mom, son, anyone you registered form

		// PRINT "Registration successful"
		System.out.println("Registration successful");

		// END METHOD
	}

	// METHOD login(enteredPin)
	public void login(int enteredPin) {

		// IF user is null
		if (user == null) {

			// PRINT "No registered user"
			System.out.println("No registered user");
			
			// ELSE CALL user's checkPin method
		}else {
			
			if (user.checkPin(enteredPin)) {  // using user class -> check pin method can check if the entered pin is equal to to user class-pin 
				
// IF checkPin returns true. SET loggedIn to true
				loggedin = true;

	// PRINT "Login successful"
			System.out.println("Login successful.");

			}
// ELSE SET loggedIn to false
			else {
				loggedin = false;
				
				// PRINT "Incorrect PIN"
				System.out.println("Incorrect PIN");
				
				// END IF
			}
			
			// END IF
		}
		
		// END METHOD
	}
	
	
// METHOD logout()
	public void logout() {
		
		// SET loggedIn to false
		loggedin = false;
		
		// PRINT "Logout successful"
		System.out.println("Logout successful");
		
		// END METHOD
	}
	
	


	// END CLASS
}
