package day28_CustomMethods;

public class Palindrome {
    public static void main(String[] args) {

    }

        public static void isPalindrome(String word){
            String reverseWord="";
            for(int i=word.length()-1;i>=0;i--){
                reverseWord+=word.charAt(i);
            }
            if(word.equalsIgnoreCase(reverseWord)){
                System.out.println("True");
            }else{
                System.out.println("False");
            }
        }
    }

/*
9. write a method that can check if a string is plaindrome,
 print true if it's  otherwise print false
 */