package w3Resource;

import java.util.ArrayList;

public class Subarray_givenSum {
    public static void main(String[] args) {
        int [] arr=new int[]{1,2,3,0,5};
        int n=arr.length;
        int s=12;
        ArrayList<Integer> ans= subarraySum(arr,n,s);
        System.out.println(ans);

    }
    public static ArrayList<Integer> subarraySum(int[]arr,int n,int s)
    {
        ArrayList<Integer> list=new ArrayList<>();
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            int firstIndex=0;
            if(sum==s)
            {
                ArrayList<Integer> annwer=new ArrayList<>();
                annwer.add(list.get(0)+1);
                annwer.add(list.get(list.size()-1)+1);
                return annwer;
            }
            else if(sum<s)
            {
                sum+=arr[i];
                list.add(i);
            }
            if(sum>s)
            {
                sum-=arr[firstIndex];
                list.remove(firstIndex);
                firstIndex++;

            }

        }list.clear();
        list.add(-1);
        return list;


    }
}
