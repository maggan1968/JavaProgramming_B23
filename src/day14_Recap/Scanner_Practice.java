package day14_Recap;

import java.util.Scanner;

public class Scanner_Practice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*
        Ask the user to enter the year, month number, and day they were
        born and print in the following format:
                "month / day / year is your birthday "
================================================================================


     */
        System.out.println("Enter your birth year!:");
        short year = scan.nextShort();

        System.out.println("Enter your birth month:");
        byte month = scan.nextByte();

        System.out.println("Enter your birth day:");
        byte day = scan.nextByte();

        boolean isValid = (year>0 && year<2021) && (month>= 1 && month<= 12) && (day>= 1 && day <= 31);

        if(isValid){
            System.out.println(month+"/"+day+"/"+year +" is your birthday!");
        }else{
            System.err.println("Invalid Entry");
        }

        scan.close();

    }



    }



