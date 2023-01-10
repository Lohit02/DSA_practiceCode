package neetcode;

import java.util.HashSet;
import java.util.Set;

public class Findduplicate {


        public static boolean duplicate(int[] arr)
        {
            Set<Integer> duplicate= new HashSet<Integer>();
            for( int i=0;i<arr.length;i++)
            {
                if(duplicate.contains(arr[i]))
                {
                    return true;
                }
                duplicate.add(arr[i]);
            }

            return false;
        }

    public static void main(String[] args) {
        int []arr={2,4,3,6,2};
        System.out.println(duplicate(arr));
    }
    }

