package com.mylabs.lab246;

public class MyPyramid {

    public static void printPyramid(int h){
        for(int i=1;i<h;++i){
            for(int j=1;j<=i;++j){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPyramid(5);
    }
}
