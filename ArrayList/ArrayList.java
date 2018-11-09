package ArrayList;

import java.util.Arrays;

public class ArrayList<E> {
    private static final int DEFAULT_CAPACITY = 10;
    private E[] elements;
    private int count = 0;

    public ArrayList(){
        this.elements = (E[]) new Object[ArrayList.DEFAULT_CAPACITY];
    }

    private void incrementSize() {
        this.count++;
    }

    private void decrementSize() {
        this.count--;
    }

    private void isIndexOutOfRange(int index) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
    }

    private void hasArrayReachedCapacity() {
        int size = size();
        int length = this.elements.length;

        if (size >= length) {
            ensureCapacity();
        }
    }

    public boolean add(E element) {
        hasArrayReachedCapacity();

        this.elements[count] = element;
        incrementSize();

        return true;
    }

    public E add(int index, E element) {
        isIndexOutOfRange(index);
        incrementSize();
        hasArrayReachedCapacity();

        int counter = size();

        while(counter != index) {
            this.elements[counter] = this.elements[counter - 1];
            counter--;
        }

        E temp = this.elements[index];
        this.elements[index] = element;

        return temp;
    }

    public E set(int index, E element) {
        isIndexOutOfRange(index);
        E oldElement = this.elements[index];
        this.elements[index] = element;

        return oldElement;
    }

    public void ensureCapacity() {
        int newSize = ((this.elements.length * 3) / 2) + 1;
        this.elements = Arrays.copyOf(this.elements, newSize);
    }

    public boolean isEmpty(){
        return (this.count == 0);
    }

    public int size(){
        return this.count;
    }

    public void clear() {
        this.elements = (E[]) new Object[0];
        this.count = 0;
    }

    public boolean contains(Object o) {
        for (int i = 0; i < this.elements.length; i++) {
            if (this.elements[i] == o || this.elements[i].equals(o)) {
                return true;
            }
        }

        return false;
    }

    public E get(int index) {
        isIndexOutOfRange(index);
        return this.elements[index];
    }

    public E remove(int index) {
        isIndexOutOfRange(index);

        E element = this.elements[index];
        for (int i = index; i < this.elements.length - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }

        decrementSize();
        return element;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "ArrayList is Empty";
        }

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < this.elements.length; i++) {
            if (this.elements[i] != null) {
                sb.append(this.elements[i]);
                sb.append(" ");
            }
        }

        System.out.println();

        return sb.toString();
    }
}
