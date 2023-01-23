package com.lohit;

public class Leetcode2535 {
    public static void main(String[] args) {
        int[] nums=new int[]{1,15,6,3};
        System.out.println(Difference(nums));
    }

    public static int Difference(int[] nums)
    {
        int total=0;
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>9)
            {
                int n;
                n=nums[i]%10;
                total+=n;
                nums[i]=nums[i]/10;
                if(nums[i]<5)
                {
                    total+=nums[i];
                }

            }
            else
            {
                total+=nums[i];
            }

        }
        return Math.abs(total-sum);
    }
}
