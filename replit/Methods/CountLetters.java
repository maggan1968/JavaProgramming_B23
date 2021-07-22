package Methods;
import java.util.Scanner;
public class CountLetters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str){


        String nonDup="";
        for(int i=0; i<str.length(); i++) {
        if (!nonDup.contains("" + str.charAt(i))) {
        nonDup += ""+str.charAt(i);
        }
        }
//step 2 use each letter to find the frequency
        String expectResult = "";
        for (int j = 0; j < nonDup.length(); j++) {
        // char ch=nonDup.charAt(j);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == nonDup.charAt(j))
        ++count;
        }
        // step 3 format the output
        expectResult+=count+""+nonDup.charAt(j);
        }

        return expectResult;
        }
}

/*
Write a method countLetters that can count letters in a given string and return
 a new string in the given format:

number of letters + letter
number of letters + letter
Example:

input: countLetters("aaabbcccc");

output: "3a2b4c"
 */
