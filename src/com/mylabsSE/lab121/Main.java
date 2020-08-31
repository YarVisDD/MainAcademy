package com.mylabsSE.lab121;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Yaroslav");
        employee.setaddress("Kiyevskaya");
        employee.setSSN(12334567);
        employee.setNumber(15);

        try {
            FileOutputStream fos = new FileOutputStream("E:\\emp.ser");
            ObjectOutputStream oos= new ObjectOutputStream(fos);
            oos.writeObject(employee);
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
Employee employee1=new Employee();
        try {
            FileInputStream fis = new FileInputStream("E:\\emp.ser");
            ObjectInputStream ois=new ObjectInputStream(fis);
            employee1=(Employee)ois.readObject();
            System.out.println("Name: "+employee1.getName());
            System.out.println("Address: "+employee1.getadress());
            System.out.println("SSN: "+employee1.getSSN());
            System.out.println("Number: "+employee1.getNumber());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }




    }
