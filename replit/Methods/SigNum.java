package Methods;

import java.util.Scanner;

public class SigNum {
    public static void sign(int n) {

        if (n > 0) {
            System.out.println("positive");
        } else if (n == 0) {
            System.out.println("zero");
        } else {
            System.out.println("negative");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        sign(n);
    }
}
        /*
        Given a method sign write the code so that its takes a number argument
         and tells you if its positive, negative or zero.

for example :

sign(5)  => positive
sign(5)  => positive
sign(-30) => negative
sign(-30) => negative
sign(0)  => zero
         */




