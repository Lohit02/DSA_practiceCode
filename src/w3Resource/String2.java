package w3Resource;

import java.util.ArrayList;
import java.util.Arrays;

public class String2 {
    public static void main(String[] args) {
        ArrayList<String> s=new ArrayList<>();
        s.add("geeks");
        s.add("for");
        s.add("geeks");
        s.add("practices");
        s.add("contribute");
        System.out.println(shortestDistance(s,"geeks","contribute"));
    }

    static  int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
        int [] arr1= new int[s.size()];
        int [] arr2=new int[s.size()];

        for (int i = 0; i < s.size(); i++) {
            if(s.get(i) ==word1){
                arr1[i]=i;
            }
        }

        for (int i = 0; i < s.size(); i++) {
            if(s.get(i) ==word2){
                arr2[i]=i;
            }
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return arr1[arr1.length-1]-arr2[0];

    }
}
