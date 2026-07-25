package Q6_Bank;
import java.util.Scanner;
public class q6bank {

	public static void main(String[] args) {
		// Home page message 
		System.out.println("=== Welcome to Q6 Bank ===");
		System.out.println("You have reached the PIN setup page.");
		System.out.println();
		
		//Scanner input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 4-digit PIN: ");
		String Pincode = sc.nextLine();
		
		
		if(Pincode.isEmpty()) {
			System.out.println("Error: PIN cannot be empty.");
		} else 
			if (Pincode.length() < 4) {
				int missing = 4- Pincode.length();
				System.out.println("PIN too short. Add " + missing + " more digit(s).");
		} else 
			if (Pincode.length() > 4) { 
				int Extra = Pincode.length()-4;
				System.out.println("PIN too long. Remove " + Extra + " digit(s).");
		}else {
			Scanner dp = new Scanner(System.in);
			System.out.println("Enter your initial deposit ( taka): ");
			int depositAmount = dp.nextInt();
			
			
		 if (depositAmount <= 0) {
			 System.out.println("Error: Deposit must be grater than zero");
		 } else {
			int Balance = depositAmount;
			 System.out.println("Pin steup Complete. Balace: "+ Balance + " taka.");
			 System.out.println();
			   // Stage 04
			  String loginPin = Pincode;
				
				// login screen
				System.out.println("=== Welcome to Q6 Transaction Page ===");
				Scanner pc = new Scanner(System.in);
				
				System.out.println("Enter your PIN to access your account: ");
				
				
				// taking pin
				
				String enteredPin = pc.nextLine(); 
				// Stage  05
					if (enteredPin.equals(loginPin)) { 
						System.out.println("Access granted.Welcome!");
					
						
						// 6. Transaction Menu -- Switch
						
						System.out.println();
						System.out.println("=== Transaction Menu ===");
						System.out.println("A - Show Balance ");
						System.out.println("B - Withdraw ");
						System.out.println("C- Deposit ");
						System.out.println("D- Exit ");
						
						
						Scanner mc = new Scanner (System.in);
						System.out.println("Choose an option: ");
						char enterChar = mc.next().charAt(0);  // input the choice 
						
						char upperM = Character.toUpperCase(enterChar); // convert into Capital 
						
						char Manu = upperM ; 
						
						switch (Manu) {
							case 'A' : System.out.println("Current Balance: " + Balance + " taka.");
							break;
							case 'B' : // stage 7 part a 
								    
											
										Scanner wd = new Scanner (System.in); // input scanner 
										  System.out.println("Enter amount to withdraw: "); 
										  String wAmount = wd.nextLine();
										  
										  int WithdrawAmount = Integer.parseInt(wAmount);	// convert input str to int value //
										  
										  if (WithdrawAmount > 0 && WithdrawAmount <= Balance ) {
											int Ubalance = Balance - WithdrawAmount ; 
											System.out.println("Withdrawal successful. New balance: " + Ubalance + " taka.");
											
										  } else if (WithdrawAmount <= 0) {
											  System.out.println("Error: Amount must be grater than zero.");
										  } else {
											  System.out.println("Error: Insufficient balance. Available: " + Balance + "Taka.");
										  }
										  
										 wd.close();  // end stage 7  part a 
							break;
							case 'C' : // stage 7  part b 
									
								  Scanner nDa= new Scanner ( System.in); // input scanner 
								  System.out.println("Enter Deposit amount: "); 
								  String dAmount = nDa.nextLine();
								  
								  int nDepoAmount = Integer.parseInt(dAmount);	
								  
								  if (nDepoAmount <= 0 ) {
									System.out.println("Error: Amount must be greater than zero. ");
									
								  } else {
									  int fBalance = Balance + nDepoAmount ; // final balance after deposit 
									  System.out.println("Deposit successful. New balance: " + fBalance + "Taka.");
								  }
								  
								nDa.close();  // end stage 7 part b 
									
							break;
							case 'D' : System.out.println("Thank you for using Q6 Bank. Goodbye.  ");
							break;
						    default : System.out.println("Invalid option. Please choose A, B, C, or D. ");
						     
						   
						}
	 mc.close();
						
					
					} else {
						System.out.println("Wrong PIN, Access denied. " ) ; 
					}
	 pc.close();
		 }
		 
	 dp.close();
			
		} 
	
	 sc.close(); 
	
	}

}



