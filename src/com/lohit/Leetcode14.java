package com.lohit;

public class Leetcode14 {
    public static void main(String[] args) {
         String[] strs = new String[]{"flower","flow","flight"};
        System.out.println(longstComonprefix(strs));

    }
    public static String longstComonprefix(String[] strs)
    {
        String res= strs[0];
        for (int i = 0; i < strs.length; i++) {
            res=findCommon(res,strs[i]);
            
        }
        return res;

    }
    public static String findCommon(String s1, String d2)
    {
        int n= Math.min(s1.length(),d2.length());
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < n; i++) {
            if(s1.charAt(i)==d2.charAt(i))
            {
                sb.append(s1.charAt(i));
            }
            else 
                break;

        } return sb.toString();
    }
}
