package com.mylabs.lab2152;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        Random random=new Random();
        for(int i=0;i<10;i++){

            list.add("Number_"+i);
        }
        Collections.shuffle(list);
        Iterator<String > itr= list.iterator();
        while(itr.hasNext()){
            String elm=itr.next();
            System.out.println(elm+" ");
        }

    }
}
