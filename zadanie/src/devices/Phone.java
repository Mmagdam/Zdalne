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
    public void installAnnApp1 (String nazwa){
    }
    public void installAnnApp2 (String nazwa, String wersja){
    }
    public void installAnnApp3 (String nazwa, String wersja, String adresSerwera){
    }
    public void installAnnApp4 (String lista){
    }
    public void installAnnApp5 (URL obiekt){
    }

    static final String domyslnyAdres = "https://play.google.com/store";
    static final String domyslnaWersja = "1.0";
    static final String domyslnyProtokol = "4200";




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