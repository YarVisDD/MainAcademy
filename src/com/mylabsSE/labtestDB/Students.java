package com.mylabsSE.labtestDB;

public class Students {
    public int id;
    public String name;
    public String surName;
    public int Age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Students(int id, String name, String surName, int age) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        Age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
