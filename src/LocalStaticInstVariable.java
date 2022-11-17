public class LocalStaticInstVariable {

    static String name="Confused";
    public static void main(String[] args) {

        int number = 0;
        System.out.println();
        //local vars are defines inside blocks of code and can only be used inside those blocks of code
        //System.out.println(name);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        {
            int i = 0;
        }
        //System.out.println(i);
    }
        void printNumber() {
            int number = 4;
            //System.out.println(number);//cant access; number outside main method
            String name = "Allan";
        }
    }

