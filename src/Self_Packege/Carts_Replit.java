package Self_Packege;

import java.util.Scanner;

public class Carts_Replit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int house = scan.nextInt();
        int player = scan.nextInt();

        //Write your code here:

        if((player)>21){
            System.out.println("player bust");
        }else if(house>player){
            System.out.println("player loss ");
        }else if(house==player){
            System.out.println("its a tie");
        }else if(house<player){
            System.out.println("player win");
        }

    }
}


