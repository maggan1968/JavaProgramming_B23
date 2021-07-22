package day04_Variables_Char_Boolean_String;



public class EmployeeInfo {
    public static void main(String[] args) {

        String firstName = "Aaron";
        String lastName = " King";
        String fullName = firstName + ""+ lastName;

        int age = 25;
        String companyName =  " Apple Inc;";
        String jobTitle = " SDET";
        boolean isFullTime = true;
        boolean isMarried = true;
        int salary = 11000;



        //Aaron King
        //Employee' full name is: Aaron King

        System.out.println("Employee'full name:"+ fullName);

        String gender = "Male";

        //Aaron King is Male

        System.out.println("Aaron King is MAle");
        System.out.println( fullName +         "is"     +  gender);



         //fullName is age years old
        System.out.println(fullName +" is " + age +" years old");

        //fullName works at companyName
        System.out.println(fullName +" work at" + companyName  );

        //fullName' job title is jobTitle
        System.out.println(fullName +"title" + jobTitle);

        //fullName isFullTime
        System.out.println(fullName + " is full time employee" + isFullTime    );
        System.out.println(fullName + " is married:" + isMarried);










    }



}
/*
following variables:
1. name, gender, age, companyName, jobTitle, isFullTime, isMarried, salary
2. full info of the employee



 */