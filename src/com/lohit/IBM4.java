package com.lohit;

public class IBM4 {
    public static void main(String[] args) {
    int angle=45;
    double height=20.0;
        System.out.println(Area(angle,height));
    }

    static double Area(int angle, double height) {
       // double an = Math.toDegrees(angle);
        //System.out.println(an);
        double an=Math.sin(Math.toRadians(angle));


        //double an= 0.7071;
        double hypotenus=height/an;
        //System.out.println(hypotenus);
        double hypotenusSq= hypotenus*hypotenus;
        double heightSq=height*height;
        double diff= hypotenusSq-heightSq;
       // System.out.println(diff);
        double radius= Math.sqrt(diff);


        return 3.14*radius*radius;

    }
}
