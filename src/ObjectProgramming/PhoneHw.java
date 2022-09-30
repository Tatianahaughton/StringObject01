package ObjectProgramming;

public class PhoneHw {
    //Create states;attriburtes,property and fields
    String make;
    String model;
    String color;
    int year;

    //Behaviors/Methods/Functions next..Define behavior by using void method
//no main method needed since we dont need to run anything
    void call() {
        System.out.println("Making a call using "+model);
    }
    void takePics() {
        System.out.println("Taking pics with "+model);
    }

    void browseInternet() {
        System.out.println("Browsing internet "+model);
    }
}
