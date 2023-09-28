package dp.lohit;

public class FiboMemo {
    public static void main(String[] args) {
        int n=10;
        System.out.println(fibonacciusingMemo(n,new int[n+1]));
    }

    public static int fibonacciusingMemo(int n,int [] qn)
    {
        if(n==0  || n==1)
        {
            return n;

        }
        if (qn[n] != 0) {

            return qn[n];
        }

        return fibonacciusingMemo(n-1,qn)+fibonacciusingMemo(n-2,qn);
    }
}
