package com.lohit;
import java.util.Stack;

public class Leetcode20 {
    public static void main(String[] args) {
       String s="[)";
       boolean b= isValid( s);
        System.out.println(b);

    }

    public static boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();
        String str= new String(s);
        for(int i=0;i<s.length();i++)
        {
            stack.push(s.charAt(i));
        }

        for(int i=s.length()-1;i>=0;i--)
        {
            if(stack.pop().equals(str.charAt(i)));
                return true;
        }

        return false;

    }
}
