package com.company;


import java.time.LocalDateTime;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    String sex;

    Phone mobilePhone;
    Animal pet;
    Car myCar;
    private Double salary=2500.00;
    LocalDateTime data = LocalDateTime.now();
    public String getSalary(){
        return "\nCzas pobrania danych: "+data+"\nAktualna pensja: "+salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary<0){
            System.out.println("Wartosc wyplaty nie moze byc ujemna!");
        }
        else {
            System.out.println("Nowe dane zostaly wyslane do systemu ksiegowego.");
            System.out.println("Prosze odebrac aneks umowy od Pani Hani z kadr.");
            System.out.println("ZUS i US juz wiedza o zmianie wypaty wiec nie ma sensu ukrywac dochodu.");
            salary=newSalary;

        }
    }
}