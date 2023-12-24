package w3Resource;

import java.util.PriorityQueue;

public class array3 {
    public static void main(String[]args){
        int[] arr= new int[]{1,2,3,4,5,6};

        //System.out.println(Arrays.toString(replaceArray(arr,5)));
        //System.out.println(Arrays.toString(removeIndex(arr,2)));
        //System.out.println(Arrays.toString(insertSpecific(arr,0,77)));
        System.out.println(Kth_Largest(arr,2));
    }
    public static int[] replaceArray(int[] arr,int k)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==k){
                arr[i]=0;
            }
        }
        return arr;
    }
    public static int[] removeIndex(int []arr, int Index)
    {
        for(int i= Index;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        return arr;
    }
    public static int[] insertSpecific(int[]arr,int Index,int Value)
    {
        int nums[]=new int[arr.length+1];
        for (int i = 0; i < Index; i++) {
            nums[i]=arr[i];
        }
        nums[Index]=Value;

        for (int i = Index+1; i < arr.length+1; i++) {
            nums[i]=arr[Index++];
        }
        return nums;
    }
    public static int Kth_Largest(int [] arr,int K)
    {
        PriorityQueue<Integer>pq= new PriorityQueue<>();
        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
        }
        while(K!=1)
        {
            pq.poll();
            K--;
        }
        int ans=pq.poll();
        return ans;

    }







}
