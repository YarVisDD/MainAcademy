package com.mylabs.lab231;

public class MyWindow {
    double widht=20.5;
    double height=15.6;
    int numberOfGlass=3;
    String color="Green";
    boolean isOpen=true;
    public void printFields(){
        System.out.println("Widght - "+widht);
        System.out.println("Hedght - "+height);
        System.out.println("NumberOfGlass - "+numberOfGlass);
        System.out.println("Color - "+color);
        System.out.println("IsOpen - "+isOpen);
    }

    public static void main(String[] args) {
        MyWindow window=new MyWindow();
        window.printFields();
    }
}
