package day19_Loop;
import java.util.Scanner;
public class Practice_Loop {

    public static void main(String[] args) {

       Scanner input= new Scanner(System.in);
       int num1= input.nextInt();
        int num2= input.nextInt();
        int iterate= input.nextInt();

        int total= 0;
        for (int j = 0; j <iterate ; j++) {
            if(j%3==0)continue;
            total+=num1+num2;
        }
        System.out.println(total);
        }
    }

