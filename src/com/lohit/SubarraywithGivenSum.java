package com.lohit;

public class SubarraywithGivenSum {
    public static void main(String[] args) {
        int [] arr=new int[]{1,2,3,4,5,6,7,8,9};
        System.out.println(Sum(arr,100));

    }
    static boolean Sum(int arr[],int target){
        int sum=0;
        int [] res=new int[2];

        for (int i = 0; i < arr.length; i++) {
            if(sum==target)
            {
                return true;


            }
            if(sum<target){
                sum+=arr[i];
                

            } else if (sum>target) {
                sum-=arr[i];

            }

        }return false;
    }
}
