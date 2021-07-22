package utilities;

import java.util.Arrays;

public class StringUtility {

    //reverses any given string, and returns it
    public static String reverse(String str) {
        String reverse = "";

        for (int i = str.length() - 1; i >= 0; i--) { // i : 2, 1, 0
            reverse += str.charAt(i); //
        }

        return reverse;
    }


    //checks if the given string is palindrome, returns boolean
    public static boolean isPalindrome(String str) { // "Java"
        String reversedStr = reverse(str);  //"avaJ"
        return str.equalsIgnoreCase(reversedStr);
    }


    // create a method that can remove duplicates from string, returns string
    public static String removeDup(String str) { // "AABBBCC"
        String result = "";   //"ABB"

        for (char ch : str.toCharArray()) { //{'A', 'A', 'B', 'B', 'B', 'C', 'C'}

            if (!result.contains("" + ch)) {  //result.indexOf(ch) < 0
                // if the character is not contained in the result, then concate the character
                result += ch;
            }

        }

        return result;
    }


    // "heart"  & "earth"  ==> isAnagram ==> true
    public static boolean isAnagram(String str1, String str2) {
        char[] ch1 = str1.toCharArray(); //{'h', 'e', 'a', 'r', 't'}
        char[] ch2 = str2.toCharArray(); // {'e', 'a', 'r', 't', 'h'}

        Arrays.sort(ch1); // {a, e, h, r. t}
        Arrays.sort(ch2); // {a, e, h, r. t}

        return Arrays.equals(ch1, ch2);

    }


    // frequency ("AAAABB", 'A')===>4
    // returns the frequency of ch from the string str
    public static int frequency(String str, char ch) {
        int count = 0;

        for (char each : str.toCharArray()) { // each: represents each character of str
            if (each == ch) {
                count++;
            }
        }

        return count;
    }


    //returns the unique characters from the string
    public static String uniqueChars(String s) {
        String unique = "";

        for (int i = 0; i <= s.length() - 1; i++) {
            char each = s.charAt(i);
            int frequency = frequency(s, each);
            if (frequency == 1) {
                unique += each;
            }
        }

        return unique;
    }


    //returns the frequency of each characters, returns string
    public static String frequencyOfChars(String str) {
        String result = ""; //A3B2C4

        for (char each : removeDup(str).toCharArray()) { // each: A, B C
            int frequency = frequency(str, each); // gets the frequency of each character: 3, 2, 4
            result += each; //"ABC"
            result += frequency;//"A3B2C4"
        }

        return result;
    }


    // returns the frequency of the word from the sentence
    public static int frequencyOfWord(String sentence, String word) {
        int count = 0;  //3
        sentence = sentence.toLowerCase();
        word = word.toLowerCase();
        while (sentence.contains(word)) {
            sentence = sentence.replaceFirst(word, "");
            count++;
        }

        return count;
    }


    // isArmstrongNumber===> true
    public static boolean isArmstrong(int number) {

        int lastDigit = 0;
        int totalOfDigits = 0;
        int originalNumber = number;

        if (number < 2) {
            return false;
        }

        while (number > 0) {
            lastDigit = number % 10;   //3   5   1
            number /= 10;            //15  1   0    number=number/10 ;
            totalOfDigits += lastDigit * lastDigit * lastDigit;   // 27+125 +1 ==153
            // totalOfDigits+=Math.pow(lastDigit,3);
        } // number 0

        if (totalOfDigits == originalNumber) {
            return true;
        }

        return false;


    }


    // number of steps to Main Directory
    public static int minSteps(String[] steps) {
        //Input : {"x/","y/","../","z/","./"}
        int count = 0;

        for (String each : steps) {
            switch (each) {
                case "./":        // remain in same folder
                    break;
                case "../":       // go back for parent
                    count--;
                    break;
                default:         // child folders
                    count++;
                    break;
            }
        }

        return count;


    }


    // return Methods with WordCount
    public static int wordCount(String words) {
        // your code

        String[] word = words.split(" ");
        int count = 0;
        for (int i = 0; i < word.length; i++) {
            count++;
        }
        return count;
    }


    // Return Method with Clean String
    public static String clean(String text, String badWord) {
        String[] words = text.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            String each = words[i];
            if (each.contains(badWord)) {
                continue;

            }
            result += each + " ";
        }
        return result;

    }


    // Return method with String Limit
    public static String limit(String text, int maxLength) {

        String result = text.substring(0, maxLength);
        return result;
    }


    // return  method with String- At 3rd char
     public static String at3(String target,String word) {


    String result = "";
    String word1 = target.substring(0, 3);
    String word2 = target.substring(3);

    result = word1 + word + word2;

    return result;
}



    }











