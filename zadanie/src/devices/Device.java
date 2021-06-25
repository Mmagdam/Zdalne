package devices;

public abstract class Device {
    public String producer;
    public String model;


    public abstract void turnOn();

    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
