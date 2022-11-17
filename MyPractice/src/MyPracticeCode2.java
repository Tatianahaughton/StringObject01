public class MyPracticeCode2 {
    String s;

    String spaceOut(String word) {
            s = word.replace("", " ");
            System.out.println(s);
        return s;
    }


    public static void main(String[] args) {
        MyPracticeCode2 obj=new MyPracticeCode2();
        obj.spaceOut("America");
    }


}




