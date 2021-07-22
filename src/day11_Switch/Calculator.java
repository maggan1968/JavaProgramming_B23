package day11_Switch;

public class Calculator {
    public static void main(String[] args) {
        /*
         4. Given two double variables n1, n2 and a char variable named operator. use switch statement to calculate the result of n1 & n2 based on the given operator
        Valid operators are: -, +, *, /

         */

        double n1=100;
        double n2=2.5;
        double result =0;

        char matOperator = '-';  //+,-,*, /

        switch (matOperator){


        case '-':
        System.out.println(n1-n2);
            result = n1-n2;
        break;

            case '+':
               // System.out.println(n1+n2);
                result = n1+n2;
                break;


            case '*':
               // System.out.println(n1*n2);
                result= n1*n2;
                break;

            case '/':
                //System.out.println(n1/n2);
                result= n1/n2;
                break;

            default:
                System.out.println("invalid Operator");

            System.out.println("result=" + result);

    }
}}
