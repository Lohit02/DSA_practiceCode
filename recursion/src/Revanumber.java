public class Revanumber {
    public static void main(String[] args) {
        System.out.println(   rev(12345));

    }

    static int rev(int n)
    {
        int sum=0;
        if(n<10)
        {
            return n;
        }
        int rem= n%10;
        sum+=sum*10+ rem +rev(n/10);;

 return sum;
    }
}
