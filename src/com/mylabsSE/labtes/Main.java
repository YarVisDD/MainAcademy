package com.mylabsSE.labtes;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException {
        IntStream.range(-5, 0)
                .flatMap(i -> IntStream.of(i,i-1
                        ))
                .
                        sorted
                                ()
                .forEach(System.out::println);
    }
}