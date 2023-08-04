
package neetcode;
import java.util.TreeSet;

public class test {
    public static void main(String[] args)
    {
        // creating TreeSet
        TreeSet<Integer> ts = new TreeSet<Integer>();

        // adding element to the TreeSet
        ts.add(0);
        ts.add(1);
        ts.add(2);
        ts.add(3);
        ts.add(4);
        ts.add(5);
        ts.add(6);

        // before removing element
        System.out.println("Before removing " +
                "element from TreeSet: " + ts);
        int t=ts.pollLast();
        System.out.println(ts.lower(t));
        // first element is removed
      //  System.out.println("First lowest element " +
           //     "removed is : " + ts.pollFirst());
     //   System.out.println("After removing element" +
              //  " from TreeSet: " + ts);
    }
}