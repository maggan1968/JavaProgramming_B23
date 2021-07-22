package Practice_For_Interview;

import java.util.Scanner;

public class Email_SplitMethod {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

    String email = scan.nextLine();
    String[] newEmail=email.split("@");

    if(newEmail.length==2){
            System.out.println("Email id: "+newEmail[0]);
            System.out.println("Email domain: "+newEmail[1]);


            }else{
            System.out.println(" invalid email");
            }


            }

            }
/*
Given a String variable email, write code using split method to print email id and domain in separate lines.

Example:

email -> info@cybertekschool.com

Output:
Email id: info
Email domain: cybertekschool.com
email -> info@cybertekschool.com

Output:
Email id: info
Email domain: cybertekschool.com
If email contains no @ character or multiple @ characters then print invalid email:

email -> hello-gmail.com

Output:
invalid email
email -> hello-gmail.com

Output:
invalid email
email -> my@fancy@email.com

Output:
invalid email
 */