package day21_Loops._While_Loop;

public class WhileLoopPractice2 {
    public static void main(String[] args) {
        int i =1;
        while (i<=100){
            if(i%2==0){
                System.out.print(i + " ");
            }
            i++;
        }
        System.out.println();

        System.out.println("---------------------");

        for (int j = 1; j <=10 ; j++) {
            if(j%2==0){
                System.out.print(j + " ");
        }
    }

}}
/*
Print all  even numbers between 1~100 with WhileLoop
 */