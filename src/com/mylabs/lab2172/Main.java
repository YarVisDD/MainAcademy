package com.mylabs.lab2172;

public class Main {
    public static void main(String[] args) {
        MyTimeBomb myTimeBomb=new MyTimeBomb();
        Thread th1=new Thread(myTimeBomb);
        th1.start();
    }
}
