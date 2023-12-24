package w3Resource;

import java.util.ArrayList;

public class LeadersInaArray {
    public static void main(String[] args) {
        int[] arr=new int[]{16,17,4,3,5,2};
        System.out.println(Leaders(arr));

    }
    public static ArrayList<Integer> Leaders(int [] arr)
    {
        ArrayList<Integer> list= new ArrayList<>();
        for (int i = 0; i < arr.length-1; i++) {
            boolean flag=false;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]<arr[j])
                {
                   flag=false;
                    break;
                }else {
                    flag=true;
                }
            }
            if(flag==true)
            {
                list.add(arr[i]);
            }

        }list.add(arr[arr.length-1]);
        return list;
    }
}
