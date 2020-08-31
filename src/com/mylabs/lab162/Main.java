package com.mylabs.lab162;

public class Main {
    public static void main(String[] args) {
        int[] m = new int[] { 10, 21, 5, 22, 9, 29, 25, 22, 11, 14, 8, 14 };
        int maxVal=0;
        int minVal=m[0];
        for(int i=0;i<m.length;i++){

            if(m[i]>maxVal){
                maxVal=m[i];
            }
            if(m[i]<minVal){
                minVal=m[i];
            }
            System.out.print(m[i]+" ");
        }
        System.out.println();
        System.out.println("MaxVal from array = "+ maxVal);
        System.out.println("MinVal from array = "+ minVal);
    }
}
