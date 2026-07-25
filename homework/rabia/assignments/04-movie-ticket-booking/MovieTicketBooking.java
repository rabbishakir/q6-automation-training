package assinement_for_cinema;

// IMPORT Scanner
import java.util.Scanner;

// CREATE class MovieTicketBooking
public class MovieTicketBooking {
// CREATE main method
	public static void main(String[] args) {

		// PRINT "================================"
		System.out.println("================================");

		// PRINT " Welcome to CineQ6 Cinema "
		System.out.println("   Welcome to CineQ6 Cinema    ");

		// PRINT " Now Showing: Inception "
		System.out.println("   Now Showing: Inception      ");

		// PRINT "================================"
		System.out.println("================================");

		// PRINT blank line
		System.out.println("");

		// CREATE Scanner object
		Scanner sc = new Scanner(System.in);

		// PRINT "Enter viewer name: "
		System.out.println("Enter viewer name: ");

		// READ nameInput
		// SET name = nameInput with spaces trimmed
		String name = sc.nextLine().trim();

		// IF name is empty THEN PRINT "Error: Name cannot be empty."
		if (name.isEmpty()) {
			System.out.println("Error: Name cannot be empty.");
		}

		// ELSE PRINT "Enter viewer age: "
		else {
			System.out.println("Enter viewer age: ");
		}

		// READ ageText
		String ageText = sc.nextLine();

		// SET age = convert ageText to int
		int age = Integer.parseInt(ageText);

		// SET categoryIndex = -1
		int categoryIndex = -1;
		String[] categories = { "Minor", "Adult", "Senior" };
		int[] prices = { 15, 25, 10 };

		// IF age is less than 0 THEN PRINT "Invalid age. Age cannot be negative."
		if (age < 0) {
			System.out.println("Invalid age. Age cannot be negative.");
		}

		// ELSE IF age is between 0 and 12 THEN SET categoryIndex = 0 -- Minor
		else if (age > 0 && age < 12) {
			categoryIndex = 0;
			System.out.println("Minor");
		}

		// ELSE IF age is between 13 and 59 THEN SET categoryIndex = 1 -- Adult
		else if (age > 13 && age < 59) {
			categoryIndex = 1;
			System.out.println("Adult");
		}

		// ELSE -- age is 60 or above SET categoryIndex = 2 -- Senior
		else {
			categoryIndex = 2;
			System.out.println("Senior");
		}

		// IF categoryIndex is not -1 THEN
		if (categoryIndex != -1) {
		}
			// SET category = categories[categoryIndex]
			String category = categories[categoryIndex];

			// SET ticketPrice = prices[categoryIndex]
			int ticketPrice = prices[categoryIndex];

	

		// PRINT "================================"
		System.out.println("================================");

		// PRINT " BOOKING RECEIPT "
		System.out.println("         BOOKING RECEIPT        ");

        // PRINT "================================"
		System.out.println("================================");
		
		
		// PRINT "Cinema:   CineQ6 Cinema"
		System.out.println("Cinema:   CineQ6 Cinema");
		
		// PRINT "Movie:    Inception"
		System.out.println("Movie:    Inception");
		
		// PRINT "--------------------------------"
		System.out.println("--------------------------------");
		
		// PRINT "Name:     " + name
		System.out.println("Name:     " + name);
		
		// PRINT "Age:      " + age
		System.out.println("Age:      " + age);
		
		// PRINT "Category: " + category
		System.out.println("Category: " + category);
		
		// PRINT "Price:    " + ticketPrice + " taka"
		System.out.println("Price:    " + ticketPrice + " taka");
		
		// PRINT "--------------------------------"
		System.out.println("--------------------------------");
		
		// PRINT "Thank you! Enjoy the movie."
		System.out.println("Thank you! Enjoy the movie.");
		
		// PRINT "================================"
		System.out.println("================================");
		
		sc.close();
		
		

	}

}
