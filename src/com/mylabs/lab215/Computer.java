package com.mylabs.lab215;

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
    public void Add(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Введите название компьютера:");
        setManufacturer(sc.nextLine());
        System.out.println("Set Serial:");
        setSerialNumber(sc.nextInt());
        System.out.println("Set price:");
        setPrice(sc.nextDouble());
        System.out.println("Set Frequency:");
        setFrequencyCPU(sc.nextInt());
        System.out.println("Set Quantity:");
        setQuantityCPU(sc.nextInt());
    }
    public void View(){
        System.out.println(getManufacturer());
        System.out.println(getSerialNumber());
        System.out.println(getPrice());

        System.out.println(getFrequencyCPU());
        System.out.println(getQuantityCPU());
    }
    public static void main(String[] args) {



        Computer mass[]=new Computer[2];
        for(int i=0;i<mass.length;i++){
            Computer mass0=new Computer();
            mass[i]=mass0;
           mass[i].Add();


        } for(int i=0;i<mass.length;i++){

            mass[i].View();
        }




    }

}
