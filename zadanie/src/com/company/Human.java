package com.company;


import java.time.LocalDateTime;

public class Human {
    String firstName;
    String lastName;
    Integer age;
    String sex;

    Phone mobilePhone;
    Animal pet;

    private Double salary=2500.00;
    LocalDateTime data = LocalDateTime.now();
    private Car myNewCar= new Car("Renault", "Clio", 2020, 5000.0);

    public String getSSalary(){
        return "\nCzas pobrania danych: "+data+"\nAktualna pensja: "+salary;
    }
    public double getSalary(){
        return salary;
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
    public String getCar(){
        return "Marka: " + myNewCar.mark + "\nModel: " + myNewCar.model+"\nRok wydania: "+myNewCar.madeYear+"\nWartość:"+myNewCar.value;
    }

    public void setCar(Car myCar){
        if(myNewCar.value<getSalary()){
            System.out.println("Udalo sie kupic samochod za gotowke");
            myNewCar=myCar;
        }
        else if(myNewCar.value/12<getSalary()){
            System.out.println("Udalo sie kupic samochod na kredyt");
            myNewCar=myCar;
        }
        else System.out.println("Idź po podwyzke, a potem mysl o kupnie samochodu!");
    }
}