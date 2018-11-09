package Array;

public class Array<E> {
    private E[] elements;
    private int count;

    public Array() {
        this.elements = (E[]) new Object[10];
        this.count = 0;
    }

    private void incrementSize() {
        this.count++;
    }

    private void decrementSize() {
        this.count--;
    }

    public boolean isEmpty(){
        return (this.count == 0);
    }

    public int size(){
        return this.count;
    }

    private void isArrayFull() {
        if (size() == this.elements.length) {
            throw new IndexOutOfBoundsException();
        }
    }

    private void isIndexValid(int index) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException();
        }
    }

    public void add(E element) {
        isArrayFull();
        this.elements[this.count] = element;
        incrementSize();
    }

    public E get(int index) {
        isIndexValid(index);
        return this.elements[index];
    }

    public boolean contains(Object o) {
        for (int i = 0; i < this.elements.length; i++) {
            if (this.elements[i] == o  || this.elements[i].equals(o)) {
                return true;
            }
        }

        return false;
    }

    public E remove(int index) {
        isIndexValid(index);
        E data = this.elements[this.count];

        for (int i = index; i < this.elements.length - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }

        decrementSize();

        return data;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "Array is Empty";
        }
        StringBuffer sb = new StringBuffer();

        for (Object i : this.elements) {
            if (i != null) {
                sb.append(i);
                sb.append(" ");
            }
        }
        System.out.println();

        return sb.toString();
    }

}
