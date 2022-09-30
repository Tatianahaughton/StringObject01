package ObjectProgramming;

public class Employee {
    String name;
    String Id;
    String department;
    double salary;
    String shift;
    char gender;
    //Behaviors
void work() {
    System.out.println(name+ " is working on shift " +shift);
}
void takesLunch() {
    System.out.println(name+ "is going to lunch ");
    }

    public static void main(String[] args) {
        Employee empl = new Employee();
        empl.name = "Tatiana";
        empl.department="IT";
        empl.shift="Evening";
        empl.salary=200000;
        empl.work();

        System.out.println("-------------------------------");

        Employee empl2=new Employee();
        empl2.name="Adam";
        empl2.department="Sales";
        empl2.salary=150000;
        empl2.shift="Morning";
        empl2.work();
    }
}



