package day10_If_Nested_If_Ternary_Statements;

public class FINRA {
    public static void main(String[] args) {

       int number = 15;
       String result ="";

       if (number%3==0) {
           //System.out.println("FINRA");
           result= "FINRA";

       }else if (number%5==0){
           //System.out.println("RA");
           result= "RA";

       }else if (number%3==0 ){
           //System.out.println("FIN");
           result= "FIN";
       }else {
          // System.out.println(number);
           result= ""+number; //"15"
       }
        System.out.println("result="+result);



    }
}
/*
3. Write a function which prints out the number. but for number which is a multiple of 3, print "FIN" instead of the number
    and for number which is a multiple of 5, print "RA" instead of the number. and for number which is a multiple of both 3 and 5, print "FINRA" instead of the number.
            ex:
                number = 3

            output:
                FIN

                number = 10

            output:
                RA

                number = 15

            output:
                FINRA

 */