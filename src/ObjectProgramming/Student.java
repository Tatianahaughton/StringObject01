package ObjectProgramming;

public class Student {
    String name;
    String id;
    double weight;
    int age;
    char gender;

    void study() {
        System.out.println("Student is studying");
    }

    void deleteMessages() {
        System.out.println("Student is deleting messages");
    }
    void eat() {
        System.out.println("Student is eating Pizza");
    }


    public static void main (String[]ergs) {
        Student student=new Student();

        student.name="Tanya";
        student.id="123";
        student.weight=145;
        student.age=36;


        System.out.println(student.name+" with ID "+student.id+" and weight of  "+student.weight+" is age "+student.age);


        student.study();
        student.deleteMessages();
        student.eat();
        System.out.println("---------------------------------------------");

        Student tatiana=new Student();
        tatiana.name="Tatiana";
        tatiana.age=16;
        tatiana.weight=30;
        tatiana.gender='F';
        System.out.println(tatiana.name);
        tatiana.eat();

    }

}