package day51_Abstraction.shapeTask;


import day51_Abstraction.Square;

public class ShapeObjects {
    public static void main(String[] args) {
       // Shape shape = new Shape("Shape");we cannot create object from abstract classes

        Circle circle= new Circle(3);
        Square square= new Square(5);
        Rectangle rectangle= new Rectangle(6, 4);

        System.out.println(circle);
        System.out.println(square);
        System.out.println(rectangle);
    }
}
