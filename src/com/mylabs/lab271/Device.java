package com.mylabs.lab271;

import java.util.Objects;

public class Device {
    public String manufacturer;
    public double price;
    public String serialNumber;



    public Device(String manufacturer, double price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Device{" +
                "manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device)) return false;
        Device device = (Device) o;
        return Double.compare(device.getPrice(), getPrice()) == 0 &&
                getManufacturer().equals(device.getManufacturer()) &&
                getSerialNumber().equals(device.getSerialNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getManufacturer(), getPrice(), getSerialNumber());
    }
}
