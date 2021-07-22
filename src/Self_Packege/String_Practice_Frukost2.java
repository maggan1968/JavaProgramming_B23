package Self_Packege;

import java.util.Scanner;

public class String_Practice_Frukost2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Enter two words:");
        String wordA = scan.next().substring(1);
        String wordB = scan.next().substring(1);

        System.out.println(wordA+wordB);

    }
}
/*
2. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */