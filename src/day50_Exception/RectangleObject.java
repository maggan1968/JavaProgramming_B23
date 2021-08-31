package day50_Exception;

public class RectangleObject {

    public void method()throws Throwable{

        this.finalize();// clean up
    }


    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(5, -4);

        System.out.println(r1);


    }
}
