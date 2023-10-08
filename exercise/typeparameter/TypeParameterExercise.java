//
//package typeparameter;
//
//public class TypeParameterExercise {
//    interface List<E> {
//        void add(E e);
//
//        boolean remove(E e);
//
//        boolean contains(E e);
//    }
//
//    class Node<T> {
//        T data;
//        Node<T> nextNode;
//
//        public Node(T data) {
//            this.data = data;
//            this.nextNode = null;
//        }
//
//        public Node<T> nextNode() {
//            return this.nextNode;
//        }
//
//        public void setNextNode(Node<T> nextNode) {
//            this.nextNode = nextNode;
//        }
//    }
//
//    public class ListNode<T> implements List<T> {
//        Node<T> node;
//
//        public void add(T e) {
//            if (node.nextNode() == null) {
//                this.node = new Node<T>(e);
//            } else {
//                this.node.setNextNode(new Node<T>(e));
//            }
//        }
//
//        @Override
//        public boolean remove(T t) {
//
//        }
//
//        @Override
//        public boolean contains(T t) {
//            return false;
//        }
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
//
