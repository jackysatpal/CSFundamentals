package DoublyLinkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedList<T> implements ListInterface<T> {
    private Node<T> head;
    private static int countNumberOfNodes;

    public DoublyLinkedList() {
        this.head = null;
        DoublyLinkedList.countNumberOfNodes = 0;
    }

    private void incrementSize() {
        DoublyLinkedList.countNumberOfNodes++;
    }

    private void decrementSize() {
        DoublyLinkedList.countNumberOfNodes--;
    }

    private Node<T> getTailReference() {
        Node<T> temp = this.head;

        while (temp.getNext() != null) {
            temp = temp.getNext();
        }

        return temp;
    }

    private void isIndexOutOfRange(int index){
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
    }

    private void isListEmpty() {
        if (size() == 0) {
            throw new NoSuchElementException("List is empty");
        }
    }

    public int size() {
        return DoublyLinkedList.countNumberOfNodes;
    }

    public void clear() {
        this.head = null;
        DoublyLinkedList.countNumberOfNodes = 0;
    }

    public void addFirst(T data) {
        Node<T> node = new Node<>(data);

        if (this.head == null) {
            this.head = node;
            incrementSize();
        } else {
            node.setNext(this.head);
            this.head.setPrevious(node);
            head = node;

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
            node.setPrevious(tail);
            node.setNext(null);

            incrementSize();
        }
    }

    public boolean add(T data) {
        if (this.head == null) {
            addFirst(data);
            return true;
        }

        addLast(data);
        return true;
    }

    public void add(int index, T data) {
        isIndexOutOfRange(index);

        if (index == 1) {
            addFirst(data);
            return;
        }

        int counter = 1;
        Node<T> temp = this.head;
        Node<T> node = new Node<>(data);

        while (counter != (index - 1)) {
            temp = temp.getNext();
            counter++;
        }

        node.setNext(temp.getNext());
        node.setPrevious(temp);
        temp.setNext(node);
        node.getNext().setPrevious(node);

        incrementSize();
    }

    public boolean contains(Object o) {
        Node<T> temp = this.head;

        while (temp.getNext() != null) {
            if (o == temp.getData() || o.equals(temp.getData())) {
                return true;
            }

            temp = temp.getNext();
        }
        return false;
    }

    public T getFirst() {
        return this.head.getData();
    }

    public T getLast() {
        Node<T> tail = getTailReference();
        return tail.getData();
    }

    public T get(int index) {
        int counter = 1;
        Node<T> temp = this.head;
        T data = temp.getData();

        isIndexOutOfRange(index);

        if (index == 1) {
            getFirst();
        }

        if (index == size()) {
            getLast();
        }

        while (temp.getNext() != null) {
            if (counter == index) {
                data = temp.getData();
                break;
            }

            temp = temp.getNext();
            counter++;
        }

        return data;
    }

    public T removeFirst() {
        isListEmpty();

        T data = this.head.getData();
        this.head = this.head.getNext();
        this.head.setPrevious(null);
        decrementSize();

        return data;
    }

    public T removeLast() {
        isListEmpty();

        Node<T> tail = getTailReference();
        T data = tail.getData();
        tail = tail.getPrevious();
        tail.setNext(null);
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
        Node<T> temp = this.head;
        T data = temp.getData();

        while (temp.getNext() != null) {
            if (counter == index) {
                data = temp.getData();
                temp.getNext().setPrevious(temp.getPrevious());
                temp.getPrevious().setNext(temp.getNext());
                break;
            }

            temp = temp.getNext();
            counter++;
        }

        return data;
    }

    public T set(int index, T data) {
        isIndexOutOfRange(index);

        int counter = 1;
        Node<T> current = this.head;

        while (counter != index) {
            current = current.getNext();
            counter++;
        }
        T oldData = current.getData();
        current.setData(data);

        return oldData;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        Node<T> temp = this.head;

        System.out.print("head --> ");
        while (temp != null) {
            sb.append(temp.getData());
            if (temp.getNext() != null) {
                sb.append("<-->");
            }
            sb.append(" ");
            temp = temp.getNext();
        }

        return sb.toString();
    }

}
