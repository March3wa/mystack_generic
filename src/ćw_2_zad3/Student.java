package ćw_2_zad3;

public class Student {
    String imie;
    int ocena;

    Student(String imie, int ocena){
        this.imie = imie;
        this.ocena = ocena;
    }

    @Override
    public String toString() {
        return  imie + ", " + ocena;
    }
}
