package Methods;

import java.util.Scanner;

public class UniqueChars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
        }

        public static String uniqueChars(String str) {
            //TODO: write your code

            String unique="";

            for (int i=0; i< str.length(); i++){
                char each =str.charAt(i);
                if(!unique.contains(""+each)){
                    unique+=each;
                }
            }
            return unique;


    }
}
