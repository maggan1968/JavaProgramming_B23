package Self_Packege;

import java.util.Scanner;

public class Tip_Calculate {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        //System.out.println("Split or No split (Yes or No");
        String yesOrNo = scan.next();
        //System.out.println("Number of people entered:");
        int numberOfPeople = scan.nextInt();
        //System.out.println("Check amount:");
        double amountCheck = scan.nextDouble(),
                totalPay = 0, totalTip = 0, totatlAmountPerPerson = 0, tipPerPerson = 0;

        //System.out.println("Service Quality");
        scan.nextLine();
        String quality = scan.nextLine();

        if (yesOrNo.equalsIgnoreCase("yes")) {
            totalTip = amountCheck / numberOfPeople;


        } else if (yesOrNo.equalsIgnoreCase("no")) {
            if (quality.equalsIgnoreCase("excellent")) {
                totalTip = amountCheck * 25 / 100;
            } else if (quality.equalsIgnoreCase("Great")) {
                totalTip = amountCheck * 20 / 100;
            } else if (quality.equalsIgnoreCase("Good")) {
                totalTip = amountCheck * 15 / 100;
            } else if (quality.equalsIgnoreCase("Fair")) {
                totalTip = amountCheck * 10 / 100;
            } else if (quality.equalsIgnoreCase("poor")) {
                totalTip = amountCheck * 5 / 100;
            } else {
                System.out.println("There is no tip given");
            }
        } else {
            System.out.println("invalid input");
        }
        totalPay = totalTip + amountCheck;
        totatlAmountPerPerson = totalPay / numberOfPeople;
        tipPerPerson = totalTip / numberOfPeople;

        String stringNumOfPPle = "";


        //Number of people entered: (number) (each person = & in output)
        //by using for() loop
        for (int i = 1; i <= numberOfPeople; i++) {
            stringNumOfPPle += "&";
        }


        System.out.println("Split:");
        System.out.println("Number of people:");
        System.out.println("Check amount:");
        System.out.println("Service Quality:");
        System.out.println("Number of people entered: " + stringNumOfPPle);
        System.out.println("Total to pay: " + totalPay);
        System.out.println("Total tip: " + totalTip);
        System.out.println("Total per person: " + totatlAmountPerPerson);
        System.out.println("Tip per person: " + tipPerPerson);
    }
}
/*
Write a program for a tip calculator. There will be different service quality benchmarks that will determine the tip given. There will also the ability to calculate based on the number of people in the party and if there is a split of the bill or not.

> Poor = 5%
> Fair = 10%
> Good = 15%
> Great = 20%
> Excellent = 25%

The program should display the following information based on the user input:

Split or No split (Yes or No)
Number of people entered: (number) (each person = & in output)
Check amount: (number)
Service Quality: (String)
Total to pay:
Total tip:
Total per person:
Tip per person:

```
Example

Input:
Yes
4
476.0
Excellent

Output:
Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
```
 */