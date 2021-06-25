package devices;

public class Car extends Device{
    public String mark;

    public Integer madeYear;
    public Integer value;


    public Car(String mark, String model, Integer madeYear, Integer value) {
        this.mark = mark;
        this.model = model;
        this.madeYear = madeYear;
        this.value = value;
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
