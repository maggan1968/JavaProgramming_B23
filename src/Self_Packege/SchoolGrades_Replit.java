package Self_Packege;

import java.util.Scanner;

public class SchoolGrades_Replit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Welcome to the Grader!");

        System.out.println("Please enter subject name number 1 and score for this subject");
        String nameNum1= scan.next();
        double score1 = scan.nextDouble();

        System.out.println("Please enter subject name number 2 and score for this subject");
        String nameNum2= scan.next();
        double score2 = scan.nextDouble();

        System.out.println("Please enter subject name number 3 and score for this subject");
        String nameNum3= scan.next();
        double score3 = scan.nextDouble();


        System.out.println("Please enter subject name number 4 and score for this subject");
        String nameNum4= scan.next();
        double score4 = scan.nextDouble();


        System.out.println("Please enter subject name number 5 and score for this subject");
        String nameNum5= scan.next();
        double score5 = scan.nextDouble();



        System.out.println("Summary: " + nameNum1 + " - " +score1+ ", "
                + nameNum2 + " - " +score2+ ", " + nameNum3 + " - " + score3 +", "
                + nameNum4 + " - " + score4 +", " + nameNum5 + " - " + score5);

        System.out.println("Your average score is: "+ (score1+score2+score3+score4+score5)/ 5);
        System.out.println("Thank you for using Grader!");
        System.out.println( "Goodbye!" );


    }

}
/*
Write the program that will calculate the average grade. Use 5 String variables and 6 double variables to hold the subject and the grade value. Build a summary with all the information by concatenating the subjects and grades. Then calculate the average grade and print display the average score too.

Execution flow with example:

Welcome to the Grader!
Please enter subject name number 1 and score for this subject
Math
5.0
Please enter subject name number 2 and score for this subject
Biology
4.2
Please enter subject name number 3 and score for this subject
English
4.4
Please enter subject name number 4 and score for this subject
Chemistry
4.8
Please enter subject name number 5 and score for this subject
Music
3.4

Summary: Math - 5.0,  Biology - 4.2,  English - 4.4, Chemistry - 4.8, Music - 3.4
Your average score is: 4.36
Thank you for using Grader!
Goodbye!
 */




