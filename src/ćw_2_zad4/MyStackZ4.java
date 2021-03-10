package ćw_2_zad4;

import ćw_2_zad3.Stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStackZ4<T> {

    int topInd;
    T [] table;
    int initialCapacity;
    @SuppressWarnings("unchecked")
    MyStackZ4(int capacity){
        table = (T[]) new Object[capacity];
        this.initialCapacity = capacity;
    }
    public void push(Object element) {
        table[topInd++] = (T) element;
        sizeUpdate();
    }
    public T pop() {
        if(!isEmpty()) {
            T obj = table[--topInd];
            sizeUpdate();
            return obj;
        }
        else{
            sizeUpdate();
            throw new EmptyStackException();
        }
    }
    public T top() {
        if(!isEmpty()) {
            sizeUpdate();
            return table[topInd];
        }
        else{
            sizeUpdate();
            throw new EmptyStackException();
        }
    }
    public boolean isEmpty() throws EmptyStackException {
        return topInd == 0;
    }
    public int size() {
        return topInd;
    }
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
    void sizeUpdate() {
        T[] temp;
        if ((double) topInd / initialCapacity >= 0.75) {
            temp = Arrays.copyOf(table, initialCapacity*2);
            initialCapacity = temp.length;
            table = temp;
        }
        if ((double) topInd / initialCapacity <= 0.25) {
            temp = Arrays.copyOf(table, initialCapacity/2);
            initialCapacity = temp.length;
            table = temp;
        }
    }
}
