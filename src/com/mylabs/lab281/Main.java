package com.mylabs.lab281;

public class Main {
    public static void main(String[] args) {
        Drawable circle=new Circle("RED",21.5);
        circle.draw();
        Rectangle rectangle=new Rectangle("BLACK",11,22);
        rectangle.draw();
        Triangle triangle=new Triangle("GREEN",5,5,5);
        triangle.draw();
        Rectangle rectangle1=new Rectangle("BLACK",12,11);
        System.out.println(rectangle.compareTo(rectangle1));

    }
}
