package com.mylabs.lab153;

public class Main {
    public static void main(String[] args) {
        for(int i=1;i<10;++i){
            System.out.print(i);System.out.print("*| ");
            for(int j=1;j<10;++j){


                System.out.print(j*i+" ");


            }
            System.out.println();

        }
    }
}
