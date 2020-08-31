package com.mylabs.lab2154;
import java.util.*;
import java.util.Scanner;
public class MyNumGenerator {
    public int numOfElm;
    public int maxNumb;

    public MyNumGenerator(int numOfElm, int maxNumb) {
        this.numOfElm = numOfElm;
        this.maxNumb = maxNumb;
    }
    public List<Integer> generate(){


        List <Integer>  list=new ArrayList<>(numOfElm);
        Random rand=new Random(maxNumb);
        for(int i=0;i<numOfElm;i++){
            list.add(rand.nextInt(maxNumb));
        }
        return list;
    }
    public Set<Integer> generateDistinct(){
        Set<Integer>list=new TreeSet<>();
        Random rand=new Random(maxNumb);
        for(int i=0;i<numOfElm;i++){
            list.add(rand.nextInt(maxNumb));
        }
        return list;
    }
}
