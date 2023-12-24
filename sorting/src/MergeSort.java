import java.util.Arrays;

        public class MergeSort {
            public static void main(String[] args) {
                System.out.println(Arrays.toString(mergesort(new int[]{6,4,8,0,2,0,4})));

            }
             static int[] mergesort(int[] arr)
             {
                 if(arr.length==1)
                 {
                     return arr;
                 }
                 int mid=arr.length/2;
                 int[] left= Arrays.copyOfRange(arr,0,mid);
                 int [] right= Arrays.copyOfRange(arr,mid,arr.length-1);
                  return merge(left,right);

             }

            private static int[] merge(int[] left, int[] right) {
                int i=0;
                int j=0;
                int k=0;
                int[] mix= new int[left.length+ right.length];
                while(i< left.length&& j< right.length)
                {
                    if(left[i]<right[j])
                    {
                        mix[k++]= left[i++];
                    }
                    else
                    {
                        mix[k++]= right[j++];
                    }
                }
                while(i<left.length)
                {
                    mix[k++]=left[i++];
                }
                while(j< right.length)
                {
                    mix[k++]=right[j++];
                }
                return mix;
            }
        }