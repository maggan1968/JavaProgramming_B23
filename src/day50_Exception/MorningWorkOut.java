package day50_Exception;

public class MorningWorkOut {
    public static void main(String[] args) {


        for (int i = 1; i <= 30; i++) {
            System.out.println("Push-up " + i);
            pause(2.5);

        }

        System.out.println("---------------------------------");

        for (int i = 1; i <= 20; i++) {
            System.out.println("Pull-up " + i);
            pause(3.5);
        }

    }

    public static void pause(double seconds) {
        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //                 (long)     (2.5 * 1000)
        //                                2500.0
    }
}




