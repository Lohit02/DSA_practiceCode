package com.lohit;

import java.util.Arrays;

public class ArrayRotationOpe {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(rotatae(nums,3)));
    }

    static int [] rotatae(int [] nums, int k)
    {
        int[] arr=new int[nums.length];
        int index=0;
        for (int i = k; i < nums.length; i++) {
            arr[index++]=nums[i];

        }
        for (int i = 0; i < k; i++) {
            arr[index++]=nums[i];
        }
        return arr;
    }

}
