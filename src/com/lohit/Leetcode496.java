package com.lohit;

import java.util.ArrayList;
import java.util.Arrays;

public class Leetcode496 {
    public static void main(String[] args) {
        int arr1[] = new int[]{4, 1, 2,};
        int arr2[] = new int[]{1, 3, 4, 2};
        System.out.println(Arrays.toString(nextGreaterElement(arr1, arr2)));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        ArrayList<Integer>list =new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            int ele=nums1[i];
            int idx=getIndex(nums2,ele);
            int counter=0;
            for (int j = idx; j < nums2.length; j++) {
                if(nums2[j]>ele)
                {
                    list.add(nums2[j ]);
                    counter=0;
                    break;
                }
                else
                {
                    counter+=1;
                }
            }
            if(counter!=0){
                list.add(-1);
            }


        }
        System.out.println(list);
        int [] arr=new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i]= list.get(i);

        }
        return arr;
    }

    public static int getIndex(int[] nums2, int k) {
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] == k) {
                return i;
            }

        }
        return -1;
    }

}