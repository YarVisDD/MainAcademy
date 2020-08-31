package com.mylabs.lab2154;

public class Main {
    public static void main(String[] args) {
        MyNumGenerator myNumGenerator= new MyNumGenerator(5,70);
        System.out.println(myNumGenerator.generate());
        System.out.println(myNumGenerator.generateDistinct());
    }
}
