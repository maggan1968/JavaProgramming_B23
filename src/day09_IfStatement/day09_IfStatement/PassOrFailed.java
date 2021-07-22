package day09_IfStatement.day09_IfStatement;

public class PassOrFailed {
    public static void main(String[] args) {

        int score = 50;
        if(score>=60){
            System.out.println("passed");
        }

        if(score<60){
            System.out.println("failed");
        }
        System.out.println("==========================");


        if(score>=60){
            System.out.println("passed");
        }else{  // otherwise
            System.out.println("failed");

        }
        System.out.println("===========================");


    }
}
