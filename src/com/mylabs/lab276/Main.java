package com.mylabs.lab276;

public class Main {
    public static void main(String[] args) {
        //Circle circle=new Circle("Green",21.5);
       // System.out.println(circle.toString());

       // System.out.println(circle.calcArea());
       // Rectangle rectangle=new Rectangle("RED",11,22);
       // System.out.println(rectangle.toString());
      //  System.out.println(rectangle.calcArea());
      //  Triangle triangle=new Triangle("BLACK",5,5,5);
      //  System.out.println(triangle.toString());
       // System.out.println(triangle.calcArea());
        double sumArea=0;
        double sumCircleArea=0;
        double sumRectArea=0;
        double sumTriangleArea=0;
        Shape shape[]=new Shape[9];
        for(int i=0;i<9;i++){
if(i<=4){Circle circle1=new Circle("RED",21);
shape[i]=circle1;
            System.out.println(shape[i].toString());
    System.out.println(shape[i].calcArea());
    sumArea+=shape[i].calcArea();
        }
if(i==5||i==6){
    Rectangle rectangle1=new Rectangle("GREEN",11,22);
    shape[i]=rectangle1;
    System.out.println(shape[i].toString());
    System.out.println(shape[i].calcArea());
    sumArea+=shape[i].calcArea();
}
if(i>6){
    Triangle triangle1=new Triangle("BLACK",5,5,5);
    shape[i]=triangle1;
    System.out.println(shape[i].toString());
    System.out.println(shape[i].calcArea());
    sumArea+=shape[i].calcArea();
}
if(shape[i] instanceof Circle){
    sumCircleArea+=shape[i].calcArea();
}
if(shape[i] instanceof Rectangle){
    sumRectArea+=shape[i].calcArea();
}if(shape[i] instanceof Triangle){
    sumTriangleArea+=shape[i].calcArea();
}

    }
        System.out.println("Total "+sumArea);
        System.out.println("sumCircle Total "+sumCircleArea);
        System.out.println("sumRect Total "+sumRectArea);
        System.out.println("sumTriangle Total "+sumTriangleArea);
    }
}
