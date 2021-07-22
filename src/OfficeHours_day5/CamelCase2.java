package OfficeHours_day5;

public class CamelCase2 {
    public static void main(String[] args) {


    String str ="thisHasManyWordsToFind";

    String temp="";

    int count= 1;
        if(str.isEmpty())
    count=0;

        for (int i = 0; i <str.length() ; i++) {

        if(str.charAt(i)>='A'&& str.charAt(i)<='Z'){
            System.out.println(temp);
           temp="";
        }
       temp+=str.charAt(i);//this
    }

        System.out.println(temp);
}
}
/*
Given a String of words that follow Camel Case convention.
Every word, except the first word, begin with an uppercase letter.
 The other characters of the word will be lowercase

Task 1  : Find and print how many words are in the given String.

		 Input: thisHasManyWordsToFind Output: 6

Task 2  : Find and print each words are in the given String.

		Input: thisHasManyWordsToFind
		Output: This
				Has
				Many
				Words
			    To
			   Find

 */

