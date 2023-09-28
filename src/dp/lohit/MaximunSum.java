package dp.lohit;

public class MaximunSum {
    public static void main(String[] args) {
        System.out.println(MaximunSum(new int[]{1,2,3,4},2));
    }
    static int MaximunSum(int arr[], int k)
    {
        int sum=0;
        int maxSum=0;
        int windowSiZe=0;
        int i=0;
        for(int j=0;j<arr.length;j++)
        {
            if(windowSiZe < k)
            {
                sum+=arr[j++];
                windowSiZe++;
            }
            maxSum=sum;
             if (windowSiZe==k) {

                sum+=arr[j++];
                sum-=arr[i++];
                 maxSum=Math.max(sum,maxSum);


            }
        }return maxSum;
    }
}
