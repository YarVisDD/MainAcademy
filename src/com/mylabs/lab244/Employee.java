package com.mylabs.lab244;

public class Employee {
    String firstName;
    String lastName;
    int telephone;
    static int numberOfEmployees;
    public Employee(String firstName,String lastName,int telephone){
        this.firstName=firstName;
        this.lastName=lastName;
        this.telephone=telephone;
        numberOfEmployees++;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static void setNumberOfEmployees(int numberOfEmployees) {
        Employee.numberOfEmployees = numberOfEmployees;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public int getTelephone() {
        return telephone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public static int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public static void main(String[] args) {
        Employee   employee=new Employee("Petya","asd",12345);
        Employee employee1=new Employee("Petya","asd",12345);
        Employee employee2=new Employee("Petya","asd",12345);
        System.out.println(numberOfEmployees);
    }

}
