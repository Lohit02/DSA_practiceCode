package com.lohit;

public class IBM6 {
    public static void main(String[] args) {
    String str="Language";
        System.out.println(alterStringreplaceVowel(str));

    }

    static String alterStringreplaceVowel(String str) {
        String ans="";
        for (int i = str.length()-1; i >=0; i--) {
            ans+=str.charAt(i);

        }
        String finalans="";
        for (int i = 0; i < ans.length(); i++) {
            if (ans.charAt(i) == 'a') {
               finalans+= ans.replace('a','1');
            }
            if (ans.charAt(i) == 'b') {
                finalans+=  ans.replace('b','2');
            }
            if (ans.charAt(i) == 'c') {
                finalans+= ans.replace('c','3');
            }
            if (ans.charAt(i) == 'd') {
                finalans+= ans.replace('d','4');
            }
            if (ans.charAt(i) == 'e') {
                finalans+= ans.replace('e','5');
            }
            else
                finalans+= String. valueOf(ans.charAt(i));




        }
        System.out.println(ans);
        return finalans;
    }

}
