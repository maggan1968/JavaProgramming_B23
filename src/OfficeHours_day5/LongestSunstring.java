package OfficeHours_day5;

public class LongestSunstring {
    public static void main(String[] args) {

        String str="aaabbbcccccddddee";
        String longestSubstring="";
        String temp= "";
        for (int i = 0; i <str.length()-1 ; i++) {

            temp+=str.charAt(i);

            if(str.charAt(i)!= str.charAt(i+1)){

              if(temp.length()>longestSubstring.length()){
                  longestSubstring=temp;
              }
              temp="";

            }

        }
        System.out.println(longestSubstring);
    }
}
/*
  Biggest substring of matching characters
						  Given a String find the biggest substring of chars that match and print it.

						  Ex: aaabbbcccccddddee Output: ccccc
						   a=3
						   b=3
						   c=5
						   d=4
						   e=2


 */