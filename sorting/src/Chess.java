import java.util.*;
public class Chess {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] initial=new int[2];
        System.out.println("Enter the Initial Position");
        for(int i=0;i<initial.length;i++) {
            initial[i] = sc.nextInt();
        }
        sc.nextLine();
        System.out.println("Enter the Steps");
        String s=sc.nextLine();
        int t1=initial[0];
        int t2=initial[1];
        for(int i=0;i<s.length();i+=2)
        {
            if(s.charAt(i)=='u')
                initial[1]=t2+=Character.getNumericValue(s.charAt(i+1));
            else if(s.charAt(i)=='d')
                initial[1]=t2-=Character.getNumericValue(s.charAt(i+1));
            else if(s.charAt(i)=='r')
                initial[0]=t1+=Character.getNumericValue(s.charAt(i+1));
            else if(s.charAt(i)=='l')
                initial[0]=t1-=Character.getNumericValue(s.charAt(i+1));
        }
        for(int i=0;i<initial.length;i++)
            System.out.print(initial[i]+" ");
    }
}
