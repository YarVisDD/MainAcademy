package com.mylabs.lab224;

import java.util.Scanner;

public class Person {
    String firstName;
    String lastName;
    int age;
    String gender;
    int phoneNumber;

    public void setData(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    public void setData(int age,String gender,int phoneNumber){
        this.age=age;
        this.gender=gender;
        this.phoneNumber=phoneNumber;
    }
}
class newPerson{
    Person person=new Person();

    public static void main(String[] args) {
        newPerson pp=new newPerson();
        pp.person.setData("Yaroslav","Visitskiy");
        pp.person.setData(27,"Male",123456);
    }
}