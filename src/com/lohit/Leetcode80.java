package com.lohit;

import java.util.ArrayList;

public class Leetcode80 {
    public static void main(String[] args) {
      //  System.out.println(ret(new int[]{0,0,1,1,1,1,2,3,3}));
       // System.out.println(twodupvalue(new int[]{0,0,1,1,1,1,2,3,3}));

        ArrayList<Integer> list = new ArrayList<>();
        list= twodupvaluelist(new int[]{0,0,1,1,1,1,2,3,3});
        System.out.println(list);
    }
    static int twodupvalue(int []arr)
    {
        int count=0;
        ArrayList<Integer> arraylist= new ArrayList<>();
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                arraylist.add(arr[i]);
            }
            if(arr[i]==arr[i+1] && count<2)
            {
                arraylist.add(arr[i]);
                count+=1;
            }else
                count=0;
        }

        return arraylist.size();
    }


    static ArrayList<Integer> twodupvaluelist(int []arr)
    {
        int count=0;
        ArrayList<Integer> arraylist= new ArrayList<>();
        for(int i=0;i<arr.length-1;i++)
        {

            if(arr[i]==arr[i+1] )
            {

                count+=1;
            }else
                count=0;

            if(count<=1)
            {
                arraylist.add(arr[i]);
            }
        }
        arraylist.add(arr[arr.length-1] );

        return arraylist;
    }

    public static int ret(int [] arr)
    {
        int count=0;

        int j=1;
        for (int i=1;i<arr.length;i++) {

            if (arr[i] == arr[i - 1])
            {
                count++;
            }
            else
                count=0;

            if(count<=1)
            {
                arr[j]=arr[i];
                j++;
            }
        }
        return j;
    }

}
