import java.util.LinkedList;
import java.util.List;

public class LinkedListPractice {
    public static void main(String[] args) {
        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

    List<String> newList = new LinkedList<String>();
      newList.remove(countries);
        System.out.println(newList);

}

        public static List remove(List<String> list) {
            var iterator = list.iterator();
            while (iterator.hasNext()) {
                String item = iterator.next();
                if (item.startsWith("A")) ;
                iterator.remove();
            }
                System.out.println(list);
            return list;
        }
}
















