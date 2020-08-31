package com.mylabs.lab281;

public abstract class Shape implements Drawable{
    public String shapeColor;
    public Shape(String shapeColor){
        this.shapeColor=shapeColor;
    }
    @Override
    public String toString() {
        return "The Shape color is "+shapeColor;
    }


    public abstract double calcArea();
}
