package com.mylabs.lab2144;

import java.util.Arrays;
import java.util.Random;

public class MyMixer<T> {
   public T[] arr;

    public MyMixer(T[] arr) {
       this.arr = arr;
    }
    public T[] shuffle(){
        Random rand=new Random();
        for(int i=0;i<arr.length;i++){
        int randomPosition = rand.nextInt(arr.length);
        T temp=arr[i];
        arr[i]=arr[randomPosition];
        arr[randomPosition]=temp;
        }

    return arr;}
    public void showArr(){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
