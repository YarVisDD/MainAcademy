package com.mylabs.lab223;

public class Employee {
    String name;
    double salary;

    public double calcSalary(String name,double... values){
        double res=0;
        for(double x:values){
            res+=x;
        }
        System.out.println(name);
        return res;
    }
    public static void main(String[] args) {
Employee emp=new Employee();
        System.out.println(emp.calcSalary("Yaroslav",10.5,14.4,16.5));
        Accountant acc=new Accountant();
        System.out.println(acc.emp.calcSalary("Guest",14,16,17,18));

    }
}
 class Accountant{
    Employee emp=new Employee();

}
