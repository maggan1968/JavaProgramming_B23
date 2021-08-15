package OfficeHours_day6.HomeWork;

public class CustomMethod_NumbersUtilities_IsOdd {

    public static void main(String[] args) {
        String result1= isOdd(1,100);//user should provide two numbers and it will print
        //all ODD NUMBERS between those two numbers , including these two numbers also
        System.out.println(result1);//odd numbers
    }
    //method that can print ODD numbers between two numbers
    public static String isOdd(int num1, int num2){
        String  result="";
        for (int i = num1; i <=num2 ; i++) {
            if(i%2!=0){
                result+=i+" ";
            }
        }
        return result;

}
    }
