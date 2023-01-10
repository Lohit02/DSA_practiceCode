package com.lohit;

import java.util.Arrays;
import java.util.Scanner;

public class prac1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n= sc.nextInt();
        int []arr = new int[n];
        for(int i=0;i< arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int []arrcopy= new int[arr.length];int k=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                arrcopy[k++]= arr[i];


            }
        }
        System.out.println(Arrays.toString(arrcopy));

    }
}
