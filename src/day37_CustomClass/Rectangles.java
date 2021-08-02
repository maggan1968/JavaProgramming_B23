package day37_CustomClass;


    /*
 create a custom class named Rectangle
     Attributes:
         length, width

     Actions:
         setInfo: sets the length and width of the rectangle
         calculateArea(): calculates the area of the rectangle, returns it as double
         calculatePerimeter() calculates the perimeter of the rectangle, returns it as double
         getInfo(): prints the width, length, area and perimeter of the rectangle

  */
    public class Rectangles {

        public double length;
        public double width;

        public static void main(String[] args) {

            Rectangles rect1=new Rectangles();
            rect1.setInfo(10,20);
            rect1.getInfo();
            rect1.CalculateArea();
            rect1.CalculatePerimeter();

            System.out.println("------------------------------------------------");

            Rectangles rect2=new Rectangles();
            rect2.setInfo(45,30);
            rect2.getInfo();
            rect2.CalculateArea();
            rect2.CalculatePerimeter();

        }

        public void setInfo(double RectLength, double RecWidth){
            length=RectLength;
            width=RecWidth;

        }

        public void CalculateArea(){
            double area=length*width;
            System.out.println("Area is "+area+" cm");
        }
        public void CalculatePerimeter(){
            double Perimeter=2*(length+width);
            System.out.println("Perimeter is "+Perimeter+" cm");
        }
        public void getInfo(){
            System.out.println("Length is "+length+" cm");
            System.out.println("Width is "+width+" cm");
            System.out.println("Area is "+width*length+" cm");
            System.out.println("Perimeter is "+(2*(width+length))+" cm");
        }

    }


