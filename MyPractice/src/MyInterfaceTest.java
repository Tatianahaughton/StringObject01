public class MyInterfaceTest implements MyInterface {

    public void method1() {
        System.out.println("implementation of method1");
    }


    public void method2() {
        System.out.println("implementation of method2");
    }


    public static void main(String[]args) {
        MyInterface myinterface=new MyInterfaceTest();
        myinterface.method1();
        myinterface.method2();
    }
}




