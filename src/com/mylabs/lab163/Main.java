package com.mylabs.lab163;

public class Main {
    public static void main(String[] args) {
        int[][] arr=new int[4][4];
        int count=1;
        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                arr[i][j]=count;
                System.out.print(arr[i][j]+" ");
                count++;
            }
            System.out.println();
        }
    }
}
