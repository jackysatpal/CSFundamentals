package ArrayList;

import java.util.Arrays;

public class ArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int count = 0;

    public ArrayList(){
        this.elements = new Object[this.DEFAULT_CAPACITY];
    }

    public void add(Object element) {
        if (this.count == this.elements.length) {
            ensureCapacity();
        }

        this.elements[count] = element;
        this.count++;
    }

    public void add(int index, Object element) {
        if (this.count == this.elements.length) {
            ensureCapacity();
        }

        this.elements[index] = element;
        this.count++;
    }

    public void set(int index, Object element) {
        if (index >= 0 && index < this.elements.length) {
            this.elements[index] = element;
        } else {
            throw new IndexOutOfBoundsException();
        }
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
        this.elements = new Object[0];
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

    public Object get(int index) {
        if (index >= 0 && index < this.elements.length) {
            return this.elements[index];
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public void remove(int index) {
        if (index >= 0 && index < this.elements.length) {
            for (int i = index; i < this.elements.length - 1; i++) {
                this.elements[i] = this.elements[i + 1];
            }
            this.count--;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public void printElements() {
        for (Object i : this.elements) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
