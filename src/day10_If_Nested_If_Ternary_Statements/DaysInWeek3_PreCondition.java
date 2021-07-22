package day10_If_Nested_If_Ternary_Statements;

public class DaysInWeek3_PreCondition {
    public static void main(String[] args) {
        // 1. write a program that can print name of day based on the number
        // 1~ 7

        int number = 1;//1~7
        String name = "";

if (number>=1  &&  number<=7){  // precondition statement



        if (number == 1) {

            name ="Monday";
        } else if (number == 2) {

            name ="Tuesday";
        } else if (number == 3) {

            name = "Wednesday";
        } else if (number == 4) {

            name = "Thursday";
        } else if (number == 5) {

            name = "Friday";
        }else if (number==6){

            name = "Saturday";
        }else  {

            name = "Sunday";

        }
        System.out.println("name=" +name);

    }

}}




