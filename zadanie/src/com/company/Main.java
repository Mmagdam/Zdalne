package com.company;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Animal dog = new Animal("dog");
        dog.name = "Puszek";
        dog.feed();

        Phone iphone = new Phone("apple","S6","iOS",4.5);

        System.out.println("producer = " + iphone.producer);
        System.out.println("name = " + dog.name);

        Human me = new Human();
        me.mobilePhone = iphone;
        dog.feed();
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();

        Car clio = new Car();
        clio.mark = "Renault";
        clio.model = "Clio";
        clio.madeYear = 2020;
        me.myCar=clio;

        LocalDateTime data = LocalDateTime.now();
            double salary = me.getSalary();
            System.out.println("\nData pobrania wysokosci pensji: " + data +"\nWysokosc pensji:" +salary);

        System.out.println("Podaj nowa pensje:");
        double newSalary = scanner.nextDouble();
        if (newSalary<0){
            System.out.println("Wartosc wyplaty nie moze byc ujemna!");
        }
        else {
            System.out.println("Nowe dane zostaly wyslane do systemu ksiegowego.");
            System.out.println("Prosze odebrac aneks umowy od Pani Hani z kadr.");
            System.out.println("ZUS i US juz wiedza o zmianie wypaty wiec nie ma sensu ukrywac dochodu.");
            me.setSalary(newSalary);
        }
        System.out.println("\nData pobrania wysokosci pensji: " + data +"\nWysokosc pensji:" +me.getSalary());
    }
}