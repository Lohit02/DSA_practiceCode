package com.lohit;

public class Leetcode121 {
    public static void main(String[] args) {
        int []price= new int[]{7,1,5,3,6,4};
        System.out.println(max(price));

    }
    public static int max(int [] price)
    {
        int lsf= Integer.MAX_VALUE;
        int current=0; int max=0;
        for (int i = 0; i < price.length; i++) {
            if(lsf>price[i])
            {
                lsf=price[i];
            }
            current=price[i]- lsf;
            if(max<current)
            {
                max=current;
            }

        }
        return max;
    }
}
