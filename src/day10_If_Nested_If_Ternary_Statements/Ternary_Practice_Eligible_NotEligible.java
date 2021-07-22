package day10_If_Nested_If_Ternary_Statements;

public class Ternary_Practice_Eligible_NotEligible {
    public static void main(String[] args) {


    int age = 23;
    String result =  (age >= 21) ? "Eligible" : "Not eligible"   ;
        /*
        if(age >= 21){
             result ="Eligible";
        }else{
            result = "Not eligible";
        }
         */

        System.out.println(result);

    int score = 80;

        System.out.println(    (score>=60) ? "Passed" : "Failed"    );


}
}
