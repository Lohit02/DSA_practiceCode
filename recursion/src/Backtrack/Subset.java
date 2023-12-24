package Backtrack;

public class Subset {
    public static void main(String[] args) {
        String str="abc";
        set(str," ",0);
        subseq(str," ",0);
    }
    static void set(String str,String ans, int start)
    {
        //base case
        if(start== str.length())
        {
            System.out.println(ans);
            return;
        }

        //recursion
        set(str,ans+str.charAt(start),start+1);
        set(str,ans,start+1);
    }
    static void subseq( String str, String up,int start)
    {
        //int start= 0;
        if(start==str.length())
        {
            System.out.println(up);
            return;
        }
        subseq(str,up+str.charAt(start),start+1);
        subseq(str,up,start+1);


    }
}
