package day45_Inheritance.animalTAsk;

public class Dog extends Animal {//Dog Is An animal
   /*
    name, breed, gender, size, age, color,sleep,breath
    setInfo(),eat(), drink(),sleep(),toString()
    */

    public Dog(String name, String breed, char gender, String size, int age, String color){
        super(name, breed, gender, size, age, color);
    }

    public void bark(){
        System.out.println(name+" is barking");
    }

}
/*
Attributes:
name, breed, gender, size, age, color
Actions:
  bark(), sleep(), eat(), drink(), toString()
 */