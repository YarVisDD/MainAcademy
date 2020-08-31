package com.mylabs.lab2173;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int MyArray[]=new int[1000];
        Random rand=new Random();
        for(int i=0;i<MyArray.length;i++){
            MyArray[i]=rand.nextInt(1000);
        }
        MySumCount mySumCount=new MySumCount();
        mySumCount.setMyArr(MyArray);
        mySumCount.setStartIndex(300);
        mySumCount.setStopIndex(854);
        MySumCount mySumCount1=new MySumCount();
        mySumCount1.setMyArr(MyArray);
        mySumCount1.setStartIndex(300);
        mySumCount1.setStopIndex(700);
        mySumCount.start();
        mySumCount1.start();

    }
}
