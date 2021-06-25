package devices;

import com.company.sellable;

public class Car extends Device implements sellable {
    public String mark;

    public Integer madeYear;
    public Integer value;


    public Car(String mark, String model, Integer madeYear, Integer value, Double price) {
        this.mark = mark;
        this.model = model;
        this.madeYear = madeYear;
        this.value = value;
        this.price = price;
    }

    public Car() {

    }

    @Override
    public boolean equals(Object other) {
        if(other instanceof Car){
            Car car = (Car) other;
            if(this.mark.equals(car.mark));{
            if(this.model.equals(car.model));{
            if(this.madeYear.equals(car.madeYear));{
            if(this.value.equals(car.value));{
                return true;
            }}}}
        }
        return false;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", madeYear=" + madeYear +
                ", value=" + value +
                '}';
    }

    @Override
    public void turnOn() {

    }


}
