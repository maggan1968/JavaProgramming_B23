package day43_OOP_Encapsulation.itemTask;

public class MyCart {

    //create 5 static variables of Items
    public static  Item item1, item2, item3, item4, item5;


    // Add a static block to to set all the static variables
    static {
        item1=new Item("Milk", 3,2);
        item1=new Item("Eggs",0.5,30);
        item1=new Item("Diaper",48,1);
        item1=new Item("Bread",4,5);
        item1=new Item("Toilet Paper",10,20);
    }
}
/*
 create a class called MyCart
            create 5 static variables of Items
            Add a static block to to set all the static variables

 */