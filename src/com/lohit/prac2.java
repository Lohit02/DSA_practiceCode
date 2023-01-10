package com.lohit;

import java.util.Arrays;

public class prac2 {
    public static void main(String[] args) {
        int n=10;
        int [] arr= new int[4];
        int [] str= new int[4];
        int i=0;
        while(n>0)
        {
           arr[i++]=n%2;
           n=n/2;
        }
       // System.out.println(Arrays.toString(arr));
        int l=0;
        for(i= arr.length-1;i>0;i--)
        {

            str[l++]=arr[i];
        }
        System.out.println(Arrays.toString(str));
        int[]atr= new int[4];
        for( i=0;i<4;i++)
        {
            if(atr[i]==0)
            {
                atr[i]=1;
            } else if (atr[i]==1) {
                atr[i]=0;

            }
        }
        System.out.println(Arrays.toString(atr));double sum=0;
        for(i=0;i<atr.length;i++)
        {
            sum= (sum+atr[i ]*Math.pow(2,i));
        }
        System.out.println(sum);

    }
}
