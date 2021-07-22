package day31_MethodsRecap;

public class WarmUpTask_RemoveDuplicates {


    public static void main(String[] args) {
        String str= "HHHHHHOOOOOOUUUEEE";

        System.out.println(removeDuplicates(str));
        String r = removeDuplicates(str);

        System.out.println(r);
    }

    // create a method that can remove duplicates from string, returns string
    // removeDup("AABBBCC") ===> "ABC"
    public static String removeDuplicates(String str){// "AABBBCC"
        String result="";// "ABC"

        for (char ch: str.toCharArray()){ // {'A','A','B','B','B','C','C'}

            if(result.indexOf(ch)<0) { //(!result.contains(""+ch)
                //if the character is not contained in the result, then concat the character

                result += ch;
            }
        }
        return result;

    }}



