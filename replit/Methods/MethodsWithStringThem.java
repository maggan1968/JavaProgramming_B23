package Methods;

import java.util.Scanner;

public class MethodsWithStringThem {


  public static String mergeStrings(String one, String two) {
   String result="";
      char[]firstArray=one.toCharArray();
      char[]secondArray=two.toCharArray();

      if(firstArray.length==secondArray.length) {
          for (int i = 0; i < firstArray.length; i++) {
              result = result + firstArray[i] + secondArray[i];
          }
      }else if (firstArray.length>secondArray.length){
          int count=0;
          for (int i = 0; i < secondArray.length; i++) {
              result = result + firstArray[count++] + secondArray[i];
          }
          for (int i=count; i<firstArray.length;i++){
              result=result+firstArray[i];
          }
      }else{
          int count=0;
          for (int i = 0; i < firstArray.length; i++) {
              result = result+ firstArray[i] + secondArray[count++];
          }
          for (int i=count; i<secondArray.length;i++){
              result=result+secondArray[i];

      }
      }
      return  result;
      }



    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
		System.out.println(mergeStrings(in.next(), in.next()));
  }

}
/*
Write a method mergeStrings that will return the strings merged,
 one letter at a time, starting with one. Please note one and two can be of different lengths.

Examples:

s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"
s1 ==> "12345"
s2 ==> "abcde"
mergeStrings(s1,s2) ==> "1a2b3c4d5e"
mergeStrings("wooden", "spoon") ==> "wsopoodoenn"

mergeStrings("java", "selenium") ==> "jsaevlaenium"
 */