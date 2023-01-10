package neetcode;

public class Lengthoflastword {
    static int length(String str)
    {
        int length=0;
        for(int i =str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)==' ')
            {
                break;

            }
            else length++;
        }
        return length;
    }

    public static void main(String[] args) {
        String tr= "i am a good boplky";
        int l=length(tr);
        System.out.println(l);
    }
}
