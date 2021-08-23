package day48_JavaRecap.cybertekTask;

import java.time.LocalDate;

public class Cybertek {

    public static void main(String[] args) {


        //  we added just object  created in subclasses

        Tester tester = new Tester("Yasin", 'M', LocalDate.of(1995, 5, 28), 11, "SDET", 110000);
        tester.eat("Steak");
        tester.drink("Coffee");
        tester.sleep();
        tester.work();
        tester.attendMeeting();

        System.out.println("-------------------------------------------------");

        Developer developer = new Developer("Mucahit", 'M', LocalDate.of(1992, 6, 16), 12, "Java Developer", 120000);
        developer.eat("Fish");
        developer.drink("Tee");
        developer.sleep();
        developer.work();
        developer.attendMeeting();

        System.out.println("----------------------------------------------------------");

        Teacher teacher= new Teacher("Asiya", 'F', LocalDate.of(1996, 8, 19), 18, "Softskill Teacher", 130000);
        teacher.eat("Pizza");
        teacher.drink("Coffee");
        tester.sleep();
        tester.work();
        teacher.attendMeeting();

        System.out.println("-----------------------------------------------------------");

        Student student = new Student("Yuliia", 'F', LocalDate.of(1996, 7, 19), "Cybetek", 28);
        student.eat("Steak");
        student.drink("Coca-Cola");
        student.sleep();
        //student.work();
        //student.attendMeeting();

    }
}
