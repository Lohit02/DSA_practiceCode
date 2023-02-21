package com.lohit;

import java.util.Arrays;
import java.util.EnumSet;

public class Leetcode2460 {
    public static void main(String[] args) {
        int [] nums =new int[]{1,2,2,1,1,0};
        System.out.println(Arrays.toString( applyOperations(nums)));
    }
    public static int[] applyOperations(int[] nums) {
        int i=0;
        int n= nums.length-1;
        while(i<n)
        {
            if(nums[i]!=nums[i+1])
            {
                nums[i]=nums[i];
                i++;
            }
            else{
                nums[i]=2*nums[i];
                nums[i+1]=0;
                 i++;}



        }
        return nums;
    }
}
