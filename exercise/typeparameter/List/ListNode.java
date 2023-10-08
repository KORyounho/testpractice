package typeparameter.List;

import java.util.Collection;
import java.util.Iterator;

public class ListNode<T> implements List<T> {
    private Node<T> head;

    public ListNode() {
        head = null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        Node newNode = new Node(t);
        if (head == null) {
            head = newNode;
            return true;
        } else {
            Node temp = head;
            while (temp.nextNode() != null) {
                temp = temp.nextNode();
            }
            temp.setNextNode(newNode);
            return true;
        }
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean contain(T t1) {
        Node temp = head;
        while(temp != null){
            if(temp.getInfo().equals(t1)){
                return true;
            }
            temp = temp.nextNode();
        }
        return false;
    }

    public void print() {
        Node newnode = this.head;
        while (newnode != null) {
            System.out.println(newnode.getInfo() + " ");
            newnode = newnode.nextNode();
        }
    }
}
