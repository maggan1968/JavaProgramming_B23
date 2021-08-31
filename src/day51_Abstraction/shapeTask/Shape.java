package day51_Abstraction.shapeTask;

public abstract class Shape {

    private final String name;//instance because can be many shapes

    public Shape(String name) {// name is mandatory to set a name
        this.name = name;
    }

    public String getName() {
        return name;
    }
// if  private data is final ,i cant to setter only getter

    public abstract double area();//method without a body, therefore we have to add abstract method

    public abstract double perimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                ", area=" + area() +
                ", perimeter ='" + perimeter() +
                '}';
    }
}
