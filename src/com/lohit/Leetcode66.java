package com.lohit;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode66 {
    public static void main(String[] args) {
        int digits[]= new int[]{9,9,9,9,9};
        System.out.println(Arrays.toString(addone(digits)));
        //addone(digits);

    }
    public static int[] addone(int[] digits)
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
}
