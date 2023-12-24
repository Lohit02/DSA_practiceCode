package dp.lohit;

public class Leetcode647 {
    public static void main(String[] args) {
        String up="abc";
        String p="";

    }
    public static void Permute(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<p.length();i++)
        {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            Permute(f + ch + s, up.substring(1));
        }

    }
}
