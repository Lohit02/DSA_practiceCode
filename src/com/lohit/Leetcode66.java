package com.lohit;

import java.util.Arrays;

public class Leetcode66 {
    public static void main(String[] args) {
        int digits[]= new int[]{6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
        System.out.println(Arrays.toString(plusOne(digits)));
        //addone(digits);

    }
  /*  public static int[] addone(int[] digits)
    {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9)
            {
                digits[i]+=1;
                return digits;
            } digits[i]=0;

        }
        int [] array= new int[digits.length+1];
        array[0]=1;
        return array;





    }

   */

    public static long[] plusOne(int[] digits) {
        long num=0;
        for(int i=0; i<digits.length;i++)
        {
            num=num*10+digits[i];
        }
        num=num+1;
        String temp = Integer.toString((int)num);
        long [] numbers = new long[temp.length()];
        for(int i=temp.length()-1;i>=0;i--)
        {
            numbers[i]=(num%10);
            num/=10;
        }
        return numbers;
    }
}
