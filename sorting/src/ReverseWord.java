import java.util.Arrays;

public class ReverseWord {
    public static void main(String[] args) {
    String str= "Good Morning";
        System.out.println(Arrays.toString(reserse(str)));
    }
    static String[] reserse(String str)
    {
        str=str.trim();
        String [] arr=str.split(" ");
        System.out.println(Arrays.toString(arr));
      //  String [] arr1=new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=revfunction(arr[i]);

        }
        //System.out.println(arr[1]);
        return arr;
    }
    static String revfunction(String st)
    {
        char[] ch=st.toCharArray();
        String p="";
        for (int i = st.length()-1; i >=0 ; i--) {
            p=p+ch[i];

        }return p;

    }
}
