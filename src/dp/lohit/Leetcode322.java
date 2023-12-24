package dp.lohit;

import java.util.Arrays;

public class Leetcode322 {
    public static int coinChange(int[] coins, int amount) {
        int count=0;
        Arrays.sort(coins);
        while(amount>=coins[coins.length-1])
        {
            amount-=coins[coins.length-1];
            count+=1;
        }
        int n=2;
        while(amount>0 &&coins.length>=n)
        {
            if(amount-coins[coins.length-n]>=0) {
                amount -= coins[coins.length - n];
                count++;
            }
            n++;
        }
        while(amount>=coins[0])
        {
            amount-=coins[0];
            count+=1;
        }


        if(amount==0)
            return count;
        else
            return -1;
    }

    public static void main(String[] args) {
        int[] arr={186,419,83,408};
        int amount=6249;
        System.out.println(coinChange(arr,amount));
    }
}
