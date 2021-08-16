package Practice_Constructors;

public class Square {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {//parameters has to mach
        if(side<0){// implementing condition
            return;
        }
        this.side = side;

    }
    //Add a constructor that can set the instances when the object is created
    //                (avoid any duplicated code fragments)
    public Square(double side) {//constructor
        setSide(side);
    }
    public double area(){

        return side*side;
    }
    public double perimeter(){
        return 4*side;
    }
    public boolean equals(Square square){
                      //argument


        return side==square.getSide();
    }

    public String toString() {
        return "Square{" +
                "side=" + getSide() +
                "area=" + area() +
                "perimeter=" + perimeter() +
                '}';
    }
}

/*
 1. create a class named Square
            private variables:
                side (double)

            Encapsulate All the private fields
                (side can not be set to negative)

            Add a constructor that can set the instances when the object is created
                (avoid any duplicated code fragments)

            Extra methods:
                area(), perimeter(), toString(), equals()
 */