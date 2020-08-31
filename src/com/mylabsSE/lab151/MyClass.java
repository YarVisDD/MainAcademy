package com.mylabsSE.lab151;

public class MyClass {
    public int a;
    public int b;
    private int c;
    protected int d;

public MyClass(){};
    private MyClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public MyClass(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

   private MyClass(int a, int b, int d) {
        this.a = a;
        this.b = b;
        this.d = d;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }
}
