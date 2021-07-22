package Loop_Practice;

import java.util.Scanner;

public class CatAndDog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        for(int i=0; i<= word.length()-3; i++){
            String word2=word.substring(i,i+3);
            if(word2.equals("cat"))
                countOfCats+=1;
            if(word2.equals("dog"))
                countOfDogs+=1;

        }
        System.out.println(countOfCats==countOfDogs);
    }
}


