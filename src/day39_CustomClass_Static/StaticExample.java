package day39_CustomClass_Static;

import java.util.concurrent.Callable;

class CybertekStudent{

    public String name,gender;
    public  int age,ID;

    public static String schoolName= "Cybertek School";
    public static String programingLanguage="Java";
}





public class StaticExample {
    public static void main(String[] args) {

        CybertekStudent student1=new CybertekStudent();
        CybertekStudent student2=new CybertekStudent();
        CybertekStudent student3=new CybertekStudent();
        CybertekStudent student4=new CybertekStudent();

        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);
        System.out.println(student3.schoolName);
        System.out.println(student4.schoolName);

        System.out.println("---------------------------------------");

        System.out.println(student1.programingLanguage);
        System.out.println(student2.programingLanguage);
        System.out.println(student3.programingLanguage);
        System.out.println(student4.programingLanguage);


        System.out.println("-------------------------------------");

        System.out.println(CybertekStudent.schoolName);
        System.out.println(CybertekStudent.programingLanguage);

        System.out.println(student1.age);

            }
        };


