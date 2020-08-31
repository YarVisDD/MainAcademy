package com.mylabs.lab247;

public class GravityCalculator {
    final static double a=-9.81;
    static double v=15.4;
   static double x=10.5;
    double Time;
    public  static double calcDist(double Time){
double xT=0.5*a*(Time*Time)+v*Time+x;
return xT;
    }

    public static void main(String[] args) {
        System.out.println(calcDist(15.6));
    }
}
