package day28_CustomMethods;

public class ReversString {
    public static void main(String[] args) {
        reverseString("Java");
    }
    public static void reverseString(String word) {
    /*
  7. create a method that can reverse any String
   */
        String reversedWord = "";
        for (int i = word.length()-1; i >= 0; i--) {
            reversedWord+=word.charAt(i);
        }
        System.out.println(reversedWord);
    }
    }

