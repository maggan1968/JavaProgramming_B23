package OOP;

import java.util.Scanner;
public class Carpet {

    public double width,length,unitPrice;
    public int totalPrice;
    public boolean isPersian;

    public Carpet(){// constructor with no arguments
        width=300;
        length=300;
        totalPrice=200;
        isPersian=false;
        unitPrice=0;

    }
    public Carpet(double width, double length, double unitPrice,boolean isPersian)
    {// constructor with 4 arguments
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;

       totalPrice= (int)((width+length)*unitPrice);
       if (isPersian==true){
           totalPrice+=200;
       }
    }
}


