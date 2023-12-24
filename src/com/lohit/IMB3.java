package com.lohit;

public class IMB3 {
    public static void main(String[] args) {
        String inpToken="w@5";
        String daytime="11:20";
        System.out.println(validcheck(inpToken,daytime));
    }
    static String validcheck(String inpToken,String valid)
    {
        if (inpToken.length() != 3) {
            return "Invalid Token";
        }
        String str=valid.substring(0,2);
        int time=Integer.parseInt(str);

        if(time>12 && ((inpToken.charAt(0)>=65 &&inpToken.charAt(0)<=90) )){


        }
        return str;
    }
}
