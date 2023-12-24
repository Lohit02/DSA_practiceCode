package w3Resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,4,65,7,8,3,4,3,2,1};
        System.out.println(duplicates(arr,arr.length));
    }
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> list= new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.getOrDefault(arr[i],0)+1);
            }else
                map.put(arr[i],1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
           // System.out.println(entry.getKey() + ": " + entry.getValue());
            if(entry.getValue()>1)
            {
                list.add(entry.getKey());
            }
        }
        if(list.size()==0)
        {
            list.add(-1);
        }
        return list;
    }
}
