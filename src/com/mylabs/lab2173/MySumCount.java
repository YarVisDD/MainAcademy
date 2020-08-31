package com.mylabs.lab2173;

public class MySumCount extends Thread{
    int startIndex;
    int stopIndex;
    int myArr[];
    long resultSum;

    @Override
    public void run() {
        for(int i=startIndex;i<=stopIndex;i++){
            System.out.print(i+", ");
resultSum+=i;

        }
        System.out.println("Sum of Array Elements="+resultSum);
    }

    public long getResultSum() {
        return resultSum;
    }

    public void setMyArr(int[] myArr) {
        this.myArr = myArr;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }
}
