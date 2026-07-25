package qa_automation_with_java;

import java.util.Scanner;

public class MovieTicketBooking {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

        // Header
        System.out.println("================================");
        System.out.println("   Welcome to CineQ6 Cinema");
        System.out.println("   Now Showing: Inception");
        System.out.println("================================");
        System.out.println();

        // Input name
        System.out.print("Enter viewer name: ");
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Error: Name cannot be empty.");
        } else {

            // Input age
            System.out.print("Enter viewer age: ");
            int age = Integer.parseInt(scanner.nextLine());

            String category;
            int price;

            if (age < 13) {
                category = "Minor";
                price = 10;
            } else if (age < 60) {
                category = "Adult";
                price = 25;
            } else {
                category = "Senior";
                price = 15;
            }

            // Receipt
            System.out.println();
            System.out.println("================================");
            System.out.println("         BOOKING RECEIPT");
            System.out.println("================================");
            System.out.println("Cinema:   CineQ6 Cinema");
            System.out.println("Movie:    Inception");
            System.out.println("--------------------------------");
            System.out.println("Name:     " + name);
            System.out.println("Age:      " + age);
            System.out.println("Category: " + category);
            System.out.println("Price:    " + price + " taka");
            System.out.println("--------------------------------");
            System.out.println("Thank you! Enjoy the movie.");
            System.out.println("================================");
        }

        scanner.close();
	}
}
