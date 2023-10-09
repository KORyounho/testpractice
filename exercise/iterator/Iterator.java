package iterator;

import typeparameter.List.Node;

public class Iterator<E>{
    Node<E> node;

    public Iterator(){
    }

    public boolean insert(E e){
        Node<E> newNode = new Node<>(e);
        if (node == null) {
            node = newNode;
            return true;
        }
        Node<E> temp = node;
        while(temp.nextNode() != null){
            temp = temp.nextNode();
        }
        temp.setNextNode(newNode);
        return true;
    }


    public boolean hasNext(){
        if(node.nextNode() != null){
            return true;
        }
        return false;
    }
    public E next(){
        if(hasNext()){
            node = node.nextNode();
            return node.getInfo();
        }
        else{
            throw new IllegalArgumentException("요서 없음");
        }
    }
}