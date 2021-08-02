package day37_CustomClass;

public class Students {
    public String name;
    public String gender;
    public int age;
    public int studentID;

    public void setInfo (String studentName, String studentGender,int studentAge, int studentStudentID){
        name = studentName;
        gender = studentGender;
        age = studentAge;
        studentID = studentStudentID;
    }

    public void getInfo(){
        System.out.println("name = " + name);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        System.out.println("studentID = " + studentID);
    }

    public void eat(String food){
        System.out.println(name + " is eating "+food);
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public void coding(){
        System.out.println(name+" is coding");
    }

    public void crying(){
        System.out.println(name+" is crying");
    }


}
