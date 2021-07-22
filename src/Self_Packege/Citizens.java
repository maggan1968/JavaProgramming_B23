package Self_Packege;

import java.util.Scanner;

public class Citizens {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");

        int seniorCitizens = input.nextInt();
        int nonseniorCitizens = input.nextInt();

        System.out.println("What is new citizen's age?");

        int age = input.nextInt();
        int result1 = 0;
        int result2 = 0;
        if (age>=65){
            System.out.println ("Senior Citizen");
            result1 = ++seniorCitizens;
        }else {
            System.out.println ("Non-Senior Citizen");
            result2= ++nonseniorCitizens;
        }
        System.out.println("New seniorCitizens count " + seniorCitizens);

        System.out.println("New nonSeniorCitizens count " + nonseniorCitizens);

        input.close();


    }
}
