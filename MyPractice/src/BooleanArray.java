import java.util.ArrayList;
import java.util.List;

public class BooleanArray {
    public static void main(String[] args) {

        List<Boolean> listA = new ArrayList<>();
        listA.add(true);
        listA.add(false);
        listA.add(false);

        ArrayList<Boolean> listB = new ArrayList<>();
        listB.addAll(listA);

        var iterator = listB.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next()+" ");
        }
    }
}



