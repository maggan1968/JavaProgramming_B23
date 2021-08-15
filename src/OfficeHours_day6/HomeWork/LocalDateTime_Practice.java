package OfficeHours_day6.HomeWork;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime_Practice {
    public static void main(String[] args) {

        DateTimeFormatter DF= DateTimeFormatter.ofPattern("MM/dd/YYYY");
        LocalDate today= LocalDate.now();
        System.out.println(today);// 2021-07-22

        System.out.println(today.format(DF));// 07/22/2021



        DateTimeFormatter TF=DateTimeFormatter.ofPattern("hh:mm  a");//a:am/pm
        LocalTime currentTime= LocalTime.now();
        System.out.println(currentTime);// curr.time: 18:53:29

        System.out.println(currentTime.format(TF));//6:53 Pm


        LocalTime time1= LocalTime.of(16,36);
        System.out.println(time1);//16:36

        System.out.println(time1.format(TF));//4:36 PM


        System.out.println("-----------------------------------------");


        DateTimeFormatter format=DateTimeFormatter.ofPattern(" EEEE, YYYY/MM/dd");
        LocalDateTime time2=LocalDateTime.of(2021,7,23,12,23);
        System.out.println(time2);//2021-07-23T12:23

        System.out.println(time2.format(format));//Friday, 2021/07/23

        // what day is 2022-01-01
        String result =  LocalDate.of(2022,2,28).format(  DateTimeFormatter.ofPattern("EEEE")  );
        System.out.println("result = " + result);

        System.out.println(nameOfTheDay(2025, 5, 28));

    }

    public static String nameOfTheDay(int year, int month, int day){
        String result =  LocalDate.of(year, month,day).format(  DateTimeFormatter.ofPattern("EEEE")  );
        return result;
    }



}




