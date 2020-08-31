package com.mylabsSE.lab141;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        MyApplication myApplication=new MyApplication("My App");
        myApplication.setSize(300,200);
        myApplication.setTitle(myApplication.getName());
        myApplication.setVisible(true);
JComponent b=new JButton("sdf");
        System.out.println(((JButton)b).getActionCommand());


    }
}
