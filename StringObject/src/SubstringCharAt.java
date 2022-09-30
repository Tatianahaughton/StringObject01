import java.util.Arrays;

public class SubstringCharAt {
    public static void main(String[] args) {

        //Substring vs charAt vs IndexOf

        String str="Today is Sunday";
        //String str2=new String("Today is Sunday");
        String day=str.substring(7);//finds index you want to edit from
        System.out.println(day);

        System.out.println("---------");

        System.out.println(str.substring(4,6));//

        System.out.println("----------------------------------");

String string="Good morning";
        System.out.println(string.substring(5));//choses starting point of the string to print out from
        System.out.println(string.substring(5, 11));//gives starting and ending index. ending index-1/doesnt include the end

        int index=string.indexOf("a",6);//finds an index of a char ignoring the first 6.

        String str3="Hello Class";
        String part2=str3.substring(6);
        System.out.println(part2);
        String part1=str3.substring(0,5);
        System.out.println(part1);

        //concat
        String newString=part1.concat(" ").concat(part2);
        System.out.println(newString);
        System.out.println(part1+part2);

        //example

        char single=newString.substring(6).charAt(0);//shows char at index 6.
        System.out.println(single);

                            //wrong syntax
        //newString.charAt(0).substring(6) -its looking for a substring method in a char which doesnt exist.Cant store chars in a string data type.

    }
}
