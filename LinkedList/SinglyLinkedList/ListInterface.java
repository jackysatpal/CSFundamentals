package SinglyLinkedList;

interface ListInterface<T> {
    public void clear();
    public void addFirst(T element);
    public void addLast(T element);
    public boolean add(T element);
    public void add(int index, T element);
    public T get(int index);
    public T getFirst();
    public T getLast();
    public int size();
    public T removeFirst();
    public T removeLast();
    public T remove(int index);
    public T set(int index, T element);
    public boolean contains(Object o);
}
