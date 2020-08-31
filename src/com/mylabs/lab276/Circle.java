package com.mylabs.lab276;

public class Circle extends Shape {
    private double radius;

    public Circle(String shapeColor,double radius) {
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
}
