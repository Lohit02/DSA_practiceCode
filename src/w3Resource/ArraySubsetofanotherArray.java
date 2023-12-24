package w3Resource;

import java.util.ArrayList;

public class ArraySubsetofanotherArray {
    public static void main(String[] args) {
     long[]a1 =new long[]{11, 7, 1, 13, 21, 3, 7, 3};
     long [] a2= new long[]{11, 3, 7, 1};
        System.out.println(isSubset(a1,a2));

    }
    public static String isSubset(long[] a1,long [] a2)
    {
        /*HashSet<Long> set=new HashSet<>();
        for (long l :
                a1) {
                set.add(l);

        }
        int count=0;
        for (long l2 :
                a2) {
            if (set.contains(l2)){
                count+=0;
                set.remove(l2);
        }else{
                count+=1;
            }

    }
        return count==0?"Yes":"No";

         */
        ArrayList<Long> list= new ArrayList<>();
        for (long i :
                a1) {
            list.add(i);
        }
        String ans="Yes";
        for (int i = 0; i < a2.length; i++) {
            {
                if(list.contains(a2[i])){
                    list.remove(a2[i]);
                }
                else {
                    ans = "No";
                    break;
                }
            }

        }
        return ans;
    }
}
