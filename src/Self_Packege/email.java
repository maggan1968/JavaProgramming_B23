package Self_Packege;

import java.util.Scanner;

public class email {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String email = scan.next();

        System.out.println("Enter your first name");
        String firstName= scan.next();
        System.out.println("Enter your last name");
        String lastName= scan.next();

        int beginningIndex = email.indexOf("@")+1;
        int endinngIndex = email.lastIndexOf(".");
        String domain = email.substring(beginningIndex);
        System.out.println("domain="+domain);

        System.out.println("firstName+lastName+Domain");


    }
}


