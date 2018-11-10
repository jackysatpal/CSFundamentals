package Queue;

public class Node<E> {

    private E element;
    private Node<E> next;

    public Node(E element) {
        setNext(null);
        setElement(element);
    }

    public E getElement() {
        return this.element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public Node<E> getNext() {
        return this.next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}
