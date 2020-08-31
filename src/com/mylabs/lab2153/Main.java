package com.mylabs.lab2153;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>(10);
        List<String>list1=new LinkedList<>();
        for(int i=0;i<10;i++){
            list.add("Number_"+ i);
        }for(int i=0;i<10;i++){
            list1.add("Number_"+ i);
        }
        Iterator<String > itr= list.iterator();
        Iterator<String > itr1= list1.iterator();

        while(itr.hasNext()){
            String elm=itr.next();
            System.out.println(elm+" ");
        }
        System.out.println();
        while(itr1.hasNext()){
            String elm=itr1.next();
            System.out.println(elm+" ");
        }
        ListIterator listIterator=new ListIterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }

            @Override
            public boolean hasPrevious() {
                return false;
            }

            @Override
            public Object previous() {
                return null;
            }

            @Override
            public int nextIndex() {
                return 0;
            }

            @Override
            public int previousIndex() {
                return 0;
            }

            @Override
            public void remove() {

            }

            @Override
            public void set(Object o) {

            }

            @Override
            public void add(Object o) {

            }
        };
        
    }
}
