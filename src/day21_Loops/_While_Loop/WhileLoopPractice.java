package day21_Loops._While_Loop;

public class WhileLoopPractice {
    public static void main(String[] args) {
        String sentence="Java is fun, Java is cool,Java";
        //               " is fun, Java is cool,Java"
        //                " is fun,  is cool,Java"
        //                " is fun,  is cool,"

        //StringorginalSentence = sentence; //
        
        int countJava=0;// 1+1+1
     while (sentence.toLowerCase().contains("java")){
       // while(sentence.contains("Java")){
            countJava++;
            sentence=sentence.replaceFirst("Java","");
        }
        System.out.println("countJava = " + countJava);
    }
}
/*
how many "Java I have in sentence?
 */