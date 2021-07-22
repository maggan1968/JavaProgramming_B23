package day14_Recap;

public class LetterOrDigitOrSpecialChar {
    public static void main(String[] args) {
/*
Given a  char variable determine if the character is letter or digit or special character.
            Ex: 'b'  --> letter
                '9'  --> digit
                '!'  --> special character
 */

        char ch = '0';

        boolean isDigit = ch >=48 && ch <=57;
       // boolean isDigit = ch >='0' && ch <='9';

        boolean isLetter = (ch >=65 && ch <=90)|| (ch >=97 && ch <=122);
        //boolean isLetter = (ch >='A' && ch <='Z')|| (ch >='a' && ch <='z');

        // if the character is upper case letter or lower case letter
        // boolean is specialCharacters = !isDigit && !isLetter;
/*
        String result= "";


        if (isDigit){
            System.out.println("Digit");
        }else  if (isLetter){

                System.out.println("Letter");
            }else  {
            System.out.println("Special character");

 */


        String result = (isDigit) ? ch+ " is digit" :(isLetter)? ch+
                " is letter" : ch+" is special character";
        System.out.println(result);
        }
    }

