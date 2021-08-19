package day46_Inheritance.carTask;

public class BMW extends Car{


    public static boolean isLuxuryBrand=true;

    public BMW( String model, int year, double price, String color, long miles) { //we can take out first argument String brand
        super("BMW", model, year, price, color, miles);// brand - we can exchange for "Toyota"
    }

    @Override
    public void start() {
        System.out.println("Call mechanic");
        System.out.println("Oil change");
        System.out.println("Jump start");
    }
}
