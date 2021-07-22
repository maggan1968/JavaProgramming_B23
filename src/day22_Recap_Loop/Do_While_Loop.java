package day22_Recap_Loop;

public class Do_While_Loop {
    public static void main(String[] args) {
        int i=10;
        while (i<5){
            System.out.println("Hello Cybertek");
        }
        System.out.println("---------------------------");

        do{
            System.out.println("Hello Cybertek");
        }while (i<5);

        // even if the condition is false, do-while loop gets executed one time
    }
}
