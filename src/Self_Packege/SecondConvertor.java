package Self_Packege;

import java.util.Scanner;

public class SecondConvertor {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter seconds:");

        int inputSeconds=scan.nextInt();

        int hours= inputSeconds/3600;

        int minutes=(inputSeconds/60)%60;

        int second=(inputSeconds%3600)%60;

        System.out.println(hours+" hours, "+minutes+" minutes," +
                " and "+second+" seconds");
    }
}
