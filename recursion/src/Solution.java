import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();

        }
        int low= sc.nextInt();
        int mid=sc.nextInt();

        System.out.println(count(arr,low,mid));


    }
    public static int count(int [] arr,int low,int mid)
    {
        int count=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=low && arr[i]<=mid)
            {
                count++;
            }

        }

        return count;
    }

}