package com.lohit;

import java.util.Arrays;

public class Leetcode1299 {
    public static void main(String[] args) {
        int arr[]=new int[]{17,18,5,4,6,1};
        System.out.println(Arrays.toString(SolnArray(arr)));
      //  System.out.println(giveGreatest(arr,7));
    }
    static int[] SolnArray(int[] arr)
    {
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=giveGreatest(arr,i);
        }
        arr[arr.length-1]=-1;

        return arr;
    }
    static int giveGreatest(int []arr,int k)
    {
        int max=-1;
        for (int i = k; i < arr.length; i++) {
            max=Math.max(max,arr[i]);
        }
        return max;
    }
}
