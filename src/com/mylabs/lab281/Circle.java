package com.mylabs.lab281;

public class Circle extends Shape implements Drawable,Comparable{
    private double radius;

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius=radius;
    }

    @Override
    public String toString() {
        return "This is Circle,color: "+shapeColor+",radius="+radius;
    }

    @Override
    public double calcArea() {
        double area=3.14*(radius*radius);
        System.out.print("Shape area is:");
        return area;
    }

    @Override
    public void draw() {

        System.out.println(toString());System.out.println(calcArea());
    }
}
