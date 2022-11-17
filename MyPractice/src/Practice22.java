public  class Practice22 {
   void m2() {

   }

    void m1() {
        System.out.println("Parent class providing implementation");
    }

}
class Parent22 extends Practice22 {
        public void m2() {
            System.out.println("Child class providing implementation");
        }
    public static void main(String[] args) {
       Parent22 obj = new Parent22();
        obj.m2();
        obj.m1();

    }
}


