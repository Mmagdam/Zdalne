package devices;

import com.company.Human;
import com.company.sellable;

import java.util.Scanner;

public abstract class Device implements sellable {
    public String producer;
    public String model;
    public Double price;
    Scanner scanner = new Scanner(System.in);
    public abstract void turnOn();

    public Double value(Car garage[] ){
        Double suma=0.0;
        for(int i=0; i<garage.length; i++){
            suma =suma+garage[i].price;
        }
    return suma;
    };


    public void Sell(Human seller, Human buyer, Double price){
        System.out.println("Wybierz czy chcesz sprzedac telefon-1, czy samochod-2:");
        int n = scanner.nextInt();
        switch(n){
            case 1:
        if(seller.mobilePhone!=null){
            if(buyer.cash>=seller.mobilePhone.price) {
                buyer.cash= buyer.cash-seller.mobilePhone.price;
                seller.cash= seller.cash+seller.mobilePhone.price;
                buyer.mobilePhone=seller.mobilePhone;
                seller.mobilePhone=null;
                System.out.println("Transakcja sprzedazy telefonu zostala dokonana!");
            }
            System.out.println("Kupujacy nie ma wystarczajaco duzo pieniedzy");
        };
        System.out.println("Brak telefonow na sprzedaz");
        break;
            case 2:
                if(seller.myCar!=null) {
                    if(buyer.cash>=seller.myCar.price) {
                        buyer.cash= buyer.cash-seller.myCar.price;
                        seller.cash= seller.cash+seller.myCar.price;
                        buyer.myCar=seller.myCar;
                        seller.myCar=null;
                        System.out.println("Transakcja sprzedazy samochodu zostala dokonana!");
                    }
                    System.out.println("Kupujacy nie ma wystarczajaco duzo pieniedzy");
                };
                System.out.println("Brak samochodow na sprzedaz");
                break;
            default:
                System.out.println("Wybrales zla opcje!");
        }
    }

    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
