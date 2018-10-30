package SinglyLinkedList;

interface ListInterface<T> {
    void clear();
    void addFirst(T element);
    void addLast(T element);
    boolean add(T element);
    void add(int index, T element);
    T get(int index);
    T getFirst();
    T getLast();
    int size();
    T removeFirst();
    T removeLast();
    T remove(int index);
    T set(int index, T element);
    boolean contains(Object o);
}
