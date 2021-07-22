package Methods;

import java.util.Scanner;

public class MethodWith_CleanString {

    public static String clean (String text , String badWord) {
        String[] words = text.split(" ");
        String result="";
        for(int i =0; i< words.length; i++){
            String each= words[i];
            if(each.contains(badWord)){
                continue;

            }
            result+=each+" ";
        }
        return result;
    }
    public static void main(String[] args) {
       Scanner in= new Scanner(System.in);
        System.out.println(clean(in.nextLine(), in.nextLine()));
    }

}
/*
This method accept two strings (text and badWord) and returns a string.

The method will take out all the occurrences of badWord in the text.

Example:

clean ("one two three","two")

returns "one three"
clean ("one two three","two")

returns "one three"
clean ("foo bar","foo")

returns "bar"
clean ("foo bar","foo")

returns "bar"
clean ("he said bla bla bla","bla")

returns "he said"
 */
