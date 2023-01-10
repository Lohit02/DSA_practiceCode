package neetcode;

import java.util.Arrays;

public class Subsequence {
    static boolean sequence(String str ,String st)
    {
        if(str.contains(st) || st.contains(str))
            return true;
        return false;
    }

    public static void main(String[] args) {
        String str="lohiy";
        String st="hoy";
        System.out.println(sequence(str,st));
    }
}
