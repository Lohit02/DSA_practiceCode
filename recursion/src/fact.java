public class fact {
    static int fact(int n)
    {
        if(n>2)
        {
            return n*fact(n-1);

        }
        return n;
    }
}
