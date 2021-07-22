package Self_Packege;

import java.util.Scanner;

public class TreeNumbers_Replit {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);



        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int n3 = scan.nextInt();

        //your code here
        if(n1>n2 && n1>n3){
            System.out.println("n1 is bigger");
        }else if(n2>n1 && n2>n3){
            System.out.println("n2 is bigger");
        }else{
            System.out.println("n3 is bigger");
        }
    }
}



