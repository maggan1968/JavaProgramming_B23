package day46_Inheritance.carTask;

public class CarShop {
    public static void main(String[] args) {
        Toyota toyota= new Toyota("Camry",2010,5000,"White",200000);
toyota.start();

        System.out.println("--------------------------------------");

        Tesla tesla= new Tesla("S model", 2021,120000,"White", 0);
        tesla.start();

        System.out.println("-------------------------------------");

    BMW bmw= new BMW("X6",2015,100000,"Black", 50000);
    bmw.start();
    }
}
