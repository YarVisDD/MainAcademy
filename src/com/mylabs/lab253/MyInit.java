package com.mylabs.lab253;

import java.util.Random;

public class MyInit {
    public static int []arr=new int[10];
    {
        Random rand=new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=rand.nextInt(10);}
    }
    public void printArr(){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        MyInit myInit=new MyInit();
        MyInit myInit1=new MyInit();
        myInit.printArr();
        System.out.println();
        myInit1.printArr();
    }
}
