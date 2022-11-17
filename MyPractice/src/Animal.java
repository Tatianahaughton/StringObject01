public class Animal {
            String type;

            Animal(String type) {
                this.type=type;
            }


            void eat() {
                System.out.println("Animal is eating");
            }
            void sleep () {
                System.out.println("Animal is sleeping");
            }
        }

        class Cat extends Animal {

            Cat(String type) {
                super(type);
            }

            void sleep() {
                System.out.println("Cat sleeps a lot");
            }
        }

        class Kitten1 extends Cat {

            Kitten1(String type) {
                super(type);
            }

            void eat() {
                System.out.println("Kitten1 eats milk");
            }
        }

        class Kitten2 extends Cat {

            Kitten2(String type) {
                super(type);
            }

            void eat() {
                System.out.println("Kitten2 eats milk");
            }
        }

        class Kitten3 extends Cat {

            Kitten3(String type) {
                super(type);;
            }

            void eat() {
                System.out.println("Kitten3 eats everything");
            }
        }



