package day43_OOP_Encapsulation;

public class CircleObject {
    public static void main(String[] args) {

        Circle circle1 = new Circle(-1);

        System.out.println(circle1);

        circle1.setRadius(3);

        System.out.println(circle1);

        System.out.println(circle1.area());
        System.out.println(circle1.perimeter());

        Circle circle2 = new Circle(5);

        System.out.println( circle1.equals(circle2) );
        System.out.println( circle1 == circle2);



    }

}
/*
 1. Create a class named Circle
            Private variables:
                radius, diameter, PI

            generate getter & setter for all private fields
                    Make sure that radius & diameter of circle can never be set to negative

            add a constructor that can set all the fields

            Extra methods:
                equal(): accepts a Circle Object and returns true if the given circle is equal to the current circle
                calcArea(): returns the area
                calcPerimeter(): returns the perimeter
                toString()

 */
