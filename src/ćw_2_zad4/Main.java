package ćw_2_zad4;

public class Main {

    public static void main(String[] args) {

        MyStackZ4<Sedzia> sedziowie = new MyStackZ4<>(2);

        Sedzia s1 = new Sedzia("Karol", 15);
        Sedzia s2 = new Sedzia("Maciej", 13);
        Sedzia s3 = new Sedzia("Arnold", 18);
        Sedzia s4 = new Sedzia("Kristof", 19);
        Sedzia s5 = new Sedzia("Olaf", 17);


        System.out.println(sedziowie.initialCapacity);
        sedziowie.push(s1);
        sedziowie.push(s2);
        System.out.println(sedziowie.initialCapacity);
        sedziowie.push(s3);
        sedziowie.listItems();
        System.out.println(sedziowie.initialCapacity);
        sedziowie.push(s4);
        sedziowie.push(s5);
        System.out.println(sedziowie.initialCapacity);
        sedziowie.pop();
        sedziowie.pop();
        sedziowie.pop();

        System.out.println(sedziowie.initialCapacity);
    }
}
