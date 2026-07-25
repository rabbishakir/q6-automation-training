package movieTickets_emailSortout;

import java.util.Scanner;

public class CineQ6_MovieTicketBooking {

	public static void main(String[] args) {
		//Ticket categories - index 0 : Minor, index 1 : Adult, index 2: Senior // 
		String[] categories = {"Minor", "Adult", "Senior"};
		
		// Ticket prices - matches the same index as categories // 
		 int[] prices = {15, 25, 10}; 
		
		
		 // Stage 1 -- Welcome Screen 
		 System.out.println(
				  "========================\n\n"
				+ "Welcome to CineQ6 Cinema\n"
				+ "Now Showing : Inception\n\n"
				+ "=========================="
		 		 );
		
		 //Stage 2 -- Ask for Viewer Name and Age 
		 Scanner sc = new Scanner(System.in); // input scanner 
		 System.out.println("Enter viewer name : "); // ask for input name. 
		 String inputName = sc.nextLine().trim(); // read the input and trim the spaces 
		 
		 // Conditions 
		 if (inputName == null | inputName.isBlank() ) {   
			 System.out.println("Error: Name cannot be empty."); // if the name input is blank
		 } else 
			 if (! inputName.matches("[a-z A-Z]+")) {
				 System.out.println("Error: Name not Logical."); // if name is number or special characters 
			 } else
				 if (inputName.trim().length() < 2) {			// trim and single word is not a name logic. 
					 System.out.println("Error: Name can't be one word. ");
				
					 // === age related conditions starts here === // 
				 } else { 
					// ask for age input  
					System.out.println("Enter viewer age: ");
					int age = sc.nextInt(); // read the age as integer value. 
					
					// stage 3 Age Validation and price lookup 
				 	int catIndex = -1; // use as default index for indexing 
					
					if (age < 0 | age> 150) {
						; // age range between 0-150 years 
					}else 
						if (age >= 0 && age <= 12 ) {
							catIndex = 0; // minor category age range
						}else 
							if (age >= 13 && age <= 59 ) {
								catIndex = 1 ; // adult category age range
							}else  {
								catIndex = 2; // senior category age range
								  }
			
					 
				// stage 04 Print the Booking Receipt 
					
					 System.out.println(
							  "========================\n"
							+ "    BOOKING RECEIPT     \n"
							+  "========================\n"		  
							+ "Cinema: CineQ6 Cinema \n"
							+ "Movie : Inception \n\n"
							
							+ "------------------------\n"
							+" Name  : " + inputName +" \n"
							+" Age   : " + age       + "\n"
							+" Category: " + categories[catIndex] + "\n"
							+" Price   : " + prices[catIndex] + "taka \n"
							+ "------------------------\n"
							+"Thank you ! Enjoy the movie. \n"
							+ "============================="
					 		 );
				 
				 }
			 		sc.close();	
	} 

}
