abstract class Abstract {

    abstract void m1 ();
    abstract void m1 (String city);
}

class Child extends Abstract {

    public static void main(String[] args) {

        Child obj=new Child();
        obj.m1();
        obj.m1("Vienna");
    }
        void m1 () {
            System.out.println("m1 without parameters");
        }

        void m1 (String city){
            System.out.println("m1 with parameter");
        }
    }

