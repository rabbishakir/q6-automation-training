package afia_first_project;

import java.util.Scanner;

public class MovieTicketBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Colour Entry
		final String GREEN = "\u001B[32m";
		final String RED = "\u001B[31m";
		final String RESET = "\u001B[0m";
		
		
        // Print command
		System.out.println(GREEN + "========================================" + RESET);
		System.out.println(GREEN + "          MOVIE TICKET BOOKING          " + RESET);
		System.out.println(GREEN + "========================================" + RESET);
		System.out.println(GREEN + " Cinema      : CineQ6 Cinema           " + RESET);
		System.out.println(GREEN + " Movie       : Inception               " + RESET);
		System.out.println(GREEN + " Showtime    : 7:30 PM                 " + RESET);
		//System.out.println(GREEN + " Ticket Price: $15.00                  " + RESET);
		System.out.println(GREEN + "----------------------------------------" + RESET);
		System.out.println();
		
		// user input for viewer's name 
		Scanner sc = new Scanner(System.in);
		System.out.println(GREEN + "Enter viewer name: " + RESET);
		
		String name = sc.nextLine().trim().replaceAll("\\s+", " ");
		System.out.println("Viewer's Sorted name: " + name);
		
		//user name can not be empty check
		Boolean isEmpty = name.isEmpty();
		
		if(isEmpty) {
			System.out.println(RED + "Error: Name cannot be empty." + RESET);
			
		}
		else {
			// user input for viewer's age
			System.out.println(GREEN + "Enter viewer age: " + RESET);
			String ageText = sc.nextLine();
			
			// string to integer conversion [type casting]
			int age = Integer.parseInt(ageText);
			
			int categoryIndex = -1;
			
			// age category check
			if(age < 0) {
				System.out.println(RED + "Invalid age. Age cannot be negative." + RESET);
			}
			
			else if (age>=0 && age<=12) {
				categoryIndex = 0;
				
			}
			else if(age>=13 && age<=59) {
				
				categoryIndex = 1;
			}
			
			else if(age >=60){
				categoryIndex = 2; 
				
			}
			
			if(categoryIndex !=-1) {
				// array declaration
				String [] categories = {"Minor","Adult","Senior"};
				double [] prices = {15.0, 25.0,10.0};
				 
				String category = categories[categoryIndex];
				double ticketPrice = prices[categoryIndex];
				
				
				System.out.println(GREEN + "================================" + RESET);
				System.out.println(GREEN + "         BOOKING RECEIPT        " + RESET);
				System.out.println(GREEN + "================================" + RESET);
				System.out.println(GREEN + "Cinema:   CineQ6 Cinema" + RESET);
				System.out.println(GREEN + "Movie:    Inception" + RESET);
				System.out.println(GREEN + "Showtime: 7:30 PM" + RESET);
				System.out.println(GREEN + "--------------------------------" + RESET);
				System.out.println(GREEN + "Name:     " + name + RESET);
				System.out.println(GREEN + "Age:      " + age + RESET);
				System.out.println(GREEN + "Category: " + category + RESET);
				System.out.println(GREEN + "Price:    " + ticketPrice + " taka" + RESET);
				System.out.println(GREEN + "--------------------------------" + RESET);
				System.out.println(RED + "Thank you! Enjoy the movie." + RESET);
				System.out.println(GREEN + "================================" + RESET);
				//System.out.println();
				
				sc.close();
			}
			
		}
		
		
		
		
	}

}
