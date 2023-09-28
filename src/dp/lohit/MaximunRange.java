package dp.lohit;

import java.util.ArrayList;

public class MaximunRange {
    public static void main(String[] args) {
        System.out.println(Range(new int[]{1,2,13,4,5,6,7,8,9},15));
        ArrayList<Integer> list = RangeList(new int[]{1,2,13,4,5,6,7,8},15);
        System.out.println(list);

    }
    static int Range(int [] arr,int k)
    {
        int L=0;int R=0;int range=0;int maxRange=0;int sum=0;int j=0;
        for(int i=0;i<arr.length;i++)
        {
            if(sum<k)
            {
                sum+=arr[i];
                range= range+1;
            }
            maxRange = range;
            if(sum>k)
            {
                sum-=arr[j++];
                range= range-1;
            }
            maxRange = range;

            if(sum==k)
            {
                sum+=arr[i];
                sum-=arr[j++];
                maxRange=Math.max(range,maxRange);
            }

        }return maxRange;
    }

    static ArrayList<Integer> RangeList(int [] arr, int k)
    {
        int L=0;int R=0;int range=0;int maxRange=0;int sum=0;int j=0;int i;
        for( i=0;i<arr.length;i++)
        {
            if(sum<k)
            {
                sum+=arr[i];
                range= range+1;
            }
            maxRange = range;

            if(sum==k)
            {
                sum+=arr[i++];
                sum-=arr[j++];
                maxRange=Math.max(range,maxRange);
            }

        }
        ArrayList<Integer> arrayList= new ArrayList<>();
        for(int p=i;p<j;p++)
        {
            arrayList.add(arr[p]);
        }
        return arrayList;
    }
}
