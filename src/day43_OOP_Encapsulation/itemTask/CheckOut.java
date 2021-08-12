package day43_OOP_Encapsulation.itemTask;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckOut {
    public static void main(String[] args) {



         //Create an ArrayList of Items
        ArrayList<Item>items=new ArrayList<>();

        //add all the 5 items from MyCart to the ArrayList items
        items.addAll(Arrays.asList(// adding each item to my arraylist
       MyCart.item1,MyCart.item2,MyCart.item3,MyCart.item4,MyCart.item5));


        /*
        for(int i =0; i <= items.size()-1; i++){
            Item eachItem = items.get(i);
        }
         */
        double totalCost = 0;

        for(Item eachItem : items){
            totalCost += eachItem.calcCost() * 1.08;
        }

        System.out.println("totalCost = " + totalCost);



    }

}

/*
Create a class named CheckOut

            1. Create an ArrayList of Items
            2. add all the 5 items from MyCart to the ArrayList items
            3. calculate the total price of all the items (including the tax)
                        Assume that the sales tax is 8%
 */
