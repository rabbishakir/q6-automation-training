import java.util.Scanner;

public class MovieTicketBooking {

    public static void main(String[] args) {

        // ---------------- Stage 1: Welcome Screen ----------------
        System.out.println("================================");
        System.out.println("   Welcome to CineQ6 Cinema    ");
        System.out.println("   Now Showing: Inception      ");
        System.out.println("================================");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        // Ticket categories — index 0: Minor, index 1: Adult, index 2: Senior
        String[] categories = {"Minor", "Adult", "Senior"};

        // Ticket prices — matches the same index as categories
        int[] prices = {15, 25, 10};

        // ---------------- Stage 2: Ask for Viewer Name and Age ----------------
        System.out.print("Enter viewer name: ");
        String name = scanner.nextLine().trim();

        if (name.isEmpty()) {
            System.out.println("Error: Name cannot be empty.");
        } else {
            System.out.print("Enter viewer age: ");
            int age = Integer.parseInt(scanner.nextLine());

            // ---------------- Stage 3: Age Validation and Price Lookup ----------------
            int categoryIndex = -1;

            if (age < 0) {
                System.out.println("Invalid age. Age cannot be negative.");
            } else if (age >= 0 && age <= 12) {
                categoryIndex = 0; // Minor
            } else if (age >= 13 && age <= 59) {
                categoryIndex = 1; // Adult
            } else {
                categoryIndex = 2; // Senior (60 and above)
            }

            if (categoryIndex != -1) {
                String category = categories[categoryIndex];
                int ticketPrice = prices[categoryIndex];

                // ---------------- Stage 4: Print the Booking Receipt ----------------
                System.out.println();
                System.out.println("================================");
                System.out.println("         BOOKING RECEIPT        ");
                System.out.println("================================");
                System.out.println("Cinema:   CineQ6 Cinema");
                System.out.println("Movie:    Inception");
                System.out.println("--------------------------------");
                System.out.println("Name:     " + name);
                System.out.println("Age:      " + age);
                System.out.println("Category: " + category);
                System.out.println("Price:    " + ticketPrice + " taka");
                System.out.println("--------------------------------");
                System.out.println("Thank you! Enjoy the movie.");
                System.out.println("================================");
            }
        }

        scanner.close();
    }
}
