package com.mylabs.lab2102;

public class Main {
   static Long compute(Byte x,Integer y){
Long z=x.longValue()+y.longValue();
return z;
   }


    public static void main(String[] args) {
Integer y=25;
Byte z=17;
        System.out.println(compute(z,y));
    }
}
