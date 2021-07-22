package day19_Loop;

public class For_Loop_StringRevers_INTERVIEW {
    public static void main(String[] args) {

            String name =" Muhtar";
            //index:       01234567

            String reverseName = "";  //rathuM

            for (int i = name.length()-1; i >= 0; i--) {
                reverseName += name.charAt(i); // getting the characters starting from last index to index 0
            }

            System.out.println(reverseName);



        }

    }


