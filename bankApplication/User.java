package bankApplication;

public class User {
	
	//name, email, pin 
	String name; 
	String email;
	int pin;
	
	// default no account number 
	BankAccount  account = null ; // because not static i can call the class bankAccount 
	
	// constructive method 
	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	} 
	
	
	// First pin setup From main method 
	public void setpin (int newPin){
		pin = newPin; 
		System.out.println("Pin created successfully");
	}
	
	
	
	
	
	
	
	
	
	
	// check pin method 
	public boolean checkPin (int enteredPin){
		if (enteredPin == pin) {
			return true;
		} else {
			return false; 
		}
	}
	
	// registration new / create bank account : name, email, pin ( come from main bank App )
	
	public void createAccount() {
		if (account== null) {
			account = new BankAccount();
			account.generateAccountNumber(name);
			System.out.println("Account created Successfully ");
		} else {
			System.out.println("already have an account ");
		}
	}; 
	
	 
	
	// User profile details 
	public void showProfile () {
		System.out.println("Account holder name: "+ this.name);
		System.out.println("Account holder Email: "+ this.email);
	   // System.out.println("Account number " + account.getAccountNumber());
	}
	
	
	
	// Logging : pass the parameter by name and email with password.
	
	// Logout: logout successful. 

}
