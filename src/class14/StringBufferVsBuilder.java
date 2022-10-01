package class14;

public class StringBufferVsBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder("Today is java class");
        StringBuffer stringBuffer=new StringBuffer("Today is java class");

        String str="Java is very easy";
        StringBuilder stringBuilder1=new StringBuilder(str);//converts str to stringBuilder1 so that we can access things from that class
        System.out.println("stringBuilder1 = " + stringBuilder1);
        String  newStr=stringBuilder1.toString();//converting stringBuilder back to String
    }

}
