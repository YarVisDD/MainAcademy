package com.mylabsSE.lab121;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {
    String name;
    String address;
   transient int SSN;
    int number;
private static final long serialVersionUID=1L;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getadress() {
        return address;
    }

    public void setaddress(String adress) {
        this.address = adress;
    }

    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
