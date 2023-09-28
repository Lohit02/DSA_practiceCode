package dp.lohit;

public class FactMemo {
    public static void main(String[] args) {
        int n=5;
        System.out.println(factusingMemo(n,new int[n+1]));
    }
    static int factusingMemo(int n, int[] qn)
    {
        if(n<=2)
        {
            return n;
        }
        if(qn[n]!=0)
        {
            return qn[n];
        }


        return n* factusingMemo(n-1,qn);
    }
}
