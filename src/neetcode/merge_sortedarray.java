package neetcode;

import java.util.Arrays;

import static java.lang.Math.max;

public class merge_sortedarray {
    public static void main(String[] args) {
       int[]arr1= new int[]{1,2,9,10};
       int []arr2= new int[]{3,4,5,7};
        int[] mix= new int[arr1.length+ arr2.length];
       sortedarray(arr1,arr2,mix);

        for(int l=0;l<arr1.length+arr2.length;l++)
        {
            System.out.println(mix[l]+" ");
        }

    }
    public static void  sortedarray(int[]arr1, int[]arr2,int []mix){
        int n= max(arr1.length,arr2.length);

        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length && j< arr2.length)
        {
            if(arr1[i]<arr2[j])
            {
                mix[k++]=arr1[i++];
            }
            else
                mix[k++]=arr2[j++];

        }
        while(i<arr1.length)
        {
            mix[k++]=arr1[i++];
        }
        while(j<arr2.length)
        {
            mix[k++]=arr2[j++];
        }


    }
}
