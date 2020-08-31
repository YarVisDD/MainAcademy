package com.mylabsSE.lab124;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Main {
    public static void main(String[] args) {
        User user=new User("Oleg","Ninen",25);
        RandomAccessFile raf=null;
        try (RandomAccessFile rw = raf = new RandomAccessFile("E:\\users.ser", "rw")) {
            raf.writeBytes(user.getFirstName());
            raf.writeBytes(user.getLastName());
            raf.writeByte(user.getAge());


           raf.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
