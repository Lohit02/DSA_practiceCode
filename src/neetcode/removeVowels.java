package neetcode;

import java.util.ArrayList;

public class removeVowels {
    public static void main(String[] args) {
        String str="abchdefA";
        String ans= removeV(str);
        System.out.println(ans);
    }
    public static String removeV(String str)
    {
        StringBuilder st= new StringBuilder();
        ArrayList<Character> list= new ArrayList<>();
        list.add('A');
        list.add('E');
        list.add('I');
        list.add('O');
        list.add('U');
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');

        for (int i = 0; i < str.length(); i++) {
            if(!list.contains(str.charAt(i))){
                st.append(str.charAt(i));
            }

        }
        return st.toString();
    }
}
