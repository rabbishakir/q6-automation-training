package mini_Banking_Application;

public class User {

	
	String name;
	String email;
	int pin;
	
	BankAccount account = null;
	
//	User(String name,String email,int pin){
//		
//		
//	}
//	

	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	// user setting their pin for the first time 
	public void setpin(int newPin) {
		pin = newPin;
		System.out.println("Your Pin has been Created successfully");
	}
	// system will check if the entered pin is matched with setpin pin
	public boolean checkpin(int enteredPin) {
		
		if(enteredPin==pin) {
			return true;
		}
		
		else {
			return false;
		}
	}
	// here this method is creating bankAccount object and calling 
	// if any user is first time then theeir accounnumber will be generated 
	// other wise an account already existed
	public void createAccount() {
		if(account==null) {
		
		 account = new BankAccount();
		 account.generateAccountNumber(name);
		 System.out.println("Bank account created successfully");
		}
		else {
			System.out.println("You already have a bank account");
		}
		
	}
	// user profile details 
	public void showprofile() {
		
		System.out.println("Account Holder Name: " + name.strip().toUpperCase());
		System.out.println("Account Holder Email: " + email.strip());
		System.out.println("Account Holder AccountNumber: " + account.getAccountNumber());
		
		
		
	}
}

