package day51_Abstraction.shapeTask;

public class Rectangle extends Shape {

    private double length, width;

    public double getL() {
        return length;
    }

    public void setLength(double length) {
        if(length <= 0){
            throw new RuntimeException("Invalid Length: "+length);
        }
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width <= 0){
            throw new RuntimeException("Invalid Width: "+width);
        }
        this.width = width;
    }

    public Rectangle(double length, double width) {
        super("Rectangle");
       setLength(length);
        setWidth(width);
    }

    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return (length + width)*2;
    }

}
