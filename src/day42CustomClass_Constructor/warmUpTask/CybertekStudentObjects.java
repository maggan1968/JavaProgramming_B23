package day42CustomClass_Constructor.warmUpTask;

public class CybertekStudentObjects {
    public static void main(String[] args) {

        CybertekStudent student1= new CybertekStudent("Feruza",20,'F');
        CybertekStudent student2= new CybertekStudent("Alisa",27,'F');

        System.out.println(student1);
        System.out.println(student2);

        student1.attendClass();
        student2.replit();

        student1.askForBreak();
    }


}
