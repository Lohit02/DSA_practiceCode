public class number_ex {
    public static void main(String[] args) {
        num(5);
        
    }

    private static void num(int n) {
        while(n==0) {
           return;

        }


        System.out.println(n);  num(n-1);

    }
}
