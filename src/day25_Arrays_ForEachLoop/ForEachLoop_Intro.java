package day25_Arrays_ForEachLoop;

public class ForEachLoop_Intro {
    public static void main(String[] args) {


        int[] number = {1, 2, 3, 4, 5};
        // index     0 1 2 3 4

        for (int i = 0; i < number.length; i++) {
            System.out.println(number[i]);
        }
        System.out.println("-------------------------------");




        System.out.println("-------------------------------");

        String []names={"Margie","Muhtar","Tunba","Venera", "Adam"};

        for(String eachName : names){ // there is no index in for each loop
            System.out.println(eachName);
        }
        // we can usefor each loop if we dont need to use indexes
        // we cannt altar
    }

}
