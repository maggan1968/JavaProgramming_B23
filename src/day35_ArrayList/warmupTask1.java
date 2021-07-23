package day35_ArrayList;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

public class warmupTask1 {
    public static void main(String[] args) {

        LocalDate[]dates=new LocalDate[10];



        for (int i = 0; i < dates.length; i++) {
            dates[i]=LocalDate.now().plusDays(i+1);// i+1 exclude a today day,
         //   dates[i]=LocalDate.of(2021,7,19).plusDays(i+1);// starts from more days before
        }
        System.out.println(Arrays.toString(dates));

        for (LocalDate each:dates) {
            System.out.println(each.format(DateTimeFormatter.ofPattern("MMMM/dd, EEEE")));
            
        }
    }
}
/*
11. create an array of LocalDate and has the nexy 10 days dates,
use for each loop to print each Date in the following format:
ex:
November/25,Wednesday
 */