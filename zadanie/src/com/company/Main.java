package com.company;

import devices.Car;
import devices.Phone;

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

        Car myCar= new Car(null, null, null, 0);
        Car golf1= new Car("Volkswagen", "Golf", 2010, 20000);
        Car golf2= new Car("Volkswagen", "Golf", 2010, 20000);
        System.out.println(me.getSSalary());
        System.out.println("Podaj nowa pensje:");
        double newSalary = scanner.nextDouble();
        me.setSalary(newSalary);
        System.out.println(me.getSSalary());

        me.setCar(myCar);
        System.out.println("Samochod:\n" +me.getCar());
        System.out.println("Czy oba samochody sa rowne:"+golf1.equals(golf2));
        System.out.println("Samochod 1:"+golf1);
        System.out.println("Samochod 2:"+golf2);
        System.out.println("Czlowiek:"+me);
        System.out.println("Telefon:"+iphone);
        System.out.println("Zwierzak:"+dog);
    }



}