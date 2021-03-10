package ćw_2_zad1;

public class Uczen {
    String imie;
    int ocena;

    Uczen(String imie, int ocena){
        this.imie = imie;
        this.ocena = ocena;
    }

    @Override
    public String toString() {
        return  imie + ", " + ocena;
    }
}
