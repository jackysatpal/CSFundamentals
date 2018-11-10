package Queue;

import java.util.NoSuchElementException;

public class QueueUsingArray<E> implements QueueInterface<E> {

    private E queue[];
    private int front;
    private int rear;
    private int size;

    public QueueUsingArray() {
        this.queue = (E[]) new Object[10];
        this.front = -1;
        this.rear = -1;
        this.size = 0;
    }

    private void incrementSize() {
        this.size++;
    }

    private void decrementSize() {
        this.size--;
    }

    private void incrementRear() {
        this.rear++;
    }

    private void incrementFront() {
        this.front++;
    }

    private void isQueueEmpty() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
    }

    public int size() {
        return this.size;
    }

    public E peek() {
        isQueueEmpty();
        return this.queue[front];
    }

    public boolean isEmpty() {
        return (this.front == -1 && this.rear == -1);
    }

    public void enqueue(E element) {
        if (isEmpty()) {
            incrementFront();
        } else if (this.rear == this.queue.length - 1) {
            throw new IndexOutOfBoundsException();
        }

        incrementRear();
        this.queue[this.rear] = element;
        incrementSize();
    }

    public E dequeue() {
        isQueueEmpty();
        E temp = this.queue[this.front];
        this.queue[this.front] = null;

        if (this.front == this.rear) {
            this.front = -1;
            this.rear = -1;
            decrementSize();
        } else {
            incrementFront();
            decrementSize();
        }

        return temp;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Queue is Empty";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("front --> ");
        for (int i = this.front; i <= this.rear; i++) {
            sb.append(this.queue[i]);
            sb.append(" ");
        }
        sb.append("<-- rear");
        return sb.toString();
    }

}
