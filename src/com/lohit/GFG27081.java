package com.lohit;

public class GFG27081 {
    public static void main(String[] args) {
        System.out.println(plaindrome("epajfxzfnvte"));
    }
    static int plaindrome(String s)
    {
        int f=0;
        int l=s.length()-1;


        while(f<l)
        {
            if(s.charAt(f)!=s.charAt(l)){

                return 0;
            }
            else{
                f++;
                l--;
            }
        }
        return 1;

    }
}
