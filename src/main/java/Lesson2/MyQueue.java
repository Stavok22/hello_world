package Lesson2;

public class MyQueue<E> {
    private Node<E> first;
    private Node<E> last;
    private int size = 0;

    public MyQueue() {
        last = new Node<>(null, first, null);
        first = new Node<>(null, null, last);
    }

    //метод  add();
    public void add(E e) {
        Node<E> prev = last;
        prev.setCurrent(e);
        last  = new Node<>(null, prev, null);
        prev.setNext(last);
        size++;
    }

    //метод remove();
    public void remove(int index) {
        if(size == 0) {
            throw new IllegalArgumentException("List is empty");
        } else if (index == 0) {
            first=first.getNext();
            size--;
        } else if (index >= 1) {
            Node<E> nodeToRemove = first;
            for (int i = 0; i <= index; i++) {
                nodeToRemove = nodeToRemove.getNext();
            }
            nodeToRemove.getNext().setPrev(nodeToRemove.getPrev());
            nodeToRemove.getPrev().setNext(nodeToRemove.getNext());
            size--;
        }
    }

    //метод clear();
    public void clear() {
        this.last = new Node<>(null,first,null);
        this.first = new Node<>(null,null,last);
        this.size = 0;
    }

    //метод size();
    public int size() {
        return size;
    }
    //метод get();
    private E get(int index) {
        Node<E> target = first.getNext();
        for (int i = 0; i < index; i++) {
            target = getNextElement(target);
        }
        return target.getCurrent();
    }
    //метод peek();
    public E peek() {
        return get(0);
    }
    //метод poll()
    public E poll() {
        E res = get(0);
        remove(0);
        return res;
    }

    private Node<E> getNextElement(Node<E> current) {
        return current.getNext();
    }
    // метод display();
    public void display() {
        for (int i = 0; i < size(); i++) {
            System.out.print(get(i)+ " ");
        }
        System.out.println("");
    }

    private static class Node<E> {

        private E current;
        private Node<E> next;
        private Node<E> prev;

        public Node(E current, Node<E> prev, Node<E> next) {
            this.current = current;
            this.next = next;
            this.prev = prev;
        }

        public E getCurrent() {
            return current;
        }

        public void setCurrent(E current) {
            this.current = current;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }
    }
}
