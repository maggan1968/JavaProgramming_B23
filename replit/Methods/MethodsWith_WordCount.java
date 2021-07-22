package Methods;

import java.util.Scanner;

public class MethodsWith_WordCount {
    public static int wordCount(String words) {
        // your code

        String[]word=words.split(" ");
        int count=0;
        for(int i = 0; i<word.length; i++){
            count++;
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }

}

/*
wordCount accepts String and returns how many words are in the given String

Example:

wordCount("foo bar")

returns 2
wordCount("foo bar")

returns 2
wordCount("one two three")

returns 3
wordCount("one two three")

returns 3
wordCount("bla")

returns 1
wordCount("bla")

returns 1
Hint: look at spaces
 */
