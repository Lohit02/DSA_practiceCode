import java.util.ArrayList;
import java.util.LinkedList;

public class Application {
    public static void main(String[] args) {
        ArrayList<String> words= new ArrayList<String>();
        words.add("hello");
        words.add("there");
        words.add("is");
        words.add("Lohit");
        Object item1= (String) words.get(2);
        Object  item2=(String) words.get(3);
        System.out.println(item1+" "+item2);
        //System.out.println(item2);
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(9)
                ;
        numbers.add(23)
                ;
        numbers.add(32)
                ;
        numbers.add(1,89);
        ;
        System.out.println(numbers.addAll(0,numbers));

    }
}
