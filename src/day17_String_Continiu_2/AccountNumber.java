package day17_String_Continiu_2;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(" Enter an account number:");
        String account = scan.next();

        char firstChar= account.charAt(0);
        switch (firstChar) {

            case '2'://if the first character of account is 2
                if (account.length() == 7) {//if length of account is 7
                    System.out.println("Valid Account");
                } else {//if length of account is  not 7
                    System.out.println("Invalid: it should be 7 character long");
                }
                break;

            case '5'://if the first character of account is 5
                if (account.length() == 10) {//if length of account is 10
                    System.out.println("Valid Account");
                } else {//if length of account is  not 10
                    System.out.println("Invalid: it should be 10 character long");
                }
                break;
            default:
                System.out.println("Invalid:first character need to be 2 or 5");
                scan.close();
        }}
        }


/*
 Nested method;
        if(account.length()==7 || account.length()==10){
            if(account.charAt(0)== '2' && account.length()==7){//if the first character is 2&& has
                // 7 characters
                System.out.println("Valid Account");
            }else  if(account.charAt(0)=='5'&& account.length()==10){
                System.out.println("Valid Account");
        }else {
            System.out.println("Invalid Account");
        }
        }else {
            System.out.println("Invalid Account");

    }
}}
/*
1.Ask the user enter an account number (String). Check if these account number is valid.
    > If the account number begins with a “2” the account number should be 7 characters long
    > If the account number begins with a “5” the account number should be 10 characters long
    —> If the account number does not begin with a 2 or a 5 OR the account number
     lengths do not meet the expected results print “Invalid account number”

 */