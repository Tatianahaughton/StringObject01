public class AnimalTester {
    class Main {
        public static void main(String[] args) {
            Animal[] cats = {new Cat("Cat"), new Kitten1("kitten1"), new Kitten2("kitten2"), new Kitten3("kitten3")};

            for (Animal animals : cats) {
                animals.eat();
                animals.sleep();
            }
        }
    }
}

