package day46_Inheritance.carTask;

public class Toyota extends Car {

    public static boolean IsReliable = true;
    public Toyota( String model, int year, double price, String color, long miles) {
        super("Toyota", model, year, price, color, miles);
    }

    }

/*
 Create the following sub classes of Car:
        1. Toyota
        extra method:
        reliable();  niezawodny

 */