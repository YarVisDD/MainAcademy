package com.mylabs.lab2171;

public class MyTimeBomb extends Thread {
    @Override
    public void run() {
      for(int i=10;i>=0;i--){
          System.out.println(i+" ");
          if(i==0){
              System.out.println("BOOM!!!");
          }
          try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              e.printStackTrace();
          }

      }
    }
}
