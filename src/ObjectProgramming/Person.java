package ObjectProgramming;

public class Person {
    String name;
    int age;
    double weight;
    boolean isfunny;
    double height;
    boolean losingHairs;

    void study() {//add condition for printing out inside the behaviors
        if(name.equals("Anna")) {
            System.out.println("I study hard");
        }else if(name.equals ("Roman")) {
            System.out.println("I wont let anyone study");
        }else {
            System.out.println("I try to study but things don't make sense");
        }
    }

    public static void main(String[] args) {
        Person person1=new Person();
        person1.name="Anna";
        person1.study();
        System.out.println("----------------------");
        Person another=new Person();
        another.name="Roman";
        another.study();
        System.out.println("--------------------");

        Person another1=new Person();
        another1.name="Tatiana";
        another1.study();

    }
}
