package com.mylabs.lab232;

public class MyWindow {
    double widht;
    double height;
    int numberOfGlass;
    String color;
    boolean isOpen;
 public MyWindow(){};

    @Override
    public String toString() {
        return "MyWindow{" +
                "widht=" + widht +
                ", height=" + height +
                ", numberOfGlass=" + numberOfGlass +
                ", color='" + color + '\'' +
                ", isOpen=" + isOpen +
                '}';
    }

    public static void main(String[] args) {
        MyWindow window=new MyWindow();
        System.out.println(window.toString());
    }
}
