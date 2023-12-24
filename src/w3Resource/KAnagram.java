package w3Resource;
import java.util.*;
public class KAnagram {


    public static void main(String[] args) {
        String s1="qdqnmjujbvd";
        String s2="zdybxcalzux";
        int k=6;

        System.out.println(areKAnagrams(s1,s2,k));


    }
    static  boolean areKAnagrams(String s1, String s2, int k) {
        // code here
        if(s1.length()!=s2.length()){
            return false;
        }
        if(s1.length()==k){
            return true;
        }
        int count=0;
        Set<Character> set1=new HashSet<>();
        Set<Character> set2=new HashSet<>();
        for(int i=0;i<s1.length();i++){
            set1.add(s1.charAt(i));
            set2.add(s2.charAt(i));
        }


        set2.removeAll(set1);

        return k>=set2.size();
    }
}
