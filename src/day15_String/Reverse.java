package day15_String;

public class Reverse {
    //ReverseString
    public static void main(String[] args) {

        String word = "Blank";
            //Indext:      01234
            String result= ""; //knalB

            if (word.length()>5 ){;
                result=(" Too Long");
            }else if (word.length()<5) {
                result = (" Too Short");
            }else {   // if length of the string is 5
                result +=word.charAt(4);
                result +=word.charAt(3);
                result +=word.charAt(2);
                result +=word.charAt(1);
                result +=word.charAt(0);
result= ""+word.charAt(4) + word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);

        }
        System.out.println("result = " + result);
    }
}
/*
3. Write a program that will reverse a string.
 Your program should reverse a string only 5 characters long.
 If word is shorter, display message: "Too short!".
 If word is longer, display message: "Too long!". Otherwise,
 reverse this word and print out result into the console.
 */