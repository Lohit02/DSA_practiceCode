package com.lohit;

import java.util.Arrays;

public class IB5 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] dp=Rearrange(arr);
        System.out.println(Arrays.toString(dp));
    }

    static int[] Rearrange(int[] nums) {
        int [] ans= new int[nums.length];
        int start=0;
        int last=nums.length-1;
        int i=0;
        while(start<=last)
        {
            if (i % 2 != 0) {
                ans[i]=nums[start];
                start++;
            }else {
                ans[i]=nums[last];
                last--;
            }
              i++;

        }
        return ans;
    }
}
