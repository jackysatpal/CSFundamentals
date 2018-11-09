package Stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackUsingArrayList<E> implements StackInterface<E> {

    private E[] stack;
    private int top;

    public StackUsingArrayList() {
        this.stack = (E[]) new Object[10];
        this.top = -1;
    }

    private void incrementSize() {
        this.top++;
    }

    private void decrementSize() {
        this.top--;
    }

    private void ensureCapacity() {
        int newSize = (((this.stack.length * 3) / 2) + 1);
        this.stack = Arrays.copyOf(this.stack, newSize);
    }

    public int size() {
        return this.top + 1;
    }

    private void isStackEmpty() {
        if (top == -1) {
            throw new EmptyStackException();
        }
    }

    public boolean empty() {
        return (this.top == -1);
    }

    public E push(E element) {
        if (size() >= this.stack.length - 1) {
            ensureCapacity();
        }

        incrementSize();
        this.stack[this.top] = element;

        return element;
    }

    public E pop() {
        isStackEmpty();
        E temp = this.stack[this.top];
        decrementSize();

        return temp;
    }

    public E peek() {
        isStackEmpty();
        return this.stack[this.top];
    }

    @Override
    public String toString() {
        if (empty()) {
            return "Stack is Empty";
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <= this.top; i++) {
            sb.append(this.stack[i]);
            sb.append(" ");
        }

        System.out.println(" ");
        return sb.toString();
    }
}
