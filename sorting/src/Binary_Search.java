public class Binary_Search {
    public static void main(String[] args) {
        System.out.println(Binary(new int[]{1,4,3,6,7,8,98,45},98));

    }
    public static int Binary(int[] arr, int x)
    {
        int p=0;
        int r= arr.length-1;
         while(p<=r)
         {
             int q= (p+r)/2;

               if (x<arr[q])
                  r=q-1;
              else if (x>arr[q])
                  p=q+1;
              else return q;

         }return -1;

    }
}
