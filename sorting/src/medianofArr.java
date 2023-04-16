import java.util.Arrays;

public class medianofArr {
    public static void main(String[] args) {
        int [] nums1= new int[]{1,3};
        int nums2[]=new int[]{2,7};
        double ans=findMedianSortedArrays(nums1, nums2);
        System.out.println(findMedianSortedArrays(nums1,nums2));
    } public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] mix= new int[nums1.length+nums2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<nums1.length&& j<nums2.length)
        {
            if(nums1[i]<nums2[j])
            {
                mix[k]=nums1[i];
                k++;
                i++;
            }
            else
            {
                mix[k++]=nums2[j++];
            }
        }
        while(i<nums1.length)
        {
            mix[k++]=nums1[i++];
        }
        while(j<nums2.length)
        {
            mix[k++]=nums2[j++];
        }
        int pivot=(nums1.length+nums2.length)/2;
       // return pivot;
         if(pivot%2!=0)
        {
            return mix[pivot];
        }else if(pivot%2==0) {
             return (mix[pivot] + mix[pivot - 1]) / 2;
         }
        return -1;
    }
}
