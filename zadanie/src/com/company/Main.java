package com.company;

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

        Car myCar= new Car(null, null, null, 0.0);

        System.out.println(me.getSSalary());
        System.out.println("Podaj nowa pensje:");
        double newSalary = scanner.nextDouble();
        me.setSalary(newSalary);
        System.out.println(me.getSSalary());

        me.setCar(myCar);
        System.out.println("Samochod:\n" +me.getCar());

    }
}