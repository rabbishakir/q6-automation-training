package q6_2nd_project_movie_ticket;

import java.util.Scanner;

public class MovieTicketBooking {

	public static void main(String[] args) {

		String nameInput;
		String name;
		String ageText;
		int age;
		int categoryIndex;

		String[] category = { "Minor", "Adult", "Senior" };
		int[] prices = { 15, 25, 10 }; // Ticket prices in taka

		// stage One

		Scanner sc = new Scanner(System.in);

		System.out.println("================================");
		System.out.println("   Welcome to CineQ6 Cinema    ");
		System.out.println("   Now Showing: Inception      ");
		System.out.println("================================");
		System.out.println();

		// stage Two

		System.out.println("Enter viewer name: ");
		nameInput = sc.nextLine();
		name = nameInput.trim();

		if (name.isEmpty()) {
			System.out.println("Error: Name cannot be empty.");

		} else {
			System.out.println("Enter viewer age: ");
			ageText = sc.nextLine();
			age = Integer.parseInt(ageText);

			categoryIndex = -1;

			// Stage 3: Category Logic
			if (age < 0) {
				System.out.println("Invalid age. Age cannot be negative.");

			} else if (age >= 0 && age <= 12) {
				categoryIndex = 0; // Minor

			} else if (age >= 13 && age <= 59) {
				categoryIndex = 1; // Adult

			} else { // age is 60 or above
				categoryIndex = 2; // Senior
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
			System.out.println("Category: " + category[categoryIndex]);
			System.out.println("Price:    " + prices[categoryIndex] + " taka");
			System.out.println("--------------------------------");
			System.out.println("Thank you! Enjoy the movie.");
			System.out.println("================================");

		}

		sc.close();
	}

}
