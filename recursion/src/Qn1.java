import java.util.Arrays;



public class Qn1 {
    public static void main(String[] args) {
       // Qn1(5);
        // System.out.println(fact(5));
       // Qn2(5);
      //  System.out.println(  RevDigits(6903));
        //System.out.println(LinearSearch(new int[]{1,2,3,4,5},0,1));
      //triangle(4,4);
        // bubbleSort(new int[]{3,5,1,8,4,7},0,5);
        System.out.println( Arrays.toString(mergeSort(new int[]{3,5,1,8,4,7})));
    }
    public static int  Qn1(int n)
    {
        if(n!=1)
        {

            Qn1(n-1);

        }
        System.out.println(n);
       return 1;

    }
    public static int  Qn2(int n)
    {
        if(n==0)
        {
            return 10;
        }
        System.out.println(n);
        return Qn2(n-1);

    }
    public static int fact(int n)
    {
        if(n>=1)
        {
           return n*fact(n-1);
        }
        return 1;
    }

    public static int sum(int n)
    {
        if(n>=1)
        {
            return n+sum(n-1);
        }
        return 0;
    }

    public static int  Digitofsum(int n)
    {
        if(n==0)
        {
            return 0;
        }

        return n%10+Digitofsum(n/10);

    }

    public static int  RevDigits(int n)
    {
        if(n==0)
        {
            return 0;
        }
        System.out.println(n);
       return  RevDigits(--n);

    }
    public static boolean arraySorted(int arr[])
    {
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<arr[i+1])
                return true;
            return false;
            
        }return false;
    }

    public static boolean ArraySortedRec(int arr[],int index)
    {

        if(index==arr.length-1)
        {
            return true;
        }

        return arr[index]<arr[index+1] && ArraySortedRec(arr,index+1);
    }

    public static boolean LinearSearch(int arr[],int index,int value)
    {

        if(index==arr.length)
        {
            return false;
        }

        return arr[index]==value || LinearSearch(arr,index+1,value);
    }
    //inverted triangle
    public static void printStar(int r, int c)
    {
        int p=r;
        if(r==0)
        {

           return;
        }
        while(p-->0)
        {
            System.out.print("*");

        }
        System.out.println();


        printStar(r-1,c-1);
    }
    //triagle
    public static void triangle(int r, int c)
    {
        int p=r;
        if(r==0)
        {
            return;
        }
        else
        {
            triangle(r-1,c-1);
            while(p-->0)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    public static void bubbleSort(int arr[], int startIndex, int lastIndex)
    {
        if(startIndex==lastIndex)
        {
            System.out.println(Arrays.toString(arr));
            return;
        }
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1])
            {
                int temp= arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }

        }
        bubbleSort(arr,startIndex+1,lastIndex);

    }
    //mergeSort
    public static int[] mergeSort(int []arr)
    {
        if(arr.length==1)
        {
            return arr;
        }
        int mid=arr.length/2;

        int [] left= mergeSort(Arrays.copyOfRange(arr,0,mid));
        int [] right= mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    private static int[] merge(int [] first, int [] last) {
        int i=0;
        int j=0;
        int k=0;
        int [] mix=new int[first.length+ last.length];
        while(i< first.length && j< last.length)
        {
            if(first[i]<last[j])
            {
                mix[k]=first[i++];
            }else
            {
                mix[k]=last[j++];
            }k++;
        }
        while(i< first.length)
        {
            mix[k]=first[i++];
            k++;
        }
        while(j< last.length)
        {
            mix[k++]=last[j++];
        }
        return mix;
    }
}
