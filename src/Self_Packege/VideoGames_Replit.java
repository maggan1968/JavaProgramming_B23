package Self_Packege;

import java.util.Scanner;

public class VideoGames_Replit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of coupons:");
        int numOfCoupons = scan.nextInt(),
                numOfCandies = numOfCoupons / 10,
                numOfGumballs = (numOfCoupons % 10) / 3;
        if (numOfCoupons >= 3) {
            System.out.println("Number of Candies: " + numOfCandies + "\n" +
                    "Number of Gumballs: " + numOfGumballs);
        } else {
            System.out.println("Not enough coupons");
        }

    }
}
