package SinglyLinkedList;

public class Node<T> {
    private T data;
    private Node<T> nextReference;

    public Node(T data) {
        setData(data);
        this.nextReference = null;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public Node<T> getNextReference() {
        return this.nextReference;
    }

    public void setNextReference(Node<T> nextReference) {
        this.nextReference = nextReference;
    }
}
