package com.mylabsSE.lab152;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        MyClass mycls=new MyClass();
        Class<?>cls=mycls.getClass();
        try {
            MyClass obj=new MyClass();
            Field field=cls.getDeclaredField("myStr");
            field.setAccessible(true);
            System.out.println("Old string value:"+field.get(obj));
            field.set(obj,"z,x,c,v");
            System.out.println("New string value:"+field.get(obj));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
