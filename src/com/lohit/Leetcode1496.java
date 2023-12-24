package com.lohit;

public class Leetcode1496
{
    public static void main(String[] args) {
        String path="NESWW";
        System.out.println(getOrigin(path));
    }
    static boolean getOrigin(String st)
    {
        int counter=0;
        for(int i=0;i<st.length();i++){
            if(st.charAt(i)=='N')
            {
                counter+=1;
            }
            if(st.charAt(i)=='S')
            {
                counter+=2;
            } if(st.charAt(i)=='E')
            {
                counter+=3;
            } if(st.charAt(i)=='W')
            {
                counter+=4;
            }

        }
        return counter>=10;
    }

}
