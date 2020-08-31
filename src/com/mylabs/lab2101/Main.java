package com.mylabs.lab2101;

public class Main {
    public static void main(String[] args) {
        Integer x1=10;
        Integer x2=new Integer(10);
        Integer x3=Integer.valueOf(10);
        Integer x4=Integer.parseInt("10");
        System.out.println(x1.equals(x2));
        System.out.println(x1.equals(x3));
        System.out.println(x1.equals(x4));
        System.out.println(x1==x2);
        System.out.println(x1==x3);
        System.out.println(x1==x4);
        System.out.println();
        Integer x5=140;
        Integer x6=new Integer(140);
        Integer x7=Integer.valueOf(140);
        Integer x8=Integer.parseInt("140");
        System.out.println(x5.equals(x6));
        System.out.println(x5.equals(x7));
        System.out.println(x5.equals(x8));
        System.out.println(x5==x6);
        System.out.println(x5==x7);
        System.out.println(x5==x8);

    }
}
