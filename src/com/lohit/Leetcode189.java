package com.lohit;

import java.util.Arrays;

public class Leetcode189 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9};
        int k=2;
        System.out.println(Arrays.toString(rotatearray(arr,k)));
    }
    public static int[] rotatearray(int [] arr,int k)
    {
     for(int i=0;i<k;i++)
     {
         int p=arr[arr.length-1];

         for(int j = arr.length-1; j >0; j--){
             //Shift element of array by one
             arr[j] = arr[j-1];
         }
         arr[0]=p;
     }return arr;
    }
}
