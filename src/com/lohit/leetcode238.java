package com.lohit;

import java.util.Arrays;

public class leetcode238 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[]{1,2,3,4})));
    }
    public static int[] productExceptSelf(int[] nums) {
        int [] arr=new int[nums.length];
        int prod=1;
        int multiply=1;
        int zeroCount=0;
        int p=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0)
            {
               zeroCount++;
               p=i;
            }else
            {
                multiply*=nums[i];
            }

        }

        if(zeroCount==0)
        {
            for (int i = 0; i < nums.length; i++) {
               arr[i]=multiply/nums[i];
            }
        } else if (zeroCount==1)
        {
            arr[p]=multiply;

        } else
            return new int[nums.length];


        return arr;
    }
}
