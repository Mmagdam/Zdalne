package com.company;

public interface sellable {
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
            buyer.myCar=seller.myCar;
            seller.myCar=null;}
        System.out.println("Transakcja sprzedazy zostala dokonana!");
    }
       else System.out.println("Kupujacy nie ma wystarczajaco duzo pieniedzy");
            }}

