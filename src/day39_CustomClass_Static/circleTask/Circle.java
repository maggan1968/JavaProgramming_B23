package day39_CustomClass_Static.circleTask;

import java.text.DecimalFormat;

public class Circle {
    public double radius, diameter;
   // public  static double PI=3.14; //only one copy static variables will be shared by all circle objects

    //setInfo(): initializes all the instance of the Circle
    public void setInfo(double radius){
        this.radius=radius;
        diameter=2*radius;
    }
    //calculate(): returns the area of the circle
    public double area(){
       return radius*radius*Math.PI;
    }
    //calculatePerimeter(): returns the perimeter of the circle
    public double perimeter(){
        return diameter*Math.PI;
    }
//toString(): displays the radius, diameter, perimeter and area of the circle object
      public String toString() {
          DecimalFormat df = new DecimalFormat("0.000");
        return "Circle{" +
                "radius= " + radius +
                ", diameter= " + diameter +
                ", area= " + df.format(area()) +
                ", perimeter= " + df.format(perimeter()) +
                '}';
    }
}

/*
CircleTask
        1. create a class named Student that has the followings features
            Attributes:
                    radius, diameter

                methods:
                    calculate(): returns the area of the circle
                    calculatePerimeter(): returns the perimeter of the circle
                    setInfo(): initializes all the instance of the Circle
                    toString(): displays the radius, diameter, perimeter and area of the circle object
 */