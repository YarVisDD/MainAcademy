package com.mylabs.lab276;

public class Rectangle extends Shape{
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
}
