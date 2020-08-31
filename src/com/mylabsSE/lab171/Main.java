package com.mylabsSE.lab171;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Integer []arr=new Integer[10];
        Random random=new Random();
        for(int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(100);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr,(x,y)->y.compareTo(x));

        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        List<String> str=new ArrayList<>();
        str.add("abcd");
        str.add("efgh");
        Collections.sort(str,(s1,s2)->s2.compareTo(s1));
        System.out.println(str);

    }
}
