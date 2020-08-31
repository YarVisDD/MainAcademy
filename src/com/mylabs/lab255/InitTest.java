package com.mylabs.lab255;

import java.util.Random;

public class InitTest {
    private int id;
    static private int nextId;

    public InitTest(){
nextId++;
id=nextId;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        Random rand=new Random();
  nextId =rand.nextInt(1000);

  InitTest initTest=new InitTest();
        System.out.println(initTest.getId());
        InitTest initTest1=new InitTest();
        System.out.println(initTest1.getId());
        InitTest initTest2=new InitTest();
        System.out.println(initTest2.getId());
        InitTest initTest3=new InitTest();
        System.out.println(initTest3.getId());
        InitTest initTest4=new InitTest();
        System.out.println(initTest4.getId());




    }
}
