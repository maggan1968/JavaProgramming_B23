package day46_Inheritance.shapeTask;

public class Circle extends Shape  {// Circle is A Shape

   private  double radius, diameter;
   private  final static  double PI= 3.14;

    public Circle( double radius ) {
        super("Circle");
        setRadius(radius);
      setDiameter(radius * 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius<0){
            return;
        }
        this.radius = radius;
        diameter=2*radius;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        if(diameter<0){
            return;
        }
        this.diameter = diameter;
        radius=diameter/2;
    }

    @Override
    public double area() {
       return radius * radius * PI;
    }

    @Override
    public double perimeter() {
        return diameter * PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                " radius=" + radius +
                ", diameter=" + diameter +
                ", area =" + area() +// can be call super.toString()+ ;
                ", perimeter =" + perimeter() +//can be call super.toString()+ ;
                '}';
    }
}

/*
2. create sub classes of Shape:
						Circle
						Rectangle
						Square

			 give the instance variables that are needed to calculate the Area, perimeter, of those shapes

 */

