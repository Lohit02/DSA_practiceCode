public class tcs1 {
    static void swap(int a,int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
    }

    // Complete the countSwaps function below.
    static int countSwaps(int[] a) {
        int n=a.length;
        int cSwap=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(a[j]>a[j+1]){
                    swap(a[j],a[j+1]);
                    cSwap++;
                }
            }

        }

//        System.out.println("Array is sorted in "+cSwap+" swaps.");
//        System.out.println("First Element: "+a[0]);
//        System.out.println("Last Element: "+a[n-1]);

        int lSwap=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-1;j++){
                if(a[j]<a[j+1]){
                    swap(a[j],a[j+1]);
                    lSwap++;
                }
            }

        }
//        System.out.println("sorted in des order");
//        System.out.println(lSwap);

        return Math.min(cSwap,lSwap);



    }

    public static void main(String[] args) {
        int []arr=new int[3];
        arr= new int[]{1,4,2};
        System.out.println(countSwaps(arr));

    }
}
