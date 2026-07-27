package q6_2nd_project_movie_ticket;

import java.util.ArrayList;

public class EmailSorter {

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
		
		ArrayList<String> dotComEmails = new ArrayList<>();
		ArrayList<String> dotNetEmails = new ArrayList<>();
		ArrayList<String> dotOrgEmails = new ArrayList<>();
		
		for(int i = 0; i < rawEmails.length; i++) {
			
			String cleanEmail = rawEmails[i].trim().toLowerCase();
			
			if(!cleanEmail.contains("@")) {
				System.out.println("Invalid (no @ symbol): " + cleanEmail);
				
			}
			
			else if(cleanEmail.endsWith(".com")) {
				dotComEmails.add(cleanEmail);
				
			}
			
			else if(cleanEmail.endsWith(".net")) {
				dotNetEmails.add(cleanEmail);
				
			}
			else if(cleanEmail.endsWith(".org")) {
				dotOrgEmails.add(cleanEmail);
				
			}
			
			else {
				System.out.println("Invalid (unknown domain): " + cleanEmail);
            }
		}
			
		// Print .COM emails
		
		System.out.println("\n=== .COM Emails ===");
		for (String email : dotComEmails) {
            System.out.println(email);
        }
        System.out.println("Total .com: " + dotComEmails.size());
		
        // Print .NET emails
        System.out.println("\n=== .NET Emails ===");
        for (String email : dotNetEmails) {
            System.out.println(email);
        }
        System.out.println("Total .net: " + dotNetEmails.size());
		
     // Print .ORG emails
        System.out.println("\n=== .ORG Emails ===");
        for (String email : dotOrgEmails) {
            System.out.println(email);
        }
        System.out.println("Total .org: " + dotOrgEmails.size());

        // Total valid emails
        int totalValid = dotComEmails.size() + dotNetEmails.size() + dotOrgEmails.size();

        System.out.println("\nTotal valid emails sorted: " + totalValid + " of " + rawEmails.length);
    }


}


