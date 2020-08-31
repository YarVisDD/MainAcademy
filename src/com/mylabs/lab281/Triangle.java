package com.mylabs.lab281;

public class Triangle extends Shape implements Drawable,Comparable{ private double a;
    private double b;
    private double c;
    public Triangle(String shapeColor,double a,double b,double c){
        super(shapeColor);
        this.a=a;
        this.b=b;
        this.c=c;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "This is Triangle, color: "+shapeColor+" a="+a+" b="+b+" c="+c;
    }

    @Override
    public double calcArea() {
        double area=a+b+c;
        System.out.print("Shape area is:");
        return area;
    }

    @Override
    public void draw() {

        System.out.println(toString());System.out.println(calcArea());
    }
}
