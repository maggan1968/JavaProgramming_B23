package day47_Recap.phoneTask;

public final class IPhone extends Phone {


    public IPhone(String model, String size, String color, double price) {
        super("Apple", model, size, color, price);
    }



    @Override
    public void call(long phoneNumber) {
        System.out.println("Apple' iphone is calling " + phoneNumber);
    }
    public void  call(long phone1,long phone2){//overloading
        call(phone1);
        call(phone2);
    }
    public void  call(long phone1,long phone2, long phone3){// overloading
        call(phone1, phone2);
        call(phone3);
    }
    @Override
    public void text(long phoneNumber) {
        System.out.println("Apple' iphone is texting " + phoneNumber);
    }

    public final void faceTime(long phoneNumber){
        System.out.println("Apple' iphone is face timing with " + phoneNumber);
    }
    public final void faceTime(long phone1,long phone2){
        faceTime(phone1);
        faceTime(phone2);

    }

}

