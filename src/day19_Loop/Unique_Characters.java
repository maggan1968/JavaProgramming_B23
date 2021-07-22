package day19_Loop;

public class Unique_Characters {
    public static void main(String[] args) {

        String str= "aahhjjsu";
       // String  str= "aabcc";
        String result="";
        for (int i = 0; i <= str.length()-1 ; i++) {
            char ch= str.charAt(i);//a,a,b,c,c
            boolean isUniqe=str.indexOf(ch)==str.lastIndexOf(ch);
            //if the first and last index numbers of the characters are same, then the characters is unique

            if(isUniqe){// if the characters is unique
                result +=ch;
            }

        }


        System.out.println("result = " + result);
    }
}
