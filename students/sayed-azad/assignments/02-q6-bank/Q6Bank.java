package q6_first_project;

import java.util.Scanner;

public class Q6Bank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String savedPin;
        String enteredPin;
        double balance;

        System.out.println("=== Welcome to Q6 Bank ===");
        System.out.println("You have reached the PIN setup page.");

        System.out.print("Enter a four digit PIN: ");
        savedPin = sc.nextLine();

        System.out.print("Enter your initial deposit (taka): ");
        balance = sc.nextDouble();

        sc.nextLine();

        System.out.println("PIN setup complete. Balance: " + balance + " taka");

        // Transaction page
        System.out.println();
        System.out.println("=== Welcome to Q6 Transaction Page ===");
        System.out.print("Enter a four digit PIN to access your account: ");
        enteredPin = sc.nextLine();

        // Compare the entered PIN with the saved PIN
        if (enteredPin.equals(savedPin)) {

            System.out.println("Access granted. Welcome!");
            System.out.println();

            System.out.println("=== Transaction Menu ===");

            while (true) {

                System.out.println("A - Show Balance");
                System.out.println("B - Withdraw");
                System.out.println("C - Deposit");
                System.out.println("D - Exit");

                System.out.print("Choose an option: ");
                char choice = Character.toUpperCase(sc.next().charAt(0));

                double amount;

                switch (choice) {

                    case 'A':
                        System.out.println();
                        System.out.println("Current balance: " + balance + " taka.");
                        System.out.println();
                        break;

                    case 'B':
                        System.out.println();
                        System.out.print("Enter amount to withdraw: ");
                        amount = sc.nextDouble();

                        if (amount <= balance) {
                            balance = balance - amount;
                            System.out.println("Withdrawal successful. New balance: " + balance + " taka.");
                        } else {
                            System.out.println("Insufficient balance.");
                        }

                        System.out.println();
                        break;

                    case 'C':
                        System.out.println();
                        System.out.print("Enter amount to deposit: ");
                        amount = sc.nextDouble();

                        balance = balance + amount;

                        System.out.println("Deposit successful. New balance: " + balance + " taka.");
                        System.out.println();
                        break;

                    case 'D':
                        System.out.println();
                        System.out.println("Thank you for using Q6 Bank. Goodbye.");
                        sc.close();
                        return;

                    default:
                        System.out.println();
                        System.out.println("Invalid option. Please try again.");
                        System.out.println();
                }
            }

        } else {
            System.out.println("Oops! Wrong PIN. Access denied.");
        }

        sc.close();
    }
}