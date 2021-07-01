package devices;

public class URL {
    public String nazwa;
    public String wersja;
    public String adresSerwera;

    public URL(String nazwa, String wersja, String adresSerwera){
        this.nazwa=nazwa;
        this.wersja=wersja;
        this.adresSerwera=adresSerwera;
    }
    public String toString(){
        return "Aplikacja{" +
                "nazwa='" + nazwa + '\'' +
                ", wersja='" + wersja + '\'' +
                ", adresSerwera=" + adresSerwera +
                '}';
    }

}
