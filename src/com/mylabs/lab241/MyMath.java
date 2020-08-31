package com.mylabs.lab241;

import java.util.Random;

public class MyMath {
    int arr[];
    final static double PI = 3.14;




    public void addMass(){
        Random rand=new Random();
         arr=new  int [10];
         for (int i=0;i<arr.length;i++){
             arr[i]=rand.nextInt(50);
         }

    }
    public void showMass(){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int findMin(int arr[]){
        int min=arr[0];
       for(int i=0;i<arr.length;i++){
           if(min>arr[i]){
               min=arr[i];
           }
       }
   return min; }

    public static int findMax(int arr[]){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max; }
public static double areaOfCircle(double rad){
        double area=PI*(rad*rad);
        return area;
}
    public static void main(String[] args) {
        System.out.println("Area="+areaOfCircle(1.5));



        MyMath myMath=new MyMath();
       myMath.addMass();
       myMath.showMass();
        System.out.println();
        System.out.println("Минимальный элемент массива - "+findMin(myMath.arr));
        System.out.println("Максимальный элемент массива - "+findMax(myMath.arr));


    }
}

