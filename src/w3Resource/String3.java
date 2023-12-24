package w3Resource;

import java.util.HashSet;
import java.util.Locale;

public class String3 {
    public static void main(String[] args) {
  String st="abcdefgijklmABCDEFGHIJKLM";
        System.out.println(checkPangram(st));
    }
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String str) {
        // your code here
        HashSet<Character> set= new HashSet<>();
        str = str.replaceAll("\\s", "");
        str = str.replaceAll(",", "");
        str=str.toLowerCase(Locale.forLanguageTag(str));
        for(int i=0;i<str.length();i++){
            set.add(str.charAt(i));
        }
        return set.size()==26;
    }
}
