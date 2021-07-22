package day13_ScannerPractice;

import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println( "enter your salary");
        int salary = scan.nextInt();//100000



        System.out.println(" Enter your gender");
        String gender = scan.next();

        scan.nextLine();


        System.out.println("Enter yor full name");
        String fullName =scan .nextLine();

        System.out.println("Enter your job title");
        String jobTitle =scan .nextLine();

        System.out.println( "salary = " + salary);
        System.out.println( "gender = " + gender);
        System.out.println( "fullName = " + fullName);
        System.out.println( "job Title = " + jobTitle);



    }
}
