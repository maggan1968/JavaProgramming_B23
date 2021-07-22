package day11_Switch;

public class Switch_Statement_2 {
    public static void main(String[] args) {

        String name = "chrome";

        switch (name){

            case "chrome":
                System.out.println("chrome Browser is selected");
                break; // case closed

            case "firefox":
                System.out.println("Firefox Browser is selected");
                break; // case closed

            case "edge":
                System.out.println("Edge Browser is selected");
                break; // case closed




            default:
                System.out.println("Invalid Browser Name");
        }

    }
}
