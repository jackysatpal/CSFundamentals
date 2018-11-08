package CircularSinglyLinkedList;

public class Node<T> {
    private Node<T> next;
    private T data;

    public Node(T data) {
        setData(data);
        setNext(null);
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }
}
