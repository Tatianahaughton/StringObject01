public class CarTEster {

    public static void main(String[] args) {

        Car car = new Car("Toyota", "Pirus", 120, 30000.0);
        car.display();

        Car car2 = new Car("Toyota", "Pirus", 120, 30000.0);
        car2.display();

        Car car3 = new Car(4, 120, 30000.0);
        car3.display();

        Car car4 = new Car("Toyota", "Pirus", 4);
        car4.display();
    }
}

