package Stack;

import java.util.EmptyStackException;

public class StackUsingArray<E> implements StackInterface<E> {

    private E stack[];
    private int top;
    private final static int SIZE = 5;

    public StackUsingArray() {
        this.stack = (E[]) new Object[StackUsingArray.SIZE];
        this.top = -1;
    }

    private void incrementSize() {
        this.top++;
    }

    private void decrementSize() {
        this.top--;
    }

    private void isStackFull() {
        if (this.top == this.stack.length) {
            throw new IndexOutOfBoundsException("Stack overflow");
        }
    }

    private void isStackEmpty() {
        if (empty()) {
            throw new EmptyStackException();
        }
    }

    public boolean empty() {
        return (this.top == -1);
    }

    public E push(E item) {
        isStackFull();
        incrementSize();
        this.stack[this.top] = item;

        return item;
    }

    public E pop() {
        isStackEmpty();
        E temp = this.stack[this.top];
        decrementSize();

        return temp;
    }

    public E peek() {
        isStackEmpty();
        return this.stack[top];
    }

    public int size() {
        return this.top + 1;
    }

    @Override
    public String toString() {
        if (empty()) {
            return "Stack is Empty";
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <= this.top; i++) {
            sb.append(this.stack[i]);
            sb.append(" ");
        }

        System.out.println();
        return sb.toString();
    }
}
