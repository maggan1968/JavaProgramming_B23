import java.util.Scanner;

public class Email_String_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //margie_kowalczyk@gmail.com

        String email = scan.next();
        int indexOf_ = email.indexOf("_");
        int indexOfAt = email.indexOf("@");

        String firstName = email.substring(0, indexOf_);

        firstName=(""+firstName.charAt(0)).toUpperCase()+firstName.substring(1).toLowerCase();
        System.out.println("First name: " + firstName);

        String lastName = email.substring(indexOf_+1,indexOfAt);

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println("Last name: " + lastName);

        String domain = email.substring(indexOfAt+1, email.indexOf("."));

        System.out.println("Domain: " + domain);

        System.out.println(lastName+"_"+firstName + "@"+ domain+".com");
    }
}







/*
Write a program that will print out information about user based on email. Print first name, last name, and domain. First and Last name should be printed with proper format - uppercase first letter and remaining lowercase.

Example:

Input: craig_federighi@apple.com
Input: craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
 */