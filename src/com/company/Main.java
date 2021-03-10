package com.company;

public class Main {

    public static void main(String[] args) {
        MyStack<Student> studenci = new MyStack<>(4);

        Student s1 = new Student("Michal", 6);
        Student s2 = new Student("Jacek", 3);
        Student s3 = new Student("Marek", 4);
        Student s4 = new Student("Darek", 3);
        Student s5 = new Student("Mariusz", 5);
        Student s6 = new Student("Olek", 4);

        studenci.push(s1);
        studenci.push(s2);
        studenci.push(s3);

        studenci.listItems();
        studenci.push(s4);
        System.out.println();
        studenci.listItems();
        System.out.println();
        studenci.push(s6);
        studenci.push(s5);
        studenci.listItems();
    }
}
