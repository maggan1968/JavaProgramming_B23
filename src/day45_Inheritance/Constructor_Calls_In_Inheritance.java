package day45_Inheritance;


class A{
    public A(){
        System.out.println("A");
    }
}

class B extends A{

    public B(){
        //  super(); //A
        System.out.println("B");
    }

}

public class Constructor_Calls_In_Inheritance {

    public static void main(String[] args) {
        new B();

    }

}
