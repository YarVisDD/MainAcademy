package com.mylabs.lab2121;

import java.util.Arrays;
import java.util.Comparator;

public class MyPhoneBook {
    static class PhoneNumber{
        String name;
        String phone;

        public PhoneNumber(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        @Override
        public String toString() {
            return "Name: "+name+",Phone: "+phone;
        }
    }
    private PhoneNumber[] phoneNumbers=new PhoneNumber[10];
    private int lastindex=0;
    public void addPhoneNumbers(String name,String phone){
        if(lastindex<10){
            phoneNumbers[lastindex]=new PhoneNumber(name, phone);
            lastindex++;
        }
    }
    public void printPhoneBook(){
        for(int i=0;i<10;i++){
            System.out.println(phoneNumbers[i]);
        }
    }
    public void sortByName(){
        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });}

        public void sortByPhoneNumber(){
        Arrays.sort(phoneNumbers, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                int num1=Integer.parseInt(o1.getPhone());
                int num2=Integer.parseInt(o2.getPhone());
                if(num1>num2){return 1;}
                else if(num1<num2){return -1;}
                else return 0;

            }
        });

        }
       static class MyPhone{
        private MyPhoneBook phoneBook;
        public void MyPhone(){
            phoneBook=new MyPhoneBook();
        }
        public void SwitchOn(){
            System.out.println("Loading PhoneBook records...");

            phoneBook.addPhoneNumbers("Petya","123456743");
            phoneBook.addPhoneNumbers("Satya","155556743");
            phoneBook.addPhoneNumbers("Pztya","234555534");
            phoneBook.addPhoneNumbers("Petra","123566454");
            phoneBook.addPhoneNumbers("Vasya","446632223");
            phoneBook.addPhoneNumbers("Luda","2225664453");
            phoneBook.addPhoneNumbers("Kostya","33423566");
            phoneBook.addPhoneNumbers("Nastya","66334566");
            phoneBook.addPhoneNumbers("Misha","1126633434");
            phoneBook.addPhoneNumbers("Anton","445661112");
            if(phoneBook.phoneNumbers.length==10) {
                System.out.println("OK!");}        }
                public void call(int i){
            if(i>0&&i<10){
                System.out.println("Calling to:");
                System.out.println(phoneBook.phoneNumbers[i-1]);
            }
                }
       }



    }

