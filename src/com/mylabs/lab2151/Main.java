package com.mylabs.lab2151;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        List<String >list=new ArrayList<>(10);
      for(int i=0;i<10;i++){
          list.add("Number_"+ i);
      }
       Iterator<String > itr= list.iterator();
      while(itr.hasNext()){
          String elm=itr.next();
          System.out.println(elm+" ");
      }

         }
}
