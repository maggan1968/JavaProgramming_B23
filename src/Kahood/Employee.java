package Kahood;

public class Employee {
    public String name;
    public double salary;

    public void setInfo(String name, double salary) {
       name = name;
       salary = salary;
    }
}
 class Test{
    public static void main(String[] args) {
        Employee e1=new Employee();

        e1.setInfo("Aliya",110000);
        e1.setInfo("Nathan",10005);
        System.out.println(e1.name +":"+e1.salary);
    }
}