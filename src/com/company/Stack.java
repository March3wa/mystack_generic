package com.company;

import java.util.EmptyStackException;

public interface Stack <T> {
    void push(T element);
    T pop();
    T top();
    boolean isEmpty() throws EmptyStackException;
    boolean isFull() throws ArrayIndexOutOfBoundsException;
    int size();
    void clear();
}
