package mini_Banking_Application;

import java.util.Scanner;
public class BankAppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//User username = new User(name, email);
		
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("Enter your Name:");
		String name = sc.nextLine().strip();

		System.out.println("Enter your Email Address:");
		String email = sc.nextLine().strip().toLowerCase();

		boolean isValidName =
		        name.length() >= 3 &&
		        name.length() <= 8;

		int atIndex = email.indexOf("@");

		boolean isValidEmail =
		        atIndex >= 3 &&
		        atIndex <= 8 &&
		        email.endsWith(".com");

		if (!isValidName) {
		    System.out.println(
		        "Name is invalid input .It must contain between 3 to 8 characters."
		    );
		}
		else if (!isValidEmail) {
		    System.out.println(
		        "Email is invalid . It must contain 3 to 8 characters before @."
		    );
		}
		
		else {
		System.out.println("Name and email are valid.");
		BankApplication bankApp = new BankApplication();
		
		bankApp.register(name, email);
		
		System.out.println("Create your PIN:");
		int PIN = sc.nextInt();
		
		bankApp.user.setpin(PIN);
		
		
		bankApp.user.createAccount();
		
		bankApp.user.showprofile();
		
		System.out.println("Enter your PIN to login: ");
		
		int enteredPin = sc.nextInt();
		bankApp.login(enteredPin);
		sc.nextLine();
		
		//System.out.println("Trying wrong PIN:");
		//bankApp.login(5555);
		
		//System.out.println("Trying correctPin:");
		//bankApp.login(PIN);
		String choice;
		do{
			
		System.out.println();
		System.out.println( "=== Transaction Menu ===");
		System.out.println("A - Deposit");
		System.out.println("B - Withdraw");
		System.out.println("C - Show Balance");
		System.out.println("D - Exit");
		
		
		//sc.nextLine(); // clear leftover newline

		System.out.print("Choose an option for Account transaction: ");
		choice = sc.nextLine().toUpperCase();

		switch (choice) {

		case "A":
		    System.out.println("Please enter your deposit amount");
		    double depositAmount = sc.nextDouble();
		    //sc.nextLine(); // clear leftover Enter
		    bankApp.user.account.Deposit(depositAmount);
		    sc.nextLine(); // clear leftover Enter
		    System.out.println("Your account balance is:" + bankApp.user.account.balance);
		    break;

		case "B":
		    System.out.println("Please enter your withdraw amount");
		    double withdrawAmount = sc.nextDouble();
		    bankApp.user.account.Withdraw(withdrawAmount);
		    sc.nextLine(); // clear leftover Enter
		    System.out.println("Your account balance is:" + bankApp.user.account.balance);
		    break;

		case "C":
		    bankApp.user.account.ShowBalance();
		    break;

		case "D":
		    bankApp.logout();
		    System.out.println("Thank you for using our bank. Goodbye.");
		    break;

		default:
		    System.out.println("Invalid option");
		}
		
		} while (!choice.equals("D"));
		
		//bankApp.logout();
		sc.close();
    }
		
		

   }
}
