package org.example;

public class Node<T> {
    private T t;
    private Node<T> next;

    public Node(T t){
        this.t = t;
        this.next = null;
    }

    public Node(){

    }
    public T getInfo() {
        return t;
    }

    public void setNext(Node<T> node){
        this.next = node;
    }

    public Node<T> getNext(){
        if(this.next != null){
            return this.next;
        }
        return null;
    }
}
