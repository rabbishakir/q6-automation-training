import java.util.ArrayList;

public class EmailSorter {

    public static void main(String[] args) {

        // ---------------- Stage 1: Set Up the Three Lists ----------------
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

        // ---------------- Stage 2: The for Loop — Clean and Sort ----------------
        for (int i = 0; i < rawEmails.length; i++) {

            String cleanEmail = rawEmails[i].trim().toLowerCase();

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

        // ---------------- Stage 3: Print Each Sorted List ----------------
        System.out.println();
        System.out.println("=== .COM Emails ===");
        for (int i = 0; i < dotComEmails.size(); i++) {
            System.out.println(dotComEmails.get(i));
        }
        System.out.println("Total .com: " + dotComEmails.size());

        System.out.println();
        System.out.println("=== .NET Emails ===");
        for (int i = 0; i < dotNetEmails.size(); i++) {
            System.out.println(dotNetEmails.get(i));
        }
        System.out.println("Total .net: " + dotNetEmails.size());

        System.out.println();
        System.out.println("=== .ORG Emails ===");
        for (int i = 0; i < dotOrgEmails.size(); i++) {
            System.out.println(dotOrgEmails.get(i));
        }
        System.out.println("Total .org: " + dotOrgEmails.size());

        System.out.println();
        int totalValid = dotComEmails.size() + dotNetEmails.size() + dotOrgEmails.size();
        System.out.println("Total valid emails sorted: " + totalValid + " of " + rawEmails.length);
    }
}
