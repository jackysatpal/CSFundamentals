package Queue;

import java.util.NoSuchElementException;

public class CircularQueueUsingArray<E> implements QueueInterface<E> {

    private E queue[];
    private int front;
    private int rear;
    private int size;

    public CircularQueueUsingArray() {
        this.queue = (E[]) new Object[5];
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
        this.rear = (this.rear + 1) % this.queue.length;
    }

    private void incrementFront() {
        this.front = (this.front + 1) % this.queue.length;;
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
        int i = this.front;

        while (true) {
            if (this.queue[i] != null) {
                sb.append(this.queue[i]);
                sb.append(" ");
            }
            i = (i + 1) % this.queue.length;

            if (i == this.front) {
                break;
            }
        }

        return sb.toString();
    }

}
