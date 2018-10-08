package Array;

public class Array{
    private int size;
    private Object[] elements;
    private int count;
    private int length;

    public Array(int fixedSize){
        this.size = fixedSize;
        this.elements = new Object[this.size];
        this.count = 0;
        this.length = this.elements.length;
    }

    public boolean isEmpty(){
        return (this.count == 0);
    }

    public int size(){
        return this.count;
    }

    public void add(int index, Object o){
        if (index >= 0 && index < length) {
            this.elements[index] = o;
            this.count++;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    private int findElement(Object[] arr, Object o){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == o)
                return i;
        }

        return -1;
    }

    public Object get(int index){
        if (index >= 0 && index < length)
            return this.elements[index];
        else
            System.out.println("Element not found");

        return -1;
    }

    public void delete(Object o) {
        int index = findElement(this.elements, o);

        if (index == -1) {
            System.out.println("Element not found");
            return;
        }

        for (; index < length - 1; index++)
            this.elements[index] = this.elements[index + 1];

        this.elements[index] = null;
        this.count--;
    }

    public void print(){
        for (Object o : this.elements)
            System.out.print(o + " ");

        System.out.println();
    }
}
