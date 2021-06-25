package creatures;

import com.company.Human;
import com.company.sellable;

public abstract class Animal implements sellable, Feedable{

    public String species;
    public String name;
    public Double weight;
    public Double price;

    public Animal(String species, String name, Double weight, double price) {
        this.species=species;
        this.name=name;
        this.weight=weight;
        this.price=price;
    }

    static public final Double DEFAULT_ANIMAL_WEIGHT = 1.0;

    public Animal() {
        this.species = species;

        switch (this.species) {
            case "dog":
                this.weight = 20.0;
                break;
            case "cat":
                this.weight = 2.0;
                break;
            case "cow":
                this.weight = 400.0;
                break;
            default:
                this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    public Animal(String species, String name, Double weight, Double price) {
    }


    public void feed() {
        if(weight > 0){
            this.weight += 1;
            System.out.println("thx for food. My weight is now: " + this.weight);
        }else {
            System.out.println("too late, sorry");
        }
    }

    public void takeForAWalk() {
        if(this.weight > 0){
            this.weight -= 1;
            System.out.println("thx for a walk, my weight is now " + this.weight);
        } else {
            System.out.println("U CANNOT WALK THE STREET WITH DEAD ANIMAL IDIOT!");
        }
    }

    public void Sell(Human seller, Human buyer, Double price){
        if (seller.pet!=null) {
            if(buyer.cash>=seller.pet.price) {
                buyer.cash= buyer.cash-seller.pet.price;
                seller.cash= seller.cash+seller.pet.price;
                buyer.pet=seller.pet;
                seller.pet=null;
                System.out.println("Transakcja sprzedazy zwierzaka zostala dokonana!");
            }
            System.out.println("Kupujacy nie ma wystarczajaco duzo pieniedzy");
        };
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }


}