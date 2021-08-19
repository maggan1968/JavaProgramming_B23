package utilities;

public class Data2 {


    public  String publicVariable= "public";
    protected  String protectedVariable ="protected";
    String defaultVariable= "default";
    private String privateVariable = "private";


    public void  publicMethod(){
        System.out.println("Public Method");
    }

    protected  void protectedMethod(){
        System.out.println("Protected Method");

    }

    void defaultMethod(){
        System.out.println("Default Method");

    }

    private  void privateMethod(){
        System.out.println("Private Method");
    }
}
