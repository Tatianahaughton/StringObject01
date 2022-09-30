import java.util.Arrays;

public class CharAtString {
    public static void main(String[] args) {
        String str = "I love java programming";
        /*
        charAt returns char at specific index
         */

        for (int i = 0; i < str.length(); i++) {//need a method next
            if (!(str.charAt(i) == ' ')) {// ignore spaces and prints characters only
                System.out.println(str.charAt(i));
            }
            System.out.println(str.charAt(2));//prints letter in 2nd place
            System.out.println(str.charAt(i));//prints all chars
        }
        System.out.println("----------------------------");
        //Get charAt and last char
        String strings = "wonderful";
        char letter = strings.charAt(4);//make a new variable to store charAt(4)
        System.out.println(letter);//gives letter e
        System.out.println(strings); //gives wonderful

        char lastChar = strings.charAt(strings.length() - 1);//gives last char value; need to store this value under a new variable again
        System.out.println(lastChar);

        char c = str.charAt(4);//finds a character at provided index  in a string

        char[] charArr = str.toCharArray();
        System.out.println(Arrays.toString(charArr));
        //System.out.println(charArr);//is converted to a String. Proper way to print an array.

    }
}
