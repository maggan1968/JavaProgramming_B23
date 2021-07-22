package day19_Loop;

public class Remove_Dublicates_From_String {
    public static void main(String[] args) {
        String word = "abcabcbacbacbccccccaaaaaabbbbbbbbaaaaa";
        String result = "";  //"ab"

        for(int i= 0; i <= word.length()-1; i++){

            if(!result.contains(  ""+word.charAt(i) )) { // if the character is not contained in the result yet
                result += word.charAt(i);       // then add the character to the result
            }

        }


        System.out.println("result = " + result);




    }


}



