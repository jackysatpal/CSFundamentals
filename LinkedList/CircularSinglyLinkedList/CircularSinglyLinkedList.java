package CircularSinglyLinkedList;

import java.util.NoSuchElementException;

public class CircularSinglyLinkedList<T> implements ListInterface<T> {
    private Node<T> head;
    private static int countNumberOfNodes;

    public CircularSinglyLinkedList() {
        this.head = null;
        CircularSinglyLinkedList.countNumberOfNodes = 0;
    }

    private void incrementSize() {
        CircularSinglyLinkedList.countNumberOfNodes++;
    }

    private void decrementSize() {
        CircularSinglyLinkedList.countNumberOfNodes--;
    }

    private Node<T> getTailReference() {
        Node<T> tail = this.head;

        while (tail.getNext() != this.head) {
            tail = tail.getNext();
        }

        return tail;
    }

    private void isListEmpty() {
        if (this.head == null) {
            throw new NoSuchElementException();
        }
    }

    private void isIndexOutOfRange(int index) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
    }

    public void addFirst(T data) {
        Node<T> node = new Node<>(data);

        if (this.head == null) {
            this.head = node;
            node.setNext(this.head);
            incrementSize();
        } else {
            Node<T> tail = getTailReference();

            node.setNext(this.head);
            this.head = node;
            tail.setNext(this.head);

            incrementSize();
        }
    }

    public void addLast(T data) {
        if (this.head == null) {
            addFirst(data);
        } else {
            Node<T> node = new Node<>(data);
            Node<T> tail = getTailReference();

            tail.setNext(node);
            node.setNext(this.head);

            incrementSize();
        }
    }

    public boolean add(T data) {
        if (this.head == null) {
            addFirst(data);
            return true;
        } else {
            addLast(data);
            return true;
        }
    }

    public void add(int index, T data) {
        isIndexOutOfRange(index);

        if (index == 1) {
            addFirst(data);
            return;
        }

        int counter = 1;
        Node<T> current = this.head;
        Node<T> node = new Node<>(data);

        while (counter != (index - 1)) {
            current = current.getNext();
            counter++;
        }

        node.setNext(current.getNext());
        current.setNext(node);

        incrementSize();
    }

    public int size() {
        return CircularSinglyLinkedList.countNumberOfNodes;
    }

    public void clear() {
        this.head = null;
        CircularSinglyLinkedList.countNumberOfNodes = 0;
    }

    public boolean contains(Object o) {
        Node<T> current = this.head;

        while (current.getNext() != this.head) {
            if (o == current.getData() || o.equals(current.getData())) {
                return true;
            }

            current = current.getNext();
        }

        return false;
    }

    public T get(int index) {
        isIndexOutOfRange(index);

        int counter = 1;
        Node<T> current = this.head;

        while (counter != index) {
            current = current.getNext();
            counter++;
        }

        return current.getData();
    }

    public T getFirst() {
        isListEmpty();
        return this.head.getData();
    }

    public T getLast() {
        isListEmpty();
        Node<T> tail = getTailReference();
        return tail.getData();
    }

    public T removeFirst() {
        isListEmpty();

        Node<T> tail = getTailReference();
        Node<T> current = this.head;

        tail.setNext(this.head.getNext());
        this.head = this.head.getNext();
        decrementSize();

        return current.getData();
    }

    public T removeLast() {
        isListEmpty();

        Node<T> tail = this.head;

        while (tail.getNext().getNext() != this.head) {
            tail = tail.getNext();
        }

        T data = tail.getNext().getData();
        tail.setNext(this.head);
        decrementSize();

        return data;
    }

    public T remove(int index) {
        isIndexOutOfRange(index);

        if (index == 1) {
            removeFirst();
        }

        if (index == size()) {
            removeLast();
        }

        int counter = 1;
        Node<T> tail = this.head;

        while (counter != (index - 1)) {
            tail = tail.getNext();
            counter++;
        }

        Node<T> deletedNode = tail.getNext();
        tail.setNext(tail.getNext().getNext());
        decrementSize();

        return deletedNode.getData();
    }

    public T set(int index, T data) {
        isIndexOutOfRange(index);

        int counter = 1;
        Node<T> current = this.head;
        T oldData = current.getData();

        while (current.getNext() != null) {
            if (counter == index) {
                oldData = current.getData();
                current.setData(data);
                break;
            }

            current = current.getNext();
            counter++;
        }

        return oldData;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        Node<T> current = this.head;

        System.out.print("head --> ");
        while (current != null) {
            sb.append(current.getData());
            sb.append(" ");
            current = current.getNext();

            if (current == this.head) {
                break;
            }
        }

        return sb.toString();
    }

}
