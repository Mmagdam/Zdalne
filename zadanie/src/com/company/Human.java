package com.company;


public class Human {
    String firstName;
    String lastName;
    Integer age;
    String sex;

    Phone mobilePhone;
    Animal pet;
    Car myCar;
    private Double salary=2500.00;

    public double getSalary(){
        return salary;
    }
    public void setSalary(double newSalary){
        salary = newSalary;
    }



}