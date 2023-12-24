package com.lohit;

import java.util.ArrayList;
import java.util.List;

public class Leetcode2856 {
    public static void main(String[] args) {



        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);


       // list.add(6);

        System.out.println(minLengthAfterRemovals(list));
    }
    public static int minLengthAfterRemovals(List<Integer> nums) {
        int index1=0;
        int index2=1;

        if(nums.size()==1)
            return 1;
        if(nums.size()==2){
            if(nums.get(0)<nums.get(1))
            {
                return 0;
            }else return 2;
        }
        while ( !nums.isEmpty() &&nums.size()>1)
        {
           if(nums.get(index1)< nums.get(index2))
           {
               nums.remove(index2);
               nums.remove(index1);

               index1=0;
               index2=1;
           }
           else{
               index2+=1;
           }
        }
        return nums.size();

    }
}
