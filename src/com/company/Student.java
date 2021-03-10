package com.company;

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
