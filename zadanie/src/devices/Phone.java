package devices;

public class Phone extends Device{

    public String operationSystem;
    public Double screenSize;

    public Phone(String producer, String model, String operationSystem, Double screenSize) {
        this.producer = producer;
        this.model = model;
        this.operationSystem = operationSystem;
        this.screenSize = screenSize;
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