package com.mylabs.lab154;

public class Main {
    public static void main(String[] args) {
        int k=0;
        for(int i=1;i<=300;i++){
            if(i%3==0||i%4==0){
                System.out.println(i);
                k++;
            }
            if(k==10){break;}
        }
    }
}
