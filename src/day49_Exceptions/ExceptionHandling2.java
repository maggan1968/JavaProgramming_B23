package day49_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandling2 {
    public static void main(String[] args) {


        try {
            FileInputStream file = new FileInputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();// gives the full report of the exception

        }
        System.out.println("Test Completed");


        System.out.println("----------------------------------------");

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Test Completed");
    }
}
