package bankApplication;

public class BankAccount {
 
	// property 
  String accountNumber ;
	double balance; 
	
	
	//constructive method 
	public BankAccount() {
		balance = 0; 
		this.accountNumber = accountNumber ; // i have doubt about this line
	}
	

	// account number generate 
	public void generateAccountNumber (String name){
		accountNumber = name.substring(0, 3).toUpperCase() + "2026";
	}
	// show account number 
	public String getAccountNumber() {
		
		return accountNumber; 
	}
	
	
	
	
	
	
	// Deposit 
	public void Deposit (double depositAmount) {
		// deposit has to be positive value and adjust with the current balance 
		if (depositAmount > 0) {
			balance = balance + depositAmount; 
			System.out.println("deposit successfull. ");
		} else {
			System.out.println("Invalid deposit amount. ");
		}
		
	}
	
	
	// Withdraw 
	public void Withdraw( double withdrawAmount) {
		// withdraw should be grater than zero and not more than balance. 
		
		if (withdrawAmount <=0) {
			System.out.println("Invalid withdraw amount ! ");
		} else if (balance < withdrawAmount ) {
			System.out.println("Insufficient balance !");
		} else {
			balance = balance - withdrawAmount; 
			System.out.println("Withdraw successful! ");
			System.out.println("Current balance is :"+ balance);
		}
	}
	
	// show current balance 
	public void showBalance() {
		System.out.println("Current Balance is : " + balance);
	}
	
	
	
}
