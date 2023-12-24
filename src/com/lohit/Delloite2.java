package com.lohit;

public class Delloite2 {
     public static void main(String[] args) {
         String str="answer";
         String ans="wer";
          System.out.println(reflect(str,ans));
     }
     static int reflect(String str,String ans)
     {
          int res=1;
          for (int i = 0; i <ans.length(); i++) {

               if(ans.charAt(i)==str.charAt(i)){
                    res=1;
               }
               else res=0;

          }
         return res;
     }

}
