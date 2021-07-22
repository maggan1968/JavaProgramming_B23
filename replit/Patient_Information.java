import sun.security.x509.InvalidityDateExtension;

import java.util.Scanner;

public class Patient_Information {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the patient portal!");

        System.out.println("Enter your personal information:");

        System.out.println("Enter your first name:");
        String firstName = scan.next();
        System.out.println("first Name ="+ firstName);

        System.out.println("Enter your last name:");
        String lastName = scan.next();
        System.out.println("last Name ="+ lastName);



        System.out.println("Enter your email:");
         String email = scan.next();
        System.out.println("Email =" + email);

        scan.nextLine();

        System.out.println("Enter your street:");
        String street = scan.nextLine();
        System.out.println("Street = " +street);

        System.out.println("Enter your city:");
        String city = scan.next();
        System.out.println("City = " +city);


        System.out.println("Enter your state:");
        String state=scan.next();
        System.out.println("State = " + state);

        System.out.println("Enter your zip code:");
        int zipCode= scan.nextInt();
        System.out.println(" Zip Cod = " + zipCode);

        System.out.println("Enter your work phone number:");
        long workPhone= scan.nextLong();
        System.out.println("work phone = " + workPhone);

        System.out.println("Enter your personal phone number:");
        long personalPhone= scan.nextLong();
        System.out.println("personal phone  = " + personalPhone);

        System.out.println("Enter your age:");
         int age = scan.nextInt();
        System.out.println(" Age "+ age);

        System.out.println("Enter your height:");
        double height = scan.nextDouble();
        System.out.println( "Height = " + height);


        System.out.println("Enter your weight:");
        double weight = scan.nextDouble();
        System.out.println( "Weight = " + weight);

        System.out.println(" Are you Married?");
        boolean marriedOrNot = scan.nextBoolean();
        System.out.println("Married or not = " + marriedOrNot);


        String fullName = firstName+ " , "+ lastName;

        String contacts = "work phone number - " +workPhone+ " personal phone number - "
        + personalPhone+ " and " + " email " +email;








    }

}
