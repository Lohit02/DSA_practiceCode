public class SumoDigits {


    static int SumofDigits(int n)
    {
        int sume=0;
        if(n>0) {
            sume = n % 10 + SumofDigits(n / 10);
        }
        return sume;
    }


}
