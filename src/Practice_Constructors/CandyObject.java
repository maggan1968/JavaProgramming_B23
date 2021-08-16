package Practice_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyObject {
    public static void main(String[] args) {

        ArrayList<Candy> candies = new ArrayList<>();

        Candy candy1=new Candy("Snickers",2,2,true);
        Candy candy2=new Candy("Skittles",2,2,true);
        Candy candy3=new Candy("Hershey's",2,2,true);
        Candy candy4=new Candy("M&Ms",2,2,true);
        Candy candy5=new Candy("mrGood",2,2,true);
        candies.addAll(Arrays.asList(candy1, candy2, candy3, candy4, candy5));
        for (int i=0;i<candies.size();i++){
            System.out.println("Brand: "+candies.get(i).getBrand()+" Price: "+candies.get(i).getPrice());
        }
    }


}


/*
Create a class named CandyFactory
            Create an ArrayList of candies
            Add five objects of candies
            use for each loop to print the brand and price of each candy
 */