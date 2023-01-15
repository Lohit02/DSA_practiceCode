package com.lohit;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Leetcodetest1 {
    public static void main(String[] args) {
  int [] nums=new int[]{1,2,3,4,5};
     //  int[] arr=Arryy(nums);
       System.out.println(Arrays.toString(Arryy(nums)));
    }
    public static int[] Arryy(int[] nums)
    {
       int sum=0;
       for (int i = 0; i <nums.length ; i++) {
          sum=sum+ nums[i];
          nums[i]=sum;

        }
        return nums;
    }

}
