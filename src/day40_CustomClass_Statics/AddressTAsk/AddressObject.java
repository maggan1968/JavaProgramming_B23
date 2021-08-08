package day40_CustomClass_Statics.AddressTAsk;

import java.util.Scanner;

public class AddressObject {
    public static void main(String[] args) {
        Address address=new Address();
        Scanner scan = new Scanner(System.in);

        System.out.println(address.country);
        //System.out.println(address.planetName); // static needs to be called through class name, not through the object
        System.out.println(Address.country); // legal way
       // System.out.println(Address.planetName);

        System.out.println("Enter your building number");
        String building = scan.next();//7925

        scan.nextLine();//Enter

        System.out.println("Enter your street name");
        String street=scan.nextLine();

        System.out.println("Enter your city name");
        String city=scan.nextLine();

        System.out.println("Enter your state name");
        String state=scan.nextLine();

        System.out.println("Enter your zip code");
        int zipcode = scan.nextInt();

        address.setInfo(building, street, city, state, zipcode);
        System.out.println(address);

    }
}
