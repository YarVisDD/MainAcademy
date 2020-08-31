package com.mylabs.lab271;

import java.util.Objects;

public class Monitor extends Device{
    public int resolutionX;
    public int resolutionY;

    public Monitor(String manufacturer, double price, String serialNumber,int resolutionX,int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX=resolutionX;
        this.resolutionY=resolutionY;
    }


    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "resolutionX=" + resolutionX +
                ", resolutionY=" + resolutionY +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monitor)) return false;
        Monitor monitor = (Monitor) o;
        return getResolutionX() == monitor.getResolutionX() &&
                getResolutionY() == monitor.getResolutionY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getResolutionX(), getResolutionY());
    }
}
