package neetcode;

import java.util.Arrays;

public class Replaceright {
    static int[] replace(int[] arr)
    {
        int mic[]=new int[arr.length];
        //int j=1;
        for(int i=0;i<arr.length-1;i++) {

            //int j=1;
            for ( int j = i+1; j < arr.length; j++)
            {
                if (arr[i] > arr[j]) {
                    j++;
                }
                mic[i] = arr[j];
                break;
            }mic[arr.length-1]=-1;


        }

        return mic;
    }

    public static void main(String[] args)
    {
      int []arr={2,4,0,67,1,9};
        System.out.println(Arrays.toString(replace(arr)));
    }
}
