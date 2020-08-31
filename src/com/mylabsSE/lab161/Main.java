package com.mylabsSE.lab161;

import java.util.Random;

public class Main {
    @Deprecated
    public static  int findMax() {
        return findMax();
    }

    @Deprecated
    public static  int findMax(int[] arr){
       int[]array=new int[10];
       int max=0;
        Random random=new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(134);
        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
   return max; }
@SuppressWarnings("deprecation")
    public static void main(String[] args) {
        int[]mass=new int[10];
        System.out.println(findMax(mass));
    }
}
