package movieTickets_emailSortout;

import java.util.ArrayList;

public class Email_Sorter_QA_Data_Validation {


	public static void main(String[] args) {
		// Raw email data — messy, mixed case, extra spaces
		String[] rawEmails = {
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
  //Stage 1-- Set Up the Three 
	ArrayList<String> dotComEmails = new ArrayList<String>(); // Create .com ArrayList
	ArrayList<String> dotNetEmails = new ArrayList<String>(); // Create .net ArrayList
	ArrayList<String> dotOrgEmails = new ArrayList<String>(); // Create .org ArrayList

 // Stage 2 -- The for Loop: Clean and Sort 
	
	for (int i= 0; i< rawEmails.length ; i++) {              //trim and convert lowercase 
		rawEmails[i] = rawEmails[i].trim().toLowerCase();
	 	if (!rawEmails[i].contains("@")) {  
	 		System.out.println("Invalid (no @ symbol): " + rawEmails[i] ); // only print what data is invalid. 
	 		} else if (rawEmails[i].endsWith(".com")) {		 // sort the .com data to dotCom array 
	 			dotComEmails.add(rawEmails[i]);
	 		} else if (rawEmails[i].endsWith(".net")) {		 // sort the .net data to dotCom array
	 			dotNetEmails.add(rawEmails[i]);
	 		} else if (rawEmails[i].endsWith(".org")) {		 // sort the .org data to dotCom array
	 			dotOrgEmails.add(rawEmails[i]);
	 		} else {
	 			System.out.println("Invalid (unknown domain): " + rawEmails); // any data that are not logical
	 		}
	 	
	 	};	
	 	
	 	//Stage 3-- Print Each Sorted List
	 	
	 	System.out.println("\n\n"                   // print .com arraylist as formated  
	 			+ "=== .COM Emails ===");
	 	for (int i = 0 ; i< dotComEmails.size(); i++) { 
	 		System.out.println(dotComEmails.get(i));
	 	};
	 	System.out.println("Total .com:" + dotComEmails.size());
	 	
	 	
	 	System.out.println("\n\n"				  // print .net arraylist as formated 
	 			+ "=== .NET Emails ===");
	 	for (int i = 0 ; i< dotNetEmails.size(); i++) { 
	 		System.out.println(dotNetEmails.get(i));
	 	};
	 	System.out.println("Total .Net:" + dotNetEmails.size());
	
	 	
	
	 	System.out.println("\n\n"              // print .org arraylist as formated 
	 			+ "=== .ORG Emails ===");
	 	for (int i = 0 ; i< dotOrgEmails.size(); i++) { 
	 		System.out.println(dotOrgEmails.get(i));
	 	};
	 	System.out.println("Total .org:" + dotOrgEmails.size());
	
	 
	 	System.out.println("");// print blank line  // blank line
	 	
	 	int totalValid = dotComEmails.size() + dotNetEmails.size() + dotOrgEmails.size() ;  // total valid emails.
	 	System.out.println("Total valid emails sorted: " +totalValid + " of " + rawEmails.length); 
	
		
	}

}
