package SinglyLinkedList;

import java.util.NoSuchElementException;

public class SinglyLinkedList<T> implements ListInterface<T> {
    private Node<T> head;
    private static int countNodes;

    public SinglyLinkedList() {
        this.head = null;
        SinglyLinkedList.countNodes = 0;
    }

    private void incrementSize() {
        SinglyLinkedList.countNodes++;
    }

    private void decrementSize() {
        SinglyLinkedList.countNodes--;
    }

    private void isIndexOutOfRange(int index) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
    }

    private void isListEmpty() {
        if (this.head == null) {
            throw new NoSuchElementException();
        }
    }

    private Node<T> getTailReference() {
        Node<T> tail = this.head;

        while (tail.getNext() != null) {
            tail = tail.getNext();
        }

        return tail;
    }

    public void clear() {
        this.head = null;
        SinglyLinkedList.countNodes = 0;
    }

    public void addFirst(T element) {
          Node<T> node = new Node<>(element);
          node.setNext(this.head);
          this.head = node;

          incrementSize();
    }

    public void addLast(T element) {
        Node<T> node = new Node<>(element);
        Node<T> tail = getTailReference();
        tail.setNext(node);

        incrementSize();
    }

    public boolean add(T element) {
        if (this.head == null) {
            addFirst(element);
            return true;
        } else {
            addLast(element);
            return true;
        }
    }

    public void add(int index, T element) {
        isIndexOutOfRange(index);

        if (index == 1) {
            addFirst(element);
            return;
        }

        int counter = 0;
        Node<T> current = this.head;
        Node<T> node = new Node<>(element);

        while (counter != (index - 1)) {
            current = current.getNext();
            counter++;
        }

        node.setNext(current.getNext());
        current.setNext(node);
        incrementSize();
    }

    public T get(int index) {
        isIndexOutOfRange(index);

        int counter = 1;
        Node<T> current = this.head;
        T data = current.getData();

        while(current.getNext() != null) {
            if (counter == index) {
                data = current.getData();
                break;
            }

            counter++;
            current = current.getNext();
        }

        return data;
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

    public int size() {
        return SinglyLinkedList.countNodes;
    }

    public T removeFirst() {
        isListEmpty();

        T data = this.head.getData();
        this.head = head.getNext();
        decrementSize();

        return data;
    }

    public T removeLast() {
        isListEmpty();

        T data;
        Node<T> tail = this.head;
        int size = size();
        int counter = 1;

        while (counter != size - 1) {
            counter++;
            tail = tail.getNext();
        }

        data = tail.getNext().getData();
        tail.setNext(null);
        decrementSize();

        return data;
    }

    public T remove(int index) {
        isIndexOutOfRange(index);

        int counter = 0;
        Node<T> current = this.head;
        T data;

        while (counter != (index - 1)) {
            counter++;
            current = current.getNext();
        }

        data = current.getNext().getData();
        current.setNext(current.getNext().getNext());
        decrementSize();

        return data;
    }

    public T set(int index, T element) {
        isIndexOutOfRange(index);

        int counter = 0;
        Node<T> current = this.head;
        T data;

        while (counter != index) {
            counter++;
            current = current.getNext();
        }

        data = current.getData();
        current.setData(element);

        return data;
    }

    public boolean contains(Object e) {
        Node<T> current = this.head;

        while (current.getNext() != null) {
            if (current.getData() == e || current.getData().equals(e)) {
                return true;
            }

            current = current.getNext();
        }

        return false;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        Node<T> current = this.head;

        System.out.print("head --> ");

        while(current != null) {
            sb.append(current.getData());

            if (current.getNext() != null) {
                sb.append(" --> ");
            }

            current = current.getNext();
        }

        return sb.toString();
    }

}