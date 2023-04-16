import java.util.Scanner;

public class Main_Rec {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        //String str= sc.nextLine();
       // fact t= new fact();
       // fibo p= new fibo();
       // System.out.println(fibo.fibo(n));
        //System.out.println( t.fact(n));
        //revstr h= new revstr();
    //  revstr.rev(str);
      //  SumofDigits s= new SumofDigits();
        SumoDigits sw= new SumoDigits();
        System.out.println(sw.SumofDigits(n));

    }



}
