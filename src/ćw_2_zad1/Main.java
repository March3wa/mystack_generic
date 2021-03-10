package ćw_2_zad1;

import ćw_2_zad3.MyStack;
import ćw_2_zad3.Student;

public class Main {

    public static void main(String[] args) {
        MyStackZad1<Uczen> studenci = new MyStackZad1<>(4);

        Uczen s1 = new Uczen("Michal", 6);
        Uczen s2 = new Uczen("Jacek", 3);
        Uczen s3 = new Uczen("Marek", 4);
        Uczen s4 = new Uczen("Darek", 3);
        Uczen s5 = new Uczen("Mariusz", 5);
        Uczen s6 = new Uczen("Olek", 4);


        studenci.push(s1);
        studenci.push(s2);
        studenci.push(s3);
        studenci.push(s4);

        studenci.listItems();
        System.out.println("tu wyrzuci wyjatek:");
        studenci.push(s5);
        System.out.println(studenci.pop());
    }
}
