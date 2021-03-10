package ćw_2_zad3;

import java.util.EmptyStackException;

public interface Stack <T> {
    void push(T element);
    T pop();
    T top();
    boolean isEmpty() throws EmptyStackException;
    boolean isFull();
    int size();
    void clear();
}
