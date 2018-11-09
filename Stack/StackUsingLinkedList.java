package Stack;

import java.util.EmptyStackException;

public class StackUsingLinkedList<E> implements StackInterface<E> {

    private Node<E> head;
    private int size;

    public StackUsingLinkedList() {
        this.head = null;
        this.size = 0;
    }

    private void incrementSize() {
        this.size++;
    }

    private void decrementSize() {
        this.size--;
    }

    private void isStackEmpty() {
        if (empty()) {
            throw new EmptyStackException();
        }
    }

    public boolean empty() {
        return (this.head == null);
    }

    public int size() {
        return this.size;
    }

    public E push(E element) {
        Node<E> node = new Node<>(element);

        if (this.head == null) {
            this.head = node;
            incrementSize();
        } else {
            node.setNext(this.head);
            this.head = node;
            incrementSize();
        }

        return element;
    }

    public E pop() {
        isStackEmpty();

        E element = this.head.getElement();
        Node<E> temp = this.head;
        this.head = this.head.getNext();
        temp = null;
        decrementSize();

        return element;
    }

    public E peek() {
        isStackEmpty();
        return this.head.getElement();
    }

    @Override
    public String toString() {
        if (empty()) {
            return "Stack is Empty";
        }

        StringBuffer sb = new StringBuffer();
        Node<E> current = this.head;

        while (current != null) {
            sb.append(current.getElement());

            if (current.getNext() != null) {
                sb.append(" --> ");
            }

            current = current.getNext();
        }

        System.out.println();
        return sb.toString();
    }
}
