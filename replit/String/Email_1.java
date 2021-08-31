package String;

import java.util.Scanner;

public class Email_1 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        if (email.contains("_")){
            int indexOf_ = email.indexOf("_");
            int indexOfAt = email.indexOf("@");

            String firstName = email.substring(0, indexOf_);
            String lastName = email.substring(indexOf_ +1, indexOfAt);
            String domain = email.substring(indexOfAt);
            System.out.println(lastName+"_"+firstName+domain);
        }else{
            System.out.println(email);
        }
    }
}


/*
Swap first name with last name in the email (Seperated by an underscore). If the email doesn't contain an underscore print the given input email.

Examples:

input: mike_tyson@gmail.com

output: tyson_mike@gmail.com
input: mike_tyson@gmail.com

output: tyson_mike@gmail.com
input: barakobama@gmail.com

output: barakobama@gmail.com
 */