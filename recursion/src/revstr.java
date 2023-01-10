import java.util.*;
public class revstr {
    static void rev(String str)
    {
        StringBuilder strBld= new StringBuilder();
        strBld.append(str);
        strBld.reverse();
        String st= strBld.toString();
        System.out.println(st);


    }
}
