package ćw_2_zad1;

import ćw_2_zad3.Stack;

import java.util.EmptyStackException;

public class MyStackZad1<T> implements Stack {
    int topInd;
    T [] table;
    @SuppressWarnings("unchecked")
    MyStackZad1(int capacity){
        table = (T[]) new Object[capacity];
    }
    @Override
    public void push(Object element)throws ArrayIndexOutOfBoundsException {
        if(!isFull()){
            table[topInd++] = (T) element;
        }
        else throw new ArrayIndexOutOfBoundsException("Miejsce na stosie skończyło się");
    }

    @Override
    public T pop() {
        if(!isEmpty()) {
            return table[--topInd];
        }
        else throw new EmptyStackException();
    }

    @Override
    public T top() {
        if(!isEmpty()) {
            return table[topInd];
        }
        else throw new EmptyStackException();
    }

    @Override
    public boolean isEmpty() throws EmptyStackException {
        return topInd == 0;
    }

    @Override
    public boolean isFull() {
        return topInd == table.length;
    }

    @Override
    public int size() {
        return topInd;
    }
    @Override
    @SuppressWarnings("unchecked")
    public void clear(){
        T [] temp = (T[]) new Object[table.length];
        table = temp;
        topInd = 0;
    }
    public void listItems(){
        for (int i = size()-1; i >= 0; i--) {
            System.out.println(table[i]);
        }
    }
}
