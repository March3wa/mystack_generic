package ćw_2_zad4;

public class Sedzia {
    String imie;
    int ocena;

    Sedzia(String imie, int ocena){
        this.imie = imie;
        this.ocena = ocena;
    }

    @Override
    public String toString() {
        return  imie + ", " + ocena;
    }
}
