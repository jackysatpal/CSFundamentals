package Tree.BinaryTree;

public class Node<E> {

    private E data;
    private Node<E> left;
    private Node<E> right;

    public Node(E data) {
        setData(data);
        setLeft(null);
        setRight(null);
    }

    public Node<E> getLeft() {
        return this.left;
    }

    public void setLeft(Node<E> left) {
        this.left = left;
    }

    public Node<E> getRight() {
        return this.right;
    }

    public void setRight(Node<E> right) {
        this.right = right;
    }

    public E getData() {
        return this.data;
    }

    public void setData(E data) {
        this.data = data;
    }
}
