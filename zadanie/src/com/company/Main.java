package com.company;

import creatures.Pet;
import devices.Car;
import devices.Phone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pet dog = new Pet("dog", null, null, 1000.0);
        dog.name = "Puszek";
        dog.weight = 20.0;
        dog.feed();

        Phone iphone = new Phone("apple", "S6", "iOS", 4.5, 1500.0);

        System.out.println("producer = " + iphone.producer);
        System.out.println("name = " + dog.name);

        Human me = new Human("Jan", "Kowalski", 35, "mezczyzna", 50000.0, null, null, null);
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

        Car myCar = new Car(null, null, null, 0, 0.0);
        Car golf1 = new Car("Volkswagen", "Golf", 2010, 20000, 25000.0);
        Car golf2 = new Car("Volkswagen", "Golf", 2010, 20000, 1500.0);
        System.out.println(me.getSSalary());
        System.out.println("Podaj nowa pensje:");
        double newSalary = scanner.nextDouble();
        me.setSalary(newSalary);
        System.out.println(me.getSSalary());

        me.setCar(myCar);
        System.out.println("Samochod:\n" + me.getCar());
        System.out.println("Czy oba samochody sa rowne:" + golf1.equals(golf2));
        System.out.println("Samochod 1:" + golf1);
        System.out.println("Samochod 2:" + golf2);
        System.out.println("Czlowiek:" + me);
        System.out.println("Telefon:" + iphone);
        System.out.println("Zwierzak:" + dog);

        Phone xiaomi = new Phone("Xiaomi", "Redmi Note 7", "Android", 5.5, 1000.0);
        Human seller = new Human("Jan", "Kowalski", 35, "mezczyzna", 50000.0, xiaomi, null, golf2);
        Human buyer = new Human("Aleksandra", "Nowak", 28, "kobieta", 2000.0, null, null, null);
        System.out.println("\n\nSprzedajacy przed transakcja:" + seller);
        System.out.println("Kupujacy przed transakcja:" + buyer);


        System.out.println("Wybierz co chcesz sprzedac! \n1-telefon\n2-samochod\n3-zwierzaka\n4-czlowieka");
        int n = scanner.nextInt();
        switch(n){
            case 1:
                if(seller.mobilePhone!=null){
                    sellable sellPhone = new Phone();
                    sellable.sell(seller, buyer, seller.mobilePhone.price);
                }
                else System.out.println("Brak telefonow na sprzedaz");
                break;
            case 2:
                if(seller.myCar!=null) {
                    sellable sellPhone = new Car();
                    sellable.sell(seller, buyer, seller.myCar.price);
                    }
                else System.out.println("Brak samochodow na sprzedaz");
                break;
            case 3:
                if (seller.pet!=null) {
                    sellable sellPet = new Pet(null, null, null, null);
                    sellable.sell(seller, buyer, seller.pet.price);
                }
                else System.out.println("Brak zwierzat na sprzedaz");
                break;
            case 4:
                System.out.println("Handel ludzmi jest niemozliwy!");
                break;
            default:
                System.out.println("Wybrales zla opcje!");
        }

        System.out.println("\n\nSprzedajacy po transakcji:" + seller);
        System.out.println("Kupujacy po transakcji:" + buyer);
    }}

