package w3Resource;

public class rotationOfString {
    public static void main(String[] args) {
        String str1="geeksforgeeks";
        String str2="forgeeksgeeks";
        System.out.println(isRotated(str1,str2));
    }
    public static boolean isRotated(String str1, String str2)
    {
       /*
        if(str1.length()!=str2.length())
        {
            return 0;
        }
        if(str1==str2)
        {
            return 1;
        }

        StringBuilder sb=new StringBuilder(str1);

        int ans=0;
        for (int i = 0; i < str1.length(); i++) {
            char ch=sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(ch);
           // String line= makerotatae(str1,i);
            String line=sb.toString();
            if(line.equals(str2)){
                ans=1;
                break;
            }
        }


        return ans;

        */
        str1+=str1;
        return str1.indexOf(str2)!=-1;
    }

   /* static String makerotatae(String str1, int k)
    {
        StringBuilder st=new StringBuilder();
        for (int i = k; i < str1.length(); i++) {
            st.append(str1.charAt(i));

        }
        for (int i = 0; i < k; i++) {
            st.append(str1.charAt(i));

        }
        return st.toString();
    }

    */
}
