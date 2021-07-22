package day15_String;

import java.util.Scanner;

public class Name_Formatting {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");

        String firstName = scan.nextLine().trim();// mUHTaR
        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();

        System.out.println("Enter your last name");
        String lastName = scan.nextLine().trim();
       lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        String fullName= firstName+ " "+ lastName;
        System.out.println(fullName);



    }

    public static class StringMethods {
        public static void main(String[] args) {
            String str ="Muhtar";

            char ch = str.charAt(0);
            System.out.println( "ch =" + ch);

            String word = "Cybertek School";
            // index:      0123456789
            char ch2 = word.charAt(9);
            System.out.println("ch2="+ ch2);

            String word2 = "Java";
            //index;        0123
            char ch3 = word2.charAt(2);
            System.out.println("ch3="+ ch3);

            System.out.println("---------------------------");

            String sentence= " Hello everyone, how are you all today?";
            int totalNumberOfChars = sentence.length();
            System.out.println("totalNumberOfChars = " + totalNumberOfChars);

            //chars: 123456789   8
            String s1 = "Cybertek";
            // index:    012345678
            int lastIndex = s1.length()-1;// in order to get the last index number we need to
            //subtract one form the length of String

            char firstCharacter= s1.charAt(0);
            //char lastCharacter= s1.charAt(7);
            char lastCharacter= s1.charAt(lastIndex);

            System.out.println("firstCharacter="+firstCharacter);
            System.out.println("lastCharacter=" + lastCharacter);


            System.out.println("--------------------------");

            String s= " cybertek";
             s= s.toUpperCase(); // "CYBERTEK"

            System.out.println(s);

            System.out.println("--------------------------------");

            String s2 = "JAVA PROGRAMMING LANGUAGE";
            s2= s.toLowerCase();// "java programming language"

            System.out.println(s2);

            System.out.println("___________________________________");

            String name ="margie";
            name = name.toUpperCase();//MARGIE

            System.out.println(name);

            System.out.println("_______________________");

            String  name2= "MARGIE";
            name2 = name2.toLowerCase();//margie

            System.out.println(name2);


            System.out.println("-------------------------");

            String  schooleName = "         Cybertek    School";
            schooleName = schooleName.trim();// "Cybertek School"

            System.out.println(schooleName);




        }

    }
}
/*
ask the user to enter first name:
1. make sure there is no white space
2. make sure first character is upper case &
rest of the character need to be i lowercase

Ex:
input;
muHTAr
 */