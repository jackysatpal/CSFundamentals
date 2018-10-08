package Array;

public class Array{
    private final int size;
    private int index = 0;
    private Object[] elements;

    public Array(int fixedSize){
        this.size = fixedSize;
        this.elements = new Object[this.size];
    }

    public boolean isEmpty(){
        return (this.index == 0);
    }

    public void add(Object element){
        if (isEmpty()) {
            this.elements[index] = element;
            this.index++;
        }

        if (this.index == this.elements.length - 1)
           System.out.println("Can not add more elements because Array is full.");
        else {
            this.elements[index] = element;
            this.index++;
        }
    }

    public void addAtIndex(int index, Object element){
        if (!isEmpty()) {
            if (index >= 0 && index < this.elements.length) {
                this.elements[index] = element;
                this.index++;
            } else
                System.out.println("Array index out of range");
        } else
            System.out.println("Can not add more elements because Array is full");
    }

    public void remove(){
        if (!isEmpty()) {
            this.elements[this.index] = null;
            this.index--;
        } else
            System.out.println("Can not remove elements because Array is empty");
    }

    public void removeAtIndex(int index) {
        if (!isEmpty()) {
            if (index >= 0 && index < this.elements.length) {
                for (int i = index; i < this.elements.length - 1; i++)
                    this.elements[i] = this.elements[i + 1];

                this.index--;
            }
        } else {
            System.out.println("Can not remove elements because Array is empty");
        }
    }

    public void printElements(){
        if (!isEmpty()) {
            System.out.println("Printing ArrayElements:");

            for (Object i : this.elements)
                System.out.print(i + " ");

            System.out.println();
        } else
            System.out.println("Can not print elements because Array is empty.");
    }
}
