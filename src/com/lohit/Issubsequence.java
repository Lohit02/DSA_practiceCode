package com.lohit;

public class Issubsequence {
    public static void main(String[] args) {
        String t="lohit";
        String s= "hi";
        System.out.println( subsequence( s, t));

    }
    public static boolean subsequence(String s, String t){
        int n= s.length();//lohit
        int m= t.length();//hi
        int j=0;
        for(int i=0;i<m && j<n;i++)
        {
            if(s.charAt(j)==t.charAt(i))
            {
                j++;
            }

        }
       // return false;
        return j==n;

    }
}
