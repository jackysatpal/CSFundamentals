package SinglyLinkedList;

import java.util.List;

public class SinglyLinkedList<T> implements ListInterface<T> {
    private Node<T> head;
    private int countNodes;

    public SinglyLinkedList() {
        this.head = null;
        this.countNodes = 0;
    }

    @Override
    public void clear() {
        this.head = null;
        this.countNodes = 0;
    }

    @Override
    public void addFirst(T element) {
          Node<T> newNode = new Node<>(element);
          newNode.setNextReference(head);
          head = newNode;
          countNodes++;
    }

    @Override
    public void addLast(T element) {
        Node<T> newNode = new Node<T>(element);
        Node<T> temp = head;

        while (temp.getNextReference() != null) {
            temp = temp.getNextReference();
        }

        temp.setNextReference(newNode);
        countNodes++;
    }

    @Override
    public boolean add(T element) {
        Node<T> newNode = new Node<T>(element);
        Node<T> temp = head;

        if (head == null) {
            head = newNode;
            countNodes++;
            return true;
        }

        while (temp.getNextReference() != null) {
            temp = temp.getNextReference();
        }

        temp.setNextReference(newNode);
        countNodes++;
        return true;
    }

    @Override
    public void add(int index, T element) {
        int count = 0;
        Node<T> temp = head;
        Node<T> newNode = new Node<T>(element);

        while (temp != null && count != (index - 1)) {
            temp = temp.getNextReference();
            count++;
        }

        newNode.setNextReference(temp.getNextReference());
        temp.setNextReference(newNode);
        countNodes++;
    }

    @Override
    //doubt in this method. return type of T
    public T get(int index) {
        int count = 0;
        int size = size();
        Node<T> temp = head;
        T data = temp.getData();

        while(index < size && temp != null) {
            if (count == index) {
                data = temp.getData();
                break;
            }

            count++;
            temp = temp.getNextReference();
        }

        return data;
    }

    @Override
    public T getFirst() {
        return head.getData();
    }

    @Override
    public T getLast() {
        Node<T> temp = head;

        while (temp.getNextReference() != null) {
            temp = temp.getNextReference();
        }

        return temp.getData();
    }

    @Override
    public int size() {
        return this.countNodes;
    }

    @Override
    public T removeFirst() {
        T data = head.getData();
        head = head.getNextReference();
        countNodes--;
        return data;
    }

    @Override
    public T removeLast() {
        T data;
        Node<T> temp = head;
        int size = size();
        int count = 1;

        while (count != size - 1) {
            count++;
            temp = temp.getNextReference();
        }

        data = temp.getNextReference().getData();
        temp.setNextReference(null);
        countNodes--;
        return data;
    }

    @Override
    public T remove(int index) {
        int count = 0;
        Node<T> temp = head;
        T data;

        if (index == (size() - 1)) {
            return removeLast();
        }

        while (count != (index - 1)) {
            count++;
            temp = temp.getNextReference();
        }

        data = temp.getNextReference().getData();
        temp.setNextReference(temp.getNextReference().getNextReference());
        countNodes--;
        return data;
    }

    @Override
    public T set(int index, T element) {
        int count = 0;
        Node<T> temp = head;
        T data;

        while (count != index) {
            count++;
            temp = temp.getNextReference();
        }

        data = temp.getData();
        temp.setData(element);
        return data;
    }

    @Override
    public boolean contains(Object e) {
        Node<T> temp = head;

        while (temp != null) {
            if (temp.getData() == e || temp.getData().equals(e)) {
                return true;
            }

            temp = temp.getNextReference();
        }

        return false;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        Node<T> temp = head;

        while(temp != null) {
            sb.append(temp.getData());
            sb.append(" ");
            temp = temp.getNextReference();
        }

        return sb.toString();
    }
}
