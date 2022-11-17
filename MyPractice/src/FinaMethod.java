public class FinaMethod {
    public static void main(String[] args) {

        FinaMethod obj = new FinaMethod();
        obj.display(true);
        obj.display("Tatiana");
    }


        boolean word;
        String name;

        static final void display(boolean word) {

            System.out.println("Final method with boolean parameter");
        }


        static final void display(String name) {

            System.out.println("Final method with String parameter");
        }
    }

