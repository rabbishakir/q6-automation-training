package mini_Banking_Application;

public class BankAccount {
	
	// class property
	
	//String accountholdername;
	
	String accountNumber;
	
	double balance = 0;

	
	public BankAccount(){
		//this.accountNumber = accountnumber;
		balance = 0;
		
	}
	// here bankAccount number will be generated automatically
	public void generateAccountNumber(String name) {
		accountNumber = name.substring(0, 3).toUpperCase()+"000";// every account number holds first3 letter of name make it uper case and add 000
		System.out.println("Account Number : " + accountNumber); // printing account number 
		
	}
	
	public String getAccountNumber() {
	    return accountNumber;
	}
	
	public void Deposit(double depositamount) {
	
		// we want to deposit an amount to our bank account which will be added to our current balance
		// check is deposit amount is greater than 0 or not? 
		// balance = deposit + oldbalance;
		if(depositamount>0) {
			
			balance = balance + depositamount;
		 System.out.println("Your deposit successfull");
		}
		else {
			System.out.println("Invalid deposit amount");
		}
	}
	
	
	public void Withdraw(double withdrawamount) {
			
			// user wants to withdraw money from bank. 
		    //So withdrawamount should be greater than zero.
		    // balance should be greater than withdraw amount. (balance> withdrawamount);//balance = (balance - withdrawamount);
		    //if withdraw amount is less than 0 or equal zero (withdraw money<=0);invalid withdrawal amount 
		    //  if balance is less than withdraw amount than insufficient balance.(balance< withdrawamount)
			// 
		
			if(withdrawamount<=0) {
			   
			 System.out.println("Invalid withdrawal amount!!! ");
			}
			else if (balance< withdrawamount){
				System.out.println("Insufficient withdrawal amount!!! ");
			}
			
			else {
				balance = balance - withdrawamount;
				System.out.println("Withdrawal successful!");
				System.out.println("This is your current balance:" + balance);
				
			}
		}
	// method for checking users's current balance
	public void ShowBalance() {
		 
		 System.out.println("Your Current Balance is : " + balance);
	}
		

}
