package bankApplication;

public class BankApp {
 
	// property 
	boolean LoggedIn; 
	User user ;
	
	
	// constructibe_method [default value] 
	public BankApp() {
		
		LoggedIn = false;
		this.user = null;
	} 
	
	// registration method 
	
	public void register (String name, String email) {
		user = new User(name, email); 
		System.out.println("Reg successfull ");
		
	}
	
	// Login 
	public void login (int enterPin) {
		if (user == null) {
			System.out.println("No registered User. ");
		} else 
			if(user.checkPin(enterPin)) {
				LoggedIn = true;
				System.out.println("login successfull ");
			} else {
				LoggedIn = false;
				System.out.println("Incorrect PIN ");
			}
	}
		// Logout
		public void logout() {
			LoggedIn = false; 
			System.out.println("logout successful. ");
		}
		
	}
	  
	
	
	

