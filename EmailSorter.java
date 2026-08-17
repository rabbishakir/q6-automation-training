package afia_first_project;

import java.util.ArrayList;

public class EmailSorter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        //Colour Entry
				final String GREEN = "\u001B[32m";
				final String RED = "\u001B[31m";
				final String RESET = "\u001B[0m";
				
		
		// Raw email data — messy, mixed case, extra spaces. Array of length 9
		String[] rawEmails = 
			
			{
		    "  azim@gmail.com  ",       // has spaces
		    "SABRINA@OUTLOOK.NET",       // uppercase
		    "hasan@yahoo.com",            // clean
		    "  RAISUL@SCHOOL.ORG  ",     // spaces + uppercase
		    "sayed@hotmail.net",          // clean
		    "rabbi@training.org",         // clean
		    "  nadia@company.com  ",      // has spaces
		    "INVALID-EMAIL-NO-DOMAIN",    // no valid domain
		    "support@helpdesk.net"        // clean
		};
		// 3 empty Arrarylist is being created
		ArrayList<String> dotComEmails = new ArrayList<>();
		ArrayList<String> dotNetEmails = new ArrayList<>();
		ArrayList<String> dotOrgEmails = new ArrayList<>();
		
		// checking each email according to array index and saving it to cleanEmail variable
		for(int i =0; i<= rawEmails.length-1; i++ ) {
			
			String cleanEmail = rawEmails[i];
			
			//trim() and tolowercase()method applied for removing space and making all character into lowercase.
			cleanEmail = cleanEmail.trim().toLowerCase();
			
			boolean isContain = cleanEmail.contains("@");
			
			//checking down domain and add it to correct list
			
			if (!isContain) {
				System.out.println(RED + "Invalid (no @ symbol): " + cleanEmail + RESET);
			}
			
			else if(cleanEmail.endsWith(".com")) {
				dotComEmails.add(cleanEmail);
			}	
			else if (cleanEmail.endsWith(".net")) {
				
				dotNetEmails.add(cleanEmail);
			}
			else if (cleanEmail.endsWith(".org")) {
				dotOrgEmails.add(cleanEmail);
			}
			
			else {
				System.out.println(RED + "Invalid (unknown domain): " + cleanEmail + RESET);
			}
			
			}
		 System.out.println();
		 
		 // running loop to get each value of array list and print
		 System.out.println("=== .COM Emails ===");
		 
		 for (int i = 0 ; i < dotComEmails.size(); i++ ) {
			 System.out.println(dotComEmails.get(i));
		 }
		 System.out.println(GREEN + "Total .com: " + dotComEmails.size()+ RESET);	 
		 
		 System.out.println();
		 System.out.println("=== .NET Emails ===");
		 
		 // running loop to get each value of array list and print
		 for (int i = 0 ; i < dotNetEmails.size(); i++ ) {
			 System.out.println(dotNetEmails.get(i));
		 }
		 System.out.println(GREEN + "Total .net: " + dotNetEmails.size()+ RESET);
		 
		 
		 System.out.println();
		 System.out.println("=== .ORG Emails ===");
		 
		 // running loop to get each value of array list and print
		 for (int i = 0 ; i < dotOrgEmails.size(); i++ ) {
			 System.out.println(dotOrgEmails.get(i));
		 }
		 System.out.println(GREEN + "Total .org: " + dotOrgEmails.size()+ RESET);
		
		 System.out.println();
		 // total valid email count out of total email data.
		 int totalValid = dotComEmails.size()+ dotNetEmails.size()+dotOrgEmails.size();
		 System.out.println(RED + "Total valid emails sorted: " + totalValid + " of " + rawEmails.length + RESET);
		}
	
	
	
	
	

	}


