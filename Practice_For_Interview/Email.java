package Practice_For_Interview;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String email= scan.next();
        // margie.kowalczyk@gmail.com  converting to kowalczyk.margie@gmail.com

        if(email.contains(".")){
            int indexOfDot= email.indexOf(".");
            int indexOfAt= email.indexOf("@");
            String firstName=email.substring(0,indexOfDot );
            String lastName=  email.substring(indexOfDot+1,indexOfAt);
            System.out.println(lastName+"."+firstName+email.substring(indexOfAt));
        }else{
            System.out.println(email);


            System.out.println("---------------------------");


           // mkowalczyk42@gmail.com
            int ch4=email.lastIndexOf("k");
            int ch2 = email.indexOf("@");

            if(email.contains("42")) {
                int indexOfNum = email.indexOf("42");
                char n = scan.next().charAt(0);

            }
        }

    }

}
