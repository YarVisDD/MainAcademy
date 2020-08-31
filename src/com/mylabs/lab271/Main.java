package com.mylabs.lab271;

public class Main {
    public static void main(String[] args) {
        Device device=new Device("Samsung",25.6,"AB12345CD");
       Monitor monitor=new Monitor("Samsung",123.5,"AB234412",48,68);
       EthernetAdapter ethernetAdapter=new EthernetAdapter("TP-Link",12.5,"asd1233",48,"24451se");

        System.out.println(device.equals(monitor));

        System.out.println(ethernetAdapter.toString());
    }
}
