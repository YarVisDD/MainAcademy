package com.mylabsSE.lab174;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        IntStream.iterate(10,n->n+10).filter(x->x%2!=1).limit(10).forEach(x->System.out.println(x));
    }
}
