package org.example;

public class ListNode<T> {
    Node<T> node;

    public ListNode(){
    }

    public T get(int index){
        Node<T> temp = node;
        for(int i = 0; i<index; i++){
            temp = temp.getNext();
        }
        return temp.getInfo();
    }

    public void add(T t){
        Node<T> newNode = new Node<>(t);
        if(node == null){
            node = newNode;
            return;
        }
        else {
            Node<T> temp = node;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNode);
        }
    }
}
