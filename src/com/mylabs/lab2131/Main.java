package com.mylabs.lab2131;

public class Main {
    enum MyDaysOfTheWeek{MON,TUE,WED,THU,FRI,SAT,SUN};
    public static void main(String[] args) {
for(MyDaysOfTheWeek myDays:MyDaysOfTheWeek.values()){
    System.out.println(myDays);
}
    }
}
