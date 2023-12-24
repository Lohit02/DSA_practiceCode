import java.util.ArrayList;
import java.util.Collections;

public class Collection_sorts {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(34);
        list.add(67);
        list.add(90);
        list.add(23);
        Collections.reverseOrder();
        System.out.println(list);
    }
}
