package neetcode;

import java.util.Arrays;

public class Validanagrams {
    static boolean Ana(String str ,String str1)
    {
        char[] arr= str.toCharArray();
        char[] arr1=str1.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        if(arr.equals(arr1))
        {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
       // String str="lohit";
      //  String str1= "kohit";
        System.out.println(Ana("lohit","kohit"));

    }
}
