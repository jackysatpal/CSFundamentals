package Stack;

public interface StackInterface<E> {
    public E push(E element);
    public E pop();
    public boolean empty();
    public E peek();
    public int size();
}
