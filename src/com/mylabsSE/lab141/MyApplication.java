package com.mylabsSE.lab141;

import javax.swing.*;
import java.awt.*;

public class MyApplication extends JFrame {
    public String name;

    MyApplication(String Name){
       setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.name=Name;
        JPanel panel = new JPanel();
panel.setLayout(new BorderLayout());
panel.add(new JLabel("Run a program"),BorderLayout.WEST);
panel.add(new JComboBox<>(),BorderLayout.CENTER);
panel.setSize(300,200);
setContentPane(panel);

    }

    @Override
    public String getName() {
        return name;
    }

}
