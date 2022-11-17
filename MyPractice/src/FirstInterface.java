public interface FirstInterface {
    void firstMethod();
}
interface SecondInterface {
    void secondMethod();
}

class Boo implements FirstInterface,SecondInterface {
    @Override
    public void firstMethod() {
        System.out.println("first method of interface");
    }public void secondMethod() {
        System.out.println("second method of interface");
    }

    public static void main(String[] args) {
        Boo boo=new Boo();
        boo.firstMethod();
        boo.secondMethod();
    }
}
