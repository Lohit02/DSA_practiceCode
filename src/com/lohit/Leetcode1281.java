package com.lohit;

public class Leetcode1281 {
    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
    }
    public static int subtractProductAndSum(int n) {
        int prod=1;
        int sum=0;
        if(n<9)
            return 0;
        else{
            while(n>0)
            {
                sum+=n%10;
                prod*=n%10;
                n=n/10;
            }
        }

        return prod-sum;
    }
}
