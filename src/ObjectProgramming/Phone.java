package ObjectProgramming;

public class Phone {
    public int year;
    String make;
    String model;
    String color;
    int storage;
    double size;
    boolean cheap;
    void call() {
        System.out.println("calling..");
    }
    void takePicture() {
        System.out.println("Taking pics....");
    }

    public static void main(String[] args) {
        //Name of class
        Phone iphone=new Phone();

        iphone.make="Iphone";
        iphone.model="11";
        iphone.color="Black";
        iphone.storage=128;
        iphone.size=6.5;
        iphone.cheap=false;
        System.out.println("Make " +iphone.make+ " Model "+iphone.model);
        iphone.takePicture();

        System.out.println("----------------------------");

        Phone samsungPhone=new Phone();
        samsungPhone.make="Samsung";
        samsungPhone.model="dfdf";
        samsungPhone.color="White";
        samsungPhone.storage=256;

        System.out.println(samsungPhone.make);
        samsungPhone.call();
    }
}
