public class TeaTest {
    public static void main(String[] args) {
        Tea[] teas={new LemonTea("lemon"),new ChaiTea("chai")};
        for(Tea tea2:teas) {
            tea2.addSugar();
        }
    }
}
