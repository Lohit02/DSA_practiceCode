package com.lohit;

public class Leetcode55ext {


    public static boolean canJump(int[] nums) {
        if(nums.length <= 1){
            return true;
        }
        int step_left= nums[0];
        int index=1;
        while(step_left>0)
        {
            if(index==nums.length-1)
            {
                return true;
            }
            step_left= Math.max(step_left-1,nums[index]);
            index++;
        }
        return false;

    }


    }

