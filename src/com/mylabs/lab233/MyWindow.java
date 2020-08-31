package com.mylabs.lab233;

public class MyWindow {
    double widht;
    double height;
    int numberOfGlass;
    String color;
    boolean isOpen;
    public MyWindow(double widht,double height){
        this.widht=widht;
        this.height=height;
    }
public MyWindow(double widht,double height,int numberOfGlass){
    this.widht=widht;
    this.height=height;
    this.numberOfGlass=numberOfGlass;
}public MyWindow(double widht,double height,int numberOfGlass,String color){
    this.widht=widht;
    this.height=height;
    this.numberOfGlass=numberOfGlass;
    this.color=color;
}public MyWindow(double widht,double height,int numberOfGlass,String color,boolean isOpen){
    this.widht=widht;
    this.height=height;
    this.numberOfGlass=numberOfGlass;
    this.color=color;
    this.isOpen=isOpen;
}
    public void printFields(){
        System.out.println("Widght - "+widht);
        System.out.println("Hedght - "+height);
        System.out.println("NumberOfGlass - "+numberOfGlass);
        System.out.println("Color - "+color);
        System.out.println("IsOpen - "+isOpen);
    }
    public static void main(String[] args) {
       MyWindow myWindows[]=new MyWindow[5];
       for(int i=0;i<5;i++){
           MyWindow my=new MyWindow(12.5,10.5,12);
           myWindows[i]=my;
           my.printFields();
       }
    }
}
