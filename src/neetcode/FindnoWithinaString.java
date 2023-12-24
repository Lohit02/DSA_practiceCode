package neetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class FindnoWithinaString {
    public static void main(String[] args) {
        String str="I love 78,80";
        ArrayList<String>ll= ret(str);
        System.out.println(ll);
    }
    static ArrayList<String> ret(String str)
    {
        ArrayList<String> list= new ArrayList<>();
        str= str.replaceAll("[^\\d+]"," ");
        str=str.trim();
        String []arr=str.split(" ");
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i].length()>0){
                list.add(arr[i]);
            }else{
                list.add("NA");
            }
        }
       return list;

    }
}
