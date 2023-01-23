package com.lohit;

public class Leetcode724 {
    public static void main(String[] args) {
        int[] nums= new int[]{1,2,3};
        System.out.println(pivotIndex(nums));

    }
    public static int pivotIndex(int[] nums) {

     int totalsum=0;
     int leftsum=0;
        for (int i = 0; i < nums.length; i++) {

            totalsum+=nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int pivot=i;
            if(leftsum==totalsum-nums[i])
            {
                return pivot;
            }else
                leftsum+=nums[i];
                totalsum-=nums[i];
        }
        return -1;
    }

}
