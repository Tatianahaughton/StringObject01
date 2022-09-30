package ObjectProgramming;

public class PhoneTester {
    //Creating an object phone with the existing Phone class.

    public static void main(String[] args) {


    PhoneHw iphone=new PhoneHw();//needs to be the same class as the object you made
    iphone.make="Apple";
    iphone.model="Iphone 14";
    iphone.year=2022;
    iphone.call();

    PhoneHw samsung=new PhoneHw();
    samsung.model="S22 Ultra";
    samsung.make="Samsung";
    samsung.year=2022;


}
}