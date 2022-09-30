package ObjectProgramming;

public class Dog {
    //states/atributes/properies/fields of Object
    String name;
    String color;
    String breed;
    int weight;
    int age;

    //Behavior/methods/functions
    void bark() {
        System.out.println("Barking...........");
    }

    void sleep() {
        System.out.println("Sleeping..............");
    }

    public static void main(String[] args) {
        //Creating object from class
        Dog doggie = new Dog();
        //calling behaviour on an object
        doggie.bark();
        doggie.sleep();

    }
}
