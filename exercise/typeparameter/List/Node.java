package typeparameter.List;

public class Node<T> {
    private T t;
    private Node nextNode;

    public Node(){

    }

    public Node(T t){
        this.t = t;
        this.nextNode = null;
    }

    public Node nextNode(){
        return this.nextNode;
    }

    public void setNextNode(Node node){
        this.nextNode = node;
    }
    public T getInfo(){
        return t;
    }
}
