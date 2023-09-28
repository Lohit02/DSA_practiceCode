import java.util.PriorityQueue;

public class Heap {
    public static void main(String[] args) {
        int []arr={1,2,3,8,4,6,0,12};
        //System.out.println(Max(arr));
       Queue(arr);



    }
    public static int Max(int[] nums)
    {
        int max=nums[0];
        for (int i :
                nums) {
                max=Math.max(nums[i],max );

        }return max;
    }
    public static void Queue(int [] nums)
    {
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            int p= nums[i];
            pq.add(p);
        }

        System.out.println(pq);
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());
        System.out.println(pq.remove());

    }

}
