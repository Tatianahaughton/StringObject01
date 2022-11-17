public class Prac {
    public static void main(String[]args) {
        Parent[] classes = {new Child1(), new Child2(), new Child3()};
        for (Parent ba : classes) {
            ba.hello();
        }
    }
}

