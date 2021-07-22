package day09_IfStatement.day09_IfStatement;

public class maximumNumber2 {
    public static void main(String[] args) {

        int a=10, b=20;

        if(a>b){
            System.out.println(a+"is maximum");
        } else if (b>a) {
            System.out.println(b + " is maximum");
        }else{
            System.out.println("equal");
        }

    }
}
