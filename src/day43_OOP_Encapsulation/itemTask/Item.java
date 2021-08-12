package day43_OOP_Encapsulation.itemTask;

public class Item {
    public String name;
    public double unitPrice;
    public int quantity;

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost(){
        return unitPrice * quantity;
    }


    public String toString() {
        return "Item{" +
                "name= '" + name + '\'' +
                ", unitPrice= $" + unitPrice +
                ", quantity= " + quantity +
                ", total price= $" + calcCost() +
                '}';
    }


}


/*
Items Task:
    create a class called Item
            instance variables:
                name, unitPrice, quantity
            add a constructor that can initialize all the fields
            instance methods:
                calcCost(): returns the total cost
                toString(): returns the name, unit price, quantity and total cost info as calculated by calcCost()

    create a class called MyCart
            create 5 static variables of Items
            Add a static block to to set all the static variables

    Create a class named CheckOut

            1. Create an ArrayList of Items
            2. add all the 5 items from MyCart to the ArrayList items
            3. calculate the total price of all the items (including the tax)
                        Assume that the sales tax is 8%

 */