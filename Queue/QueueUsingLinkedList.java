package Queue;

import java.util.NoSuchElementException;

public class QueueUsingLinkedList<E> implements QueueInterface<E> {

    private Node<E> front;
    private Node<E> rear;
    private int size;

    public QueueUsingLinkedList() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    private void incrementSize() {
        this.size++;
    }

    private void decrementSize() {
        this.size--;
    }

    private void isQueueEmpty() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return (this.front == null && this.rear == null);
    }

    public E peek() {
        isQueueEmpty();
        return this.front.getElement();
    }

    public void enqueue(E element) {
        Node<E> node = new Node<>(element);

        if (isEmpty()) {
            this.rear = node;
            this.front = node;
            incrementSize();
        } else {
            this.rear.setNext(node);
            this.rear = node;
            incrementSize();
        }
    }

    public E dequeue() {
        isQueueEmpty();
        E dequeueElement = this.front.getElement();
        this.front = this.front.getNext();
        decrementSize();

        return dequeueElement;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Queue is Empty";
        }

        StringBuilder sb = new StringBuilder();
        Node<E> temp = this.front;
        sb.append("front --> ");

        while (temp != this.rear) {
            sb.append(temp.getElement());
            sb.append(" --> ");
            temp = temp.getNext();
        }

        sb.append(temp.getElement());
        sb.append(" <-- rear");

        return sb.toString();
    }
}
