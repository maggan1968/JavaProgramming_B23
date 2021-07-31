package day37_CustomClass;

public class Cat {

    public String name;
    public String breed;
    public int age;
    public String size;
    public String color;
    public String gender;


    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    public void scratch() {
        System.out.println(name + " is scratching ");
    }

    public void play() {
        System.out.println(name + " is playing ");
    }

    public  void jump(){
        System.out.println(name + " Is jumping ");
}
    public void breakThinks(){
        System.out.println(name + " is breaking thinks");

    }
    public void meow(){
        System.out.println(name + " is meaw");
    }

    public void setInfo(String catName, String catColor, String catGender,int catAge,String catBreed ){
        name= catName;
        color=catColor;
        gender=catGender;
        age=catAge;
        breed=catBreed;

    }
    public void getInfo() {
        System.out.println("name = " + name);
        System.out.println("color = " + color);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        System.out.println("breed = " + breed);
    }}

/*
Cat:
		Attribute: name, color, gender, age, breed....
		Actions: scratch(), breakThings(), jump(), eat(), drink(), meow()....
				 setInfo(), getInfo()

 */