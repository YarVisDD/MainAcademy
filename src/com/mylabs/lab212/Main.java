package com.mylabs.lab212;

public class Main {
    public static void main(String[] args) {


        class Computer{
            public String manufacturer;
            public int serialNumber=100;
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
        }

    }
}
