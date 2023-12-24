package w3Resource;

public class Array2 {
    public static void main(String[] args) {
        System.out.println(findIndex(new int[]{11,2,3,4,5,6,7,8,9},0));
    }
    public static int findIndex(int [] nums,int k)
    {
        if(nums.length==0)
        {
            return 0;
        }int ans=-1;
        for (int i = 0; i <nums.length; i++) {
                if(nums[i]==k){
                    ans=i;
                }

        }return ans;

    }
}
