package com.company;

import java.util.EmptyStackException;

public class MyStack<T> implements Stack{

    int topInd;
    T [] table;
    @SuppressWarnings("unchecked")
    MyStack(int capacity){
        table = (T[]) new Object[capacity];
    }
    @Override
    public void push(Object element) {
        if(isFull()){
            for (int i = 0; i < table.length-1; i++) {
                table[i] = table[i+1];
            }
            table[table.length-1]= (T) element;
        }
        else table[topInd++] = (T) element;
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
