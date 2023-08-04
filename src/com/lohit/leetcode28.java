package com.lohit;

import java.util.Stack;

public class leetcode28 {
    public static void main(String[] args) {
        System.out.println(strStr("lohit","hit"));
    }

    public static int strStr(String haystack, String needle)
    {
        int hLen=haystack.length();
        int nLen=needle.length();
        int nIndex=0;

        for (int i = 0; i < hLen; i++) {
            if(haystack.charAt(i)==needle.charAt(nIndex))
            {
                nIndex++;
            }
            else
            {
                i=i-nIndex;
            }

            if(nIndex==nLen)
            {
                return i-nLen+1;
            }

        }
        return -1;
    }
}
