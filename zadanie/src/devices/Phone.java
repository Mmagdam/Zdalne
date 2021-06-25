package devices;

import com.company.sellable;

public class Phone extends Device implements sellable {

    public String operationSystem;
    public Double screenSize;

    public Phone(String producer, String model, String operationSystem, Double screenSize, Double price) {
        this.producer = producer;
        this.model = model;
        this.operationSystem = operationSystem;
        this.screenSize = screenSize;
        this.price=price;
    }

    public Phone() {

    }

    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", operationSystem=" + operationSystem +
                ", screenSize=" + screenSize +
                '}';
    }
    String getOSVersion() {
        return "4.23.1";
    }

    @Override
    public void turnOn() {

    }


}