package day34_LocalDateTime_Wrapper;

import java.time.LocalTime;

public class LocalTime_Intro {
    public static void main(String[] args) {

        LocalTime now= LocalTime.now();

        System.out.println(now);

        LocalTime breakTime = now.plusMinutes(15);

        System.out.println(breakTime);

        LocalTime quizeDue = breakTime.plusMinutes(20);
        System.out.println(quizeDue);


        LocalTime comeBackAt=LocalTime.of(11,40);
        System.out.println("COme Back at: "+ comeBackAt);

    }
}
