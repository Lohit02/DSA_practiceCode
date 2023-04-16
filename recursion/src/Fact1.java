public class Fact1 {
    public static void main(String[] args) {
        System.out.println(Fact1(5));
    }


    public static int Fact1(int n) {
        if(n<2)
        {
            return n;
        }
        return n*Fact1(n-1);
    }

}
