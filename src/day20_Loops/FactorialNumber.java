package day20_Loops;

public class FactorialNumber {

    public static void main(String[] args) {
        
        int number = 3; //3*2*1  //int number=5; //5*4*3*2*1
        int result = 1;//3*2*1

        for (int i = number; i >=1 ; i--) {//i: 3,2,1  //i: 5,4,3,2,1
            result *= i;
        }

            System.out.println("result = " + result);

        }
    }

/*
1. Write a program that can return the factorial number of any given number

            Ex:
                input: 5
                output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )

 */