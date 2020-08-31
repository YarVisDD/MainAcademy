package com.mylabs.lab214;

import java.util.Scanner;

public class Computer {
    public String manufacturer;
    public int serialNumber;
    public double price;
    public int quantityCPU;
    public int frequencyCPU;

    public void setManufacturer(String x){
        manufacturer=x;
    }

    public void setFrequencyCPU(int frequencyCPU) {
        this.frequencyCPU = frequencyCPU;
    }

    public void setPrice(double price) {
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

    public double getPrice() {
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

        double perc=12.5;
        double pr=(12.5*10)/100;

        Computer mass[]=new Computer[5];
        for(int i=0;i<mass.length;i++){
            Computer mass0=new Computer();
            mass[i]=mass0;
mass[0].price=perc;
if(i>0){
    mass[i].price=mass[i-1].price+2.5;

}


        } for(int i=0;i<mass.length;i++){

            System.out.println(mass[i].getPrice());
        }




    }

}
