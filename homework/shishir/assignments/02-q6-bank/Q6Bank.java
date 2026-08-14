package practice_UserInput_Package;

import java.util.Scanner;//Scanner is imported

public class Q6Bank {

	public static void main(String[] args) {
//*****************************************************************************		
//******Scenario[1]--------- Welcome Message + PIN Entry-----------------------
//*****************************************************************************		
/*
************ What happens in Stage 1 *************
When the customer opens Q6 Bank, 
they see a welcome screen telling them they are on the PIN setup page. 
The system asks them to enter a 4-digit PIN and waits for them to type it. 
Nothing is validated yet — you are just building the entry point.	
*/		
/* PSEUDOCODE----[steps in plain English, so any one can understand, what are the course of action taken here in the following below code/programming]:
		 START
		-PRINT/Display a welcome screen with a message "=== Welcome to Q6 Bank ===",
		-PRINT/Display a message "You have reached the PIN setup page."
		-PRINT a blank line "",
		-SCANNER/ create the scanner object, so system can process the user input stream
		-PRINT/Display message for the user request "Enter a 4-Digit PIN" and system will waiting here for the user to enter the 4 digit for pin /not going to next command line
		-Enter/type the 4-digit PIN in the console and hit Enter
		-READ "enteredPin"
		END
 */				
		String WelcomeMessage="=== Welcome to Q6 Bank ===";//=== Welcome to Q6 Bank ===
		System.out.println(WelcomeMessage);
		String pinSetupMessage="You have reached the PIN setup page.";//You have reached the PIN setup page.
		System.out.println(pinSetupMessage);
		System.out.println();// printing a blank line
		
		
		Scanner sc = new Scanner (System.in);//Creating object of Scanner Class--->[Scanner Object]--------//just for one time-----so moving forward system can process the required methods of this class
			                                     
		System.out.println("Enter a 4-Digit PIN");//Enter a 4-Digit PIN in the consol----//system will keep waiting here at this line for the user, to enter 4 digit pin
		                                        //int enteredPin=sc.nextInt();//--do not use this code for java classic bug.   type/enter the 4 digit pin in the consol and hit 'Enter', it will display the message of the next line
		//system will take  actual user input by .nextLine()--------//asking Scanner object[sc] to READ [enteredPin]/the input stream as String text
		String enteredPin=sc.nextLine();      //FIX-1
		System.out.println("Pin entered");
	
//step 1 completed//
//******************************************************************************		
//******Scenario [2]-----------PIN Validation-----------------------------------
//******************************************************************************		
/*
		 ******What happens in Stage 2***** 		
		The bank system checks what the customer typed as their PIN. 
		3 rules apply: 
			it cannot be empty, 
			it must be exactly 4 digits.
			If too short, tell them how many more digits they need. 
			If too long, tell them how many to remove. 
		If valid, save the PIN as systemPin — the system will remember this and compare it at login.
*/	
	/*
	 PSEUDOCODE

SET systemPin = ""

IF enteredPin is empty THEN
  PRINT "Error: PIN cannot be empty."

ELSE IF length of enteredPin is less than 4 THEN
  SET missing = 4 minus length of enteredPin
  PRINT "PIN too short. Add " + missing + " more digit(s)."

ELSE IF length of enteredPin is greater than 4 THEN
  SET extra = length of enteredPin minus 4
  PRINT "PIN too long. Remove " + extra + " digit(s)."

ELSE
  SET systemPin = enteredPin
  PRINT "PIN saved successfully."

END IF
	 */		
		
		//String systemPin ="";//a String systemPin variable set to an empty string. 
		                     //This will be filled only if the PIN passes all checks.
		
		
		//String systemPin="1234";//declaring systemPin here as String to use this for all the Pin validation check.// after validation check, we will convert this to int value 
		//String enteredPin="1234";
		//System.out.println(systemPin);
	    
		//System.out.println(systemPin.length());//display the length of pin user entered
		
		if (enteredPin.isEmpty()) {
			System.out.println("Error: PIN cannot be empty.");
		}
		else if (enteredPin.length()<4) {
			
		int	missingDigit =4-(enteredPin.length());//if user entered 3 digit , then [4-3=1], 1 more digit need to add
			
			System.out.println("PIN is too short. Add" +" " + missingDigit + " "+"more digit");//PIN is too short. Add 2 more digit//if I entered 2 digits
		}
		else if(enteredPin.length()>4) {
			int extraDigit=(enteredPin.length())-4;	//if user entered 5 digit , then 5-4=1, 1 digit needs to remove
			System.out.println("PIN is too long. Remove"+" "+ extraDigit+" "+"digit.");//PIN is too long. Remove 3 digit.//if I entered 7 digit
		}
		else {
			
			                //int intSystemPin =Integer.parseInt(enteredPin); // FIX[3]: systemPin simply saves the enteredPin as a String -- no need to convert to int.
			                //intSystemPin =enteredPin;               
			System.out.println("PIN saved successfully");//PIN saved successfully// If I entered 4 digit
			
//******Scenario [2] completed//
		/*
		 *Placement matters: Stage 3 code goes INSIDE the final else block from Stage 2 — right after systemPin = enteredPin. 
		 *This means the deposit screen only appears when the PIN was valid. Wrong PIN — no deposit screen. 
		*/			
//******************************************************************************
//******Scenario[3]-----------Initial Deposit-----------------------------------	
//******************************************************************************			
	        //****Ask for opening balance — validate it is positive — store as balance		
	/*
			 ***** What happens in Stage 3*************
	 After the PIN is saved, 
	the bank asks the customer to make their opening deposit. 
	The amount must be a positive whole number. 
	If they enter zero or a negative number, the system rejects it.
	If valid, the amount is stored as balance — this variable will be updated every time they deposit or withdraw.
	 */						
	/* 
			PSEUDOCODE— inside the valid PIN else block
PRINT "Enter your initial deposit (taka): "
READ initialDepositText-----------------------by scanner
SET initialDepositAmount = convert initialDepositText to int

IF initialDepositAmount is less than or equal to 0 THEN
  PRINT "Error: Deposit must be greater than zero."
ELSE
  SET balance = initialDepositAmount
  PRINT "PIN setup complete. Balance: " + balance + " taka."
  -- Stage 4 goes here inside this else --
END IF
	*/			
			System.out.println("Enter your initial deposit (taka): ");//system will wait here for user input. 
			               // so now, I will use the scanner method to process user input
			 //system will take  actual user input by .nextLine()--------//asking Scanner object[sc] to READ [initialDepositText] as String text
			String initialDepositText=sc.nextLine();//system will take  actual user input by   .nextLine()    //asking scanner method to read user input[deposit entery] as text ---------- by scanner					   	
					    //int depositAmount= sc.nextInt());//do not use .nextInt() method here---- FIX[4]: .nextInt() replaced with .nextLine() + Integer.parseInt() -- same ghost \n bug fix.
			                                   //declaring a new  variable [depositAmount] to Intiger, 
			                                  //becasue-user will deposit integer value Money.
						//String initialDepositAmount= sc.nextLine();//will check			
			int initialDepositAmount= Integer.parseInt(initialDepositText);			
						//---int depositAmount= Integer.parseInt(sc.nextLine());
						//and I'm using .nextInt()--Scanner Class Method to PROCESS the user's intiger value, that is money.
						//user will type/enter the 4 digit pin in the consol and hit 'Enter',
			        	//when Hit Enter, the system will process the user's input and display the next line's message according to the check over the user input validation,			
			if (initialDepositAmount<=0) {
				System.out.println("Error: Deposit must be greater than zero.");
			}
			else {
		
			int balance = initialDepositAmount; //why I need this code? ----declaring another variable [balance] to Intiger?
				//Rabbi's Answer:balance must be a separate variable:
				//depositAount is one time read--it only exists to capture what the user typed for the opening deposit. It never changes.
				//but balance in my running total---every time the user withdraws or deposits money,
				//system update the balance.---herein our homework, this balance will changes/update throughout the program.
				//**********do this code at this place*******
				System.out.println("PIN setup complete. Balance: " + balance + " taka.");
//*****scenario 3 completed					
/*
//******************************************************************************
*****Scenario[4]----------*Login Screen-------------Print the transaction page header and ask the customer for their PIN again
//******************************************************************************
 *******What happens in Stage 4

After the deposit is confirmed, 
the system moves to the transaction page. 
This is a separate screen. 
It prints the transaction page header and 
asks the customer to enter their PIN again. 
This is the login step — the customer must prove they know the PIN before seeing the menu.				
 */
				System.out.println("");
				System.out.println("=== Welcome to Q6 Transaction Page ===");
				System.out.println("Enter your PIN to access your account: ");//system will wait for user input here
//***scenario 4 completed	
//******************************************************************************				
/*
*********** ****scenario [5]------PIN Verification------------------------------
//******************************************************************************
			   -----Compare loginPin to systemPin — grant access or deny it				
*/												
				//String loginPin=sc.nextLine();//Storing the login PIN in a new variable called loginPin
				     //do not use the enteredPin that we used to setup the PIN.
				     //this is a separate read			
/*
       
       //This approach didn't work for me here
				if(loginPin.equals(systemPin)) {					
					System.out.println("Access granted. Welcome!"); 
					 //-- Stage 6 Transaction Menu goes here --			
				}
				else {
			System.out.println("Wrong PIN. Access denied.");
				}				
				//int IntloginPin = Integer.parseInt(loginPin);
				//the above code is not supporting .equal() method with string value. 
				//so. i'm working out with the below process integer value comparison ==
*/
				
				//int loginPin=sc.nextInt();// FIX[5]: loginPin should be String, not int -- PIN is always text.
			
				
				String loginPin = sc.nextLine();//system will take actual user input by .nextLine()     //reading the login PIN as String
				
			if (loginPin.equals(enteredPin)) {
				System.out.println("Access granted. Welcome!"); 
				
 /*				 -after login the customer sees the transaction menu. 
				 -They choose an option by typing a letter. 
				 -The system uses a switch statement to decide what to do. 
				 -In this stage build the full switch structure with all four cases — but leave B and C as placeholder comments. Stage 7 fills those in. 
			
		 //- Stage 6 Transaction Menu should come here --//Fix 7---section placement	correction	
*/
				System.out.println("");//print a blank line
				System.out.println("=== Transaction Menu ===");
				System.out.println("Choose an option: ");
				System.out.println("A - Show Balance");
				System.out.println("B - Withdraw");
				System.out.println("C - Deposit");
				System.out.println("D - Exit");
			}
			else {
				System.out.println("Wrong PIN. Access denied.");
					}
//***scenario 5 completed
//******************************************************************************
//****Scenario [6]: Transaction Menu — Switch	--------------------------------
//******************************************************************************			
//****Scenario [7]Withdraw + Deposit Logic	
//******************************************************************************
			
			//char usersChoosenOption=sc.nextLine().charAt(0);//this should always avoid. FIX[8]: sc.next().charAt(0) replaced with sc.nextLine() to stay consistent and avoid ghost \n issues.
		 //system will take  actual user input for [usersChoosenOption] by .nextLine()	
		//Scanner object [sc] will process that user input [as per the code requirement--for example: here it will so additional process to make user input as upper Case]and read that as Sting text as upper Case 	
			String usersChoosenOption = sc.nextLine().toUpperCase(); 
			switch (usersChoosenOption) {
			
			case "A":
			          //Show Balance
			      System.out.println("Balance: " + balance + " taka.");
			break;						
	/*
		*PSEUDOCODE — Case B: Withdraw
			 
PRINT "Enter amount to withdraw: "
READ withdrawText-----------------------by scanner
SET withdrawAmount = convert withdrawText to int

IF withdrawAmount is greater than 0 AND withdrawAmount is less than or equal to balance THEN
  SET balance = balance minus withdrawAmount
  PRINT "Withdrawal successful. New balance: " + balance + " taka."

ELSE IF withdrawAmount is less than or equal to 0 THEN
  PRINT "Error: Amount must be greater than zero."

ELSE
  PRINT "Error: Insufficient balance. Available: " + balance + " taka."

END IF
	 */			
			case "B":
				//Part A--- Withdraw---logic[case-B]		
			   System.out.println("Enter amount to withdraw: ");	
			                                                  //int usersWithdraw=sc.nextInt();//why this dosn't work here for withdraw action?
			                                                 // int depositAmount= sc.nextInt();//when, this worked for deposit action!		    
			   //system will take  actual user input by .nextLine()//asking Scanner object[sc] to READ usersWithdrawAmountText as String text
			   //system will take  actual user input for [usersWithdrawAmountText] by .nextLine()-----Scanner object [sc] will process that user input and read that as Sting //asking Scanner object[sc] to READ user's input  as String text
			   String usersWithdrawAmountText = sc.nextLine(); //????---------why I'v to go for String-scanner? 
			                                           //and then one more extra step to convert that to a new variable in int value.
												      // Rabbi ans: it's classic java scanner bug that every beginner will face.
			                                         //The Fix-always use String  .nextLine and convert it to int using Interger.perseInt()
	       int usersWithdrawAmountInt=Integer.parseInt(usersWithdrawAmountText);//converting String to Int
	    
	        if (usersWithdrawAmountInt>0 && usersWithdrawAmountInt<= balance) {
	        	
	        	balance=balance-usersWithdrawAmountInt;
	        	
	   // int currentBalance=(balance-usersWithdrawAmountInt);// no need to create another new variable as currentBalance,
	   //coz, we already created a variable called [balance] that will take variable so,when [balance-usersWithdrawAmountInt], 
	   //this  will be another balance that can be as a variable for the previous balance. becoz the the value vary!. 
	    		System.out.println("Withdrawal successful. New balance: " + balance + " taka.");	    		
			}
	        else if(usersWithdrawAmountInt<=0) {
	        	
	        	System.out.println("Error: Amount must be greater than zero.");
	        }
	        else {
	        	System.out.println("Error: Insufficient balance. Available: " + balance + " taka.");
	        }
			 
	        break;		
	/*
	 PSEUDOCODE — Case C: Deposit
	 
PRINT "Enter deposit amount: "
READ UsersNewDepositText-----------------------by scanner
SET newDepositAmount = convert to int

IF UsersNewDepositAmount is less than or equal to 0 THEN
  PRINT "Error: Amount must be greater than zero."
ELSE
  SET balance = balance + UsersNewDepositAmount
  PRINT "Deposit successful. New balance: " + balance + " taka."
END IF		
	 */	        
			case "C":        
				 		//Part B--- Deposit---logic [case-C]				 
				System.out.println("Enter deposit amount: ");
				
				String UsersNewDepositText= sc.nextLine();//system will take  actual user input by .nextLine()   //scanner to  process user input---//asking Scanner object[sc] to READ newDepositText as String text		
				int UsersNewDepositAmount=Integer.parseInt(UsersNewDepositText);// converting  string text to int  by using the .parseInt() method of Integer class
			
				if (UsersNewDepositAmount<=0) {						
				System.out.println("Error: Amount must be greater than zero.");
				}
				else {
					balance= balance + UsersNewDepositAmount;					
					System.out.println( "Deposit successful. New balance: " + balance + " taka.");
				}						  
				 break;	
				 
	      case "D":
				      //Exit-message	    	  
				 System.out.println("Thank you for using Q6 Bank. Goodbye.");
				break;		
	
			default:
			System.out.println("Invalid option. Please choose A, B, C, or D.");
			break;
		
			}										
			sc.close();//Closing the scanner object---//it's a good programming practice//to be sure to close this scanner object to prevent resource leaks//data leaks//data security concerns		
			}			
			}
}
}
							
								
					
		
			
			
		                        
		
	
		
		
	

