package qa_automation_with_java;

import java.util.ArrayList;

public class EmailSorter {
	public static void main(String[] args) {
		
		   // Raw email data — messy, mixed case, extra spaces
        String[] rawEmails = {
            "  azim@gmail.com  ",
            "SABRINA@OUTLOOK.NET",
            "hasan@yahoo.com",
            "  RAISUL@SCHOOL.ORG  ",
            "sayed@hotmail.net",
            "rabbi@training.org",
            "  nadia@company.com  ",
            "INVALID-EMAIL-NO-DOMAIN",
            "support@helpdesk.net"
        };

        // Create three empty ArrayLists
        ArrayList<String> dotComEmails = new ArrayList<>();
        ArrayList<String> dotNetEmails = new ArrayList<>();
        ArrayList<String> dotOrgEmails = new ArrayList<>();

        // Loop through every email
        for (int i = 0; i < rawEmails.length; i++) {

            // Clean the email
            String cleanEmail = rawEmails[i].trim().toLowerCase();

            // Validate and sort
            if (!cleanEmail.contains("@")) {
                System.out.println("Invalid (no @ symbol): " + cleanEmail);
            } else if (cleanEmail.endsWith(".com")) {
                dotComEmails.add(cleanEmail);
            } else if (cleanEmail.endsWith(".net")) {
                dotNetEmails.add(cleanEmail);
            } else if (cleanEmail.endsWith(".org")) {
                dotOrgEmails.add(cleanEmail);
            } else {
                System.out.println("Invalid (unknown domain): " + cleanEmail);
            }
        }

        // Print .com emails
        System.out.println();
        System.out.println("=== .COM Emails ===");
        for (int i = 0; i < dotComEmails.size(); i++) {
            System.out.println(dotComEmails.get(i));
        }
        System.out.println("Total .com: " + dotComEmails.size());

        // Print .net emails
        System.out.println();
        System.out.println("=== .NET Emails ===");
        for (int i = 0; i < dotNetEmails.size(); i++) {
            System.out.println(dotNetEmails.get(i));
        }
        System.out.println("Total .net: " + dotNetEmails.size());

        // Print .org emails
        System.out.println();
        System.out.println("=== .ORG Emails ===");
        for (int i = 0; i < dotOrgEmails.size(); i++) {
            System.out.println(dotOrgEmails.get(i));
        }
        System.out.println("Total .org: " + dotOrgEmails.size());

        // Print summary
        System.out.println();
        int totalValid = dotComEmails.size() + dotNetEmails.size() + dotOrgEmails.size();
        System.out.println("Total valid emails sorted: " + totalValid + " of " + rawEmails.length);
		
	}
}
