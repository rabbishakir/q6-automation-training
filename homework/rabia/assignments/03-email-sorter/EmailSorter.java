package assignment_for_sorting_the_email;

// IMPORT ArrayList
import java.util.ArrayList;

// CREATE class EmailSorter
public class EmailSorter {

	// CREATE main method
	public static void main(String[] args) {

		// Raw email data — messy, mixed case, extra spaces
		String[] rawEmails = { "  azim@gmail.com  ", // has spaces
				"SABRINA@OUTLOOK.NET", // uppercase
				"hasan@yahoo.com", // clean
				"  RAISUL@SCHOOL.ORG  ", // spaces + uppercase
				"sayed@hotmail.net", // clean
				"rabbi@training.org", // clean
				"  nadia@company.com  ", // has spaces
				"INVALID-EMAIL-NO-DOMAIN", // no valid domain
				"support@helpdesk.net" // clean
		};

		// CREATE empty ArrayList called dotComEmails
		ArrayList<String> dotComEmails = new ArrayList<String>();

		// CREATE empty ArrayList called dotNetEmails
		ArrayList<String> dotNetEmails = new ArrayList<String>();

		// CREATE empty ArrayList called dotOrgEmails
		ArrayList<String> dotOrgEmails = new ArrayList<String>();

		// FOR i = 0 to rawEmails.length - 1 DO
		for (int i = 0; i < rawEmails.length; i++) {

			// SET cleanEmail = rawEmails[i] with spaces removed AND converted to lowercase
			String cleanEmail = rawEmails[i].trim().toLowerCase();

			// IF cleanEmail does not contain "@" THEN PRINT "Invalid (no @ symbol): " +
			// cleanEmail
			if (!cleanEmail.contains("@")) {
				System.out.println("Invalid (no @ symbol): " + cleanEmail);
			}
			// ELSE IF cleanEmail ends with ".com" THEN ADD cleanEmail to dotComEmails
			else if (cleanEmail.endsWith(".com")) {
				dotComEmails.add(cleanEmail);
			}

			// ELSE IF cleanEmail ends with ".net" THEN ADD cleanEmail to dotNetEmails
			else if (cleanEmail.endsWith(".net")) {
				dotNetEmails.add(cleanEmail);
			}

			// ELSE IF cleanEmail ends with ".org" THEN ADD cleanEmail to dotOrgEmails
			else if (cleanEmail.endsWith(".org")) {
				dotOrgEmails.add(cleanEmail);
			}

			// ELSE PRINT "Invalid (unknown domain): " + cleanEmail
			else {
				System.out.println("Invalid (unknown domain): " + cleanEmail);
			}
		}
		// PRINT blank line
		System.out.println("");

		// PRINT "=== .COM Emails ==="
		System.out.println("=== .COM Emails ===");

		// FOR i = 0 to dotComEmails.size() - 1 DO
		for (int i = 0; i < dotComEmails.size(); i++) {

			// PRINT dotComEmails.get(i)
			System.out.println(dotComEmails.get(i));

			// END FOR
		}

// PRINT "Total .com: " + dotComEmails.size()
		System.out.println("Total .com: " + dotComEmails.size());

		// PRINT blank line
		System.out.println("");

		// PRINT "=== .NET Emails ==="
		System.out.println("=== .NET Emails ===");

		// FOR i = 0 to dotNetEmails.size() - 1 DO
		for (int i = 0; i < dotNetEmails.size(); i++) {

			// PRINT dotNetEmails.get(i)
			System.out.println(dotNetEmails.get(i));

			// END FOR
		}

		// PRINT "Total .net: " + dotNetEmails.size()
		System.out.println("Total .net: " + dotNetEmails.size());

         //PRINT blank line
		System.out.println("");

		// PRINT "=== .ORG Emails ==="
		System.out.println("=== .ORG Emails ===");

		// FOR i = 0 to dotOrgEmails.size() - 1 DO
		for (int i = 0; i < dotOrgEmails.size(); i++) {

			// PRINT dotOrgEmails.get(i)
			System.out.println(dotOrgEmails.get(i));

			// END FOR
		}

		// PRINT "Total .org: " + dotOrgEmails.size()
		System.out.println("Total .org: " + dotOrgEmails.size());

		// PRINT blank line
		System.out.println("");
		
		
		// SET totalValid = dotComEmails.size() + dotNetEmails.size() + dotOrgEmails.size()
		
		int totalValid = dotComEmails.size() + dotNetEmails.size() + dotOrgEmails.size();
		
		// PRINT "Total valid emails sorted: " + totalValid + " of " + rawEmails.length
		System.out.println("Total valid emails sorted: " + totalValid + " of " + rawEmails.length);
		
		
		

	}

}
