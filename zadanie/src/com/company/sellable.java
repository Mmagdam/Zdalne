package com.company;

public interface sellable {

    Object IndexOutOfBoundsException = "błąd";

    static void sell(Human seller, Human buyer, Double price){
    if(buyer.cash>=price) {
        buyer.cash= buyer.cash-price;
        seller.cash= seller.cash+price;
        if(seller.mobilePhone!=null&&price== seller.mobilePhone.price){
        buyer.mobilePhone=seller.mobilePhone;
        seller.mobilePhone=null;}
        else if(seller.pet!=null&&price== seller.pet.price){
            buyer.pet=seller.pet;
            seller.pet=null;}
        else if (seller.myCar!=null&&price== seller.myCar.price){
            for(int i=0; i<seller.garage.length;i++){
                if(seller.garage[i]==null){
                    System.out.println(IndexOutOfBoundsException);
                }}
            for(int i=0; i<buyer.garage.length;i++){
                if(buyer.garage[i]!=null){
                    System.out.println(IndexOutOfBoundsException);
                }}
            buyer.myCar=seller.myCar;
            seller.myCar=null;}
        System.out.println("Transakcja sprzedazy zostala dokonana!");
    }
       else System.out.println(IndexOutOfBoundsException);
            }}

