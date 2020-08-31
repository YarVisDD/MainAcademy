package com.mylabs.lab271;

import java.util.Objects;

public class EthernetAdapter extends Device {
    public int speed;
    public String mac;

    public EthernetAdapter(String manufacturer, double price, String serialNumber,int speed,String mac) {
        super(manufacturer, price, serialNumber);
        this.speed=speed;
        this.mac=mac;
    }

    @Override
    public String toString() {
        return "EthernetAdapter{" +
                "speed=" + speed +
                ", mac='" + mac + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EthernetAdapter)) return false;
        EthernetAdapter that = (EthernetAdapter) o;
        return getSpeed() == that.getSpeed() &&
                getMac().equals(that.getMac());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSpeed(), getMac());
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
}
