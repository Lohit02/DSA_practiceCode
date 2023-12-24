package com.lohit;

import java.util.ArrayList;
import java.util.List;

public class IBM2 {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>();
        list.add("10001101");
        list.add("10101010");
        list.add("10010010");
        Lohit(list);
    }

    static void Lohit(List<String>list) {
        int dec1=Integer.parseInt(list.get(0),2);
        int dec2=Integer.parseInt(list.get(1),2);
        int dec3=Integer.parseInt(list.get(2),2);
        int dec=dec1+dec2+dec3;
        int sec=dec%60;
       String SEC= String.format("%02d",sec);
        int min=dec/60;
        String MIN=String.format("%02d",min);
        int hour=min/60;
        String HOUR=String.format("%02d",hour);
        System.out.println(HOUR+":"+MIN+":"+SEC);

    }
}
