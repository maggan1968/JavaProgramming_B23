package day30_Recap_Recap;

public class LoopReview3 {
    public static void main(String[] args) {
        //removing words of the sentence,how many times.
        // If not using "count" ,will not show us how many times.

        String sentence = "I love Java, Java is fun, Java Java Java";
        //                I love , Java is fun Java Java Java
        //                I love , is fun Java Java Java

        String word = "Java";
        int count = 0; // 1+1

        while (sentence.contains(word)) { // false: if the sentence does not contain teh word
            sentence = sentence.replaceFirst(word, ""); //replaces the first matching word from sentence
            count++;
        }

        System.out.println(count);
        System.out.println(sentence);


        System.out.println("---------------------------------------------");


        for (int j = 1; j <= 5; j++) {

            for (int i = 1; i <= 10; i++) {
                System.out.print(i + " ");// print - printing poziomo
            }
            System.out.println();
        }
        System.out.println("-----------------------------");

        //frequency to find one character

        String str = "aabcccd";

        for (int j = 0; j <= str.length() - 1; j++) {
            //j: is index number of each character


            //  char ch ='a';
            char ch = str.charAt(j);
            int frequency = 0;

            for (int i = 0; i <= str.length() - 1; i++) {// find the frequency of one character
                if (str.charAt(i) == ch) {
                    frequency++;
                }
            }

            System.out.println(ch + "-" + frequency);

            if (frequency == 1) {
                System.out.println(ch);
            }
        }
    }
}

