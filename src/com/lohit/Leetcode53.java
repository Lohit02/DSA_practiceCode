package com.lohit;

public class Leetcode53 {
    public static void main(String[] args) {
        System.out.println(MaximunSubarray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
    }

    public static int MaximunSubarray(int []nums)
    {
        int currentSum=0;
        int maxSum=0;
        for (int i = 0; i < nums.length; i++) {
            currentSum+=nums[i];

            if(currentSum>maxSum)
            {
                maxSum=currentSum;
            }
            if(currentSum<0)
            {
                currentSum=0;
            }

        }
        return maxSum;
    }
}
