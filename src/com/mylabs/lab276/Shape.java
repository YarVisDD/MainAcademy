package com.mylabs.lab276;

public class Shape {
    public String shapeColor;

    @Override
    public String toString() {
        return "The Shape color is "+shapeColor;
    }

    public  Shape(String shapeColor){
this.shapeColor=shapeColor;
    }
public double calcArea(){
    System.out.println("The Shape area is:");
        return 0.0;
}
}
