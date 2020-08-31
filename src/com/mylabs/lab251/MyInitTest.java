package com.mylabs.lab251;

public class MyInitTest {
    int x;

    public MyInitTest(){
        System.out.println("Constructor 1");

    }
    public  MyInitTest(int x){
        this.x=x;
        System.out.println("Constructor 2");
    }
    static {
        System.out.println("Static init block 1");

    }
    static {
        System.out.println("Static init block 2");

    }
    {
        System.out.println("non stat init block 1");
    }
    {
        System.out.println("non stat init block 2");
    }

    public static void main(String[] args) {
        MyInitTest myInitTest=new MyInitTest();
    }
}
