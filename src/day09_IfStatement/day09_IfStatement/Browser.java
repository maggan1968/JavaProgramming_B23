package day09_IfStatement.day09_IfStatement;

public class Browser {
    public static void main(String[] args) {

        String browserName = "Firefox";
        if (browserName=="Chrome") {
            System.out.println(browserName+ " Browser is Selected");
        }else if (browserName== "Firefox"){
            System.out.println(browserName+ " Browser is Selected");
        }else if (browserName == "Opera"){
            System.out.println(browserName+ " Browser is Selected");
        }else if (browserName == "Safari") {
            System.out.println(browserName+ " Browser is Selected");
        }else {
            System.out.println("Invalid Browser Name");}

    }
}
/*
write a program that can display the selected browser
                1. declare a String variable called browserName
                2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                3. if the browser name does not match with the valid browsers' names, output should be: Invalid Browser Name

             Ex:
                browserName = "chrome";

                output:
                    Chrome Browser is Selected

 */