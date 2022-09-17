package org.example;

public class Nodes<T> {
    private T data;
    public Nodes<T> next;

    Nodes(T data){
        this.data = data;
        this.next = null;
    }

    T getNode(){
        return this.data;
    }
}
