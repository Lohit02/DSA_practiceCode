package neetcode;
import java.util.*;

public class Findduplicate {


//        public static int duplicate(int[] arr)
//        {
//            Set<Integer> duplicate= new HashSet<Integer>();
//            for( int i=0;i<arr.length;i++)
//            {
//                if(duplicate.contains(arr[i]))
//                {
//                    return arr[i];
//                }
//                duplicate.add(arr[i]);
//            }
//
//            return -1;
//        }






    private static List<Integer> dup(int []nums) {
        int n = nums.length;
        int[] cs = new int[n+1];
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < n; i++){
            cs[nums[i]] += 1;
        }
        for(int i = 0; i < cs.length; i++){
            if(cs[i] == 2){
                al.add(i);
            }
        }
        return al;
    }
    public static void main(String[] args) {
        int []nums={2,4,3,6,2,2};
        List<Integer> ans = dup(nums);
        //
        // System.out.println(Arrays.deepToString(dup([]nums)));
        // display(al);
    }
}

