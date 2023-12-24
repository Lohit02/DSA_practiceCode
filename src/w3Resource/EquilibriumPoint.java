package w3Resource;

public class EquilibriumPoint {
    public static void main(String[] args) {
        int [] arr=new int[]{5, 3 ,5, 9, 3 ,5 ,5};
        int res=getIndex(arr);
        System.out.println(res);
    }
    public static int getIndex(int[] arr)
    {
      int leftSum=arr[0];
      int rightSum=0;
      int firstindex=1;
      int lastIndex=arr.length-1;
        int n= arr.length;
      while(firstindex!=lastIndex )
      {


          if(leftSum==rightSum)
          {
              if(n!=0)
              {
                  leftSum+=arr[firstindex];

              }else{
                  return firstindex;
              }

          }
          else if (leftSum<rightSum) {
              leftSum+=arr[firstindex++];n--;
          } else if (rightSum<leftSum) {
              rightSum+=arr[lastIndex--];n--;

          }
      }
      return -1;
    }
}
