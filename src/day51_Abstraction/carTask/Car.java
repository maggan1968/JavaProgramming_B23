package day51_Abstraction.carTask;

public abstract class Car {  // car is meant to be the parent

    private final String make;
    private final String model;
    private String color;
    private final int year;
    private double price;

    public static boolean hasWheels, hasEngine;

    static {
        hasEngine = true;
        hasWheels = true;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price <= 0){
            throw new RuntimeException("Invalid Price: "+price);
        }
        this.price = price;
    }

    public Car(String make, String model, String color, int year, double price) {
        this.make = make;
        this.model = model;
        setColor(color);
        this.year = year;
        setPrice(price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }


    public abstract void start();// mean to be overridden have no implementations
}
