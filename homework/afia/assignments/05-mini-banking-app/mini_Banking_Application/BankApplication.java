package mini_Banking_Application;

public class BankApplication {
	
	boolean LoggedIn = false;
 
	User user = null;
	
	
	public BankApplication() {
		LoggedIn = false;
		user = null;
	}
   // creating user object for passing argument of name and email to its constructor method 
	public void register(String name,String email) {
		
		user = new User(name, email);
		System.out.println("Registration successful");
		
			
		
	}
	// login method logic build
	public void login(int enteredPin ) {
		if(user==null) {
			System.out.println("No registered user");	
		}
		else  {
			// entered pin matching during login
			if(user.checkpin(enteredPin)) {
			LoggedIn = true;
			System.out.println("Login successful");
			}
			else {
				LoggedIn = false;
				System.out.println("Incorrect PIN");
			}

		}
	}
	// logout method, is if LoggedIn is false means user logged out
	public void logout() {
		LoggedIn = false;
		System.out.println("Logout successful");
	}

}
