package ObjectProgramming;

class ObjectDog {

        String breed;
        String name;
        String color;

        void bark(){System.out.println(breed+" can bark");}
        void run(){System.out.println(breed+" can run");}
        void play(){System.out.println(breed+" can play");}

        public static void main(String[] args) {

          ObjectDog dog1=new ObjectDog();
            dog1.breed="Husky";
            dog1.name="Hus";
            dog1.color="brown";
            dog1.bark();
            dog1.run();
            dog1.play();

            ObjectDog dog2=new ObjectDog();
            dog2.breed="Bulldog";
            dog2.name="Bull";
            dog2.color="black";
            dog2.bark();
            dog2.run();
            dog2.play();

           ObjectDog dog3=new ObjectDog();
            dog3.breed="Labrador";
            dog3.name="Lab";
            dog3.color="black";
            dog3.bark();
            dog3.run();
            dog3.play();

        }

    }


