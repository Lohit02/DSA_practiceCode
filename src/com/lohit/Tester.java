package com.lohit;

//import java.util.Arrays;
//
//public class multiply {
//    public static void main(String[] args) {
//        System.out.println(Arrays.toString(mul(new int[]{1,2,3,4})));
//    }
//
//    static int[] mul(int[] arr)
//    {
//        int prod=1;
//        int [] nums=new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            prod*=arr[i];
//
//            nums[i]=prod/arr[i];
//
//        }
//        return nums;
//    }
//}



public class Tester{
    public static void main(String args[]){
        int size=52;
        while(size>0){
            int rando=(int)Math.random()*(size+1);
            size--;
            System.out.println(rando);
        }
    }
}
