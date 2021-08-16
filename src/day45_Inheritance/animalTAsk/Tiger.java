package day45_Inheritance.animalTAsk;

public class Tiger extends Animal{// Tiger Is An animal

   /*
    name, breed, gender, size, age, color,sleep,breath
    setInfo(),eat(), drink(),sleep(),toString()
    */

    public Tiger(String name, String breed, char gender, String size, int age, String color){
        super(name, breed, gender, size, age, color);
    }
    public void roar(){
        System.out.println(name+"is raring");
    }
}
/*
Attributes:
name, breed, gender, size, age, color
Actions:
  roar(), sleep(), eat(), drink(), toString()
 */
