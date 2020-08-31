package com.mylabs.test;

import java.util.Scanner;
import java.util.Arrays;

public class Computer {

    public String manufacturer;
    public int serialNumber;
    public float price;
    public int quantityCPU;
    public int frequencyCPU;

    public void setManufacturer(String x){
        manufacturer=x;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setQuantityCPU(int quantityCPU) {
        this.quantityCPU = quantityCPU;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getSerNumber(){
        return serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public int getFrequencyCPU() {
        return frequencyCPU;
    }

    public int getQuantityCPU() {
        return quantityCPU;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Computer mass[]=new Computer[5];

        for(int i=0;i<mass.length;i++){

          Computer mass0=new Computer();
            System.out.println("Введите название компьютера №"+(i+1)+": ");
            String userIn=sc.nextLine();
            mass[i]=mass0;
            mass[i].setManufacturer(userIn);

        }
        for(int i=0;i<mass.length;i++){
            System.out.println("Компьютер №"+(i+1)+": ");
            System.out.println(mass[i].getManufacturer());

        }
    }


        }

