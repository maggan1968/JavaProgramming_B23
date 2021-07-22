package day30_Recap_Recap;

import java.util.Locale;
import java.util.Scanner;

public class LoopsReview2_WhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer = "";
        int n = 0;

        while (!answer.equals("no")) { // false; if the answer is "no"
            System.out.println("Enter a number:");
            n = scan.nextInt();

            scan.nextLine();
            System.out.println("Would you like to enter another number");
            answer = scan.nextLine().toLowerCase();


            while (!(answer.equals("yes")|| answer.equals("no"))){ //false: if the answer ie yes or no
                System.out.println("Invalid Answer! Would you like to enter another number");
                answer = scan.next();
            }
            if (answer.equals("no")){
                System.out.println("Thank you");

            }
        }
    }
}
