package Self_Packege;

public class GoodMorning {
    public static void main(String[] args) {
    //1.Write a Java program that will accept two numbers and check if two numbers are  equal or not.
        // 2.Write a Java program to implement following logic using if statement .
        // 1.if hour is less than 12 noon, greet with GoodMorning.
        // 2.if hour is greater than or equal 12 noon but less than 3 pm, greet with Good  Afternoon.
        // 3.if hour is greater than or equal to 3 pm, greet with GoodEvening.


        int hour = 4;
        String amOrPm="PM";
        if(hour<12 && amOrPm=="AM"){
            System.out.println("Good Morning");
        }else if(hour>=12 || hour<3 && amOrPm=="PM" ){
            System.out.println("Good Afternon");
        }if (hour>=3 && amOrPm=="PM"){

            System.out.println("Good Evening");
        }}}


