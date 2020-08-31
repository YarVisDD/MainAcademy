package com.mylabsSE.lab172;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    static void sumEven(Integer[] arr, Predicate<Integer> predicate) {

    }

    static void printJStr(List<String> str,Predicate<String> predicate){

    }


    public static void main(String[] args) {

       Integer[]arr={1,2,-5,6,1,2,-7,4};
       List<String> strings=new ArrayList<>();
       strings.add("abcd");

        sumEven(arr, (Integer integer) -> integer<0);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
