package com.mylabs.lab281;

public class Rectangle extends Shape implements Drawable,Comparable{
    private double widht;
    private double height;
    public Rectangle(String shapeColor,double widht,double height){
        super(shapeColor);
        this.height=height;
        this.widht=widht;

    }

    @Override
    public String toString() {
        return "This is Rectangle, color:"+shapeColor+" ,height="+height+" widht="+widht;
    }

    @Override
    public double calcArea() {
        double area=widht*height;
        System.out.print("Shape area is:");
        return area;
    }

    @Override
    public void draw() {
        System.out.println(toString());        System.out.println(calcArea());

    }

    @Override
    public int compareTo(Object o) {


        return 0;
    }
}
