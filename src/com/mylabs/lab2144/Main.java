package com.mylabs.lab2144;

public class Main {
    public static void main(String[] args) {
        MyMixer<Integer> mixer1=new MyMixer<Integer>(new Integer[]{1,2,3,4,5,6,7,8,9});
        MyMixer<String> mixer2=new MyMixer<String>(new String[]{"One","Two","Three","Four","Five","Six","Seven"});
        mixer1.shuffle();
        System.out.println();
        mixer1.showArr();
        mixer2.shuffle();
        mixer2.showArr();

    }
}
