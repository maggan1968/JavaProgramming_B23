package OfficeHoura_11Constructor.shoppingCenter;

public class Product {
    // Boiler Plate
    public String name;
    public int quantity;
    public double price;


    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

}
