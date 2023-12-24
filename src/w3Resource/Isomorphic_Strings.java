package w3Resource;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Isomorphic_Strings {
    public static void main(String[] args) {

    }
    public static boolean isIsomorphic(String X, String Y){
        if(X==null || Y==null){
            return false;
        }
        if (X.length() != Y.length()) {
            return false;
        }
        Map<Character,Character> map= new HashMap<>();
        Set<Character> set=new HashSet<>();


        for (int i = 0; i < X.length(); i++) {
            char x=X.charAt(i);
            char y=Y.charAt(i);
            //if map contains then verify that is one to one mapping happen else return  false;
            if(map.containsKey(x))
            {
                if(map.get(x)!=y)
                {
                    return false;
                }
            }
            else {

                if(set.contains(y)){
                    return false;
                }

            }
            map.put(x,y);
            set.add(y);
        }
        return true;



    }
}
