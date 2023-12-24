package w3Resource;

public class BalanceString {
    public static void main(String[] args) {
        String s="RLRRLLRLRL";
        System.out.println(IsBalaneString(s));

    }
    public static int IsBalaneString(String s)
    {
        int count,total;
        count=total=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='R')
                count++;
            else count--;
            if(count==0)
                total++;

        }
        return total;
    }

}
