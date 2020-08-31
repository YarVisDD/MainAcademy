package com.mylabs.lab155;

public class Main {
    public static void main(String[] args) {
        int sum=0;
        int avg=0;
        for (int i=1;i<=10;i++){
            sum+=i;
            avg=sum/i;

        }
        System.out.println("The sum is : "+sum);
        System.out.println("The avg is: "+avg);
    }
}
