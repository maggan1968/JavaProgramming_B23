package day37_CustomClass;

public class Car {

        public String make;
        public String model;
        public String color;
        public int price;
        public int year;

        public void setInfo(String carMake, String carModel, String carColor, int carPrice, int carYear) {
            make = carMake;
            model = carModel;
            color = carColor;
            price = carPrice;
            year = carYear;
        }

        public void getInfo(){
            System.out.println(year+" "+ make+" "+model+" "+color+" "+price);
        }




    }


