package Tree.BinaryTree;

import java.util.Stack;

public class PreOrderTraversal {

    public static void preOrderTraversalUsingIteration(Node<Integer> root) {
        if (root == null) {
            return;
        }

        Node<Integer> top;
        StringBuilder s = new StringBuilder();
        Stack<Node<Integer>> stack = new Stack<>();
        stack.push(root);

        while (!stack.empty()) {
            top = stack.pop();
            s.append(top.getData());
            s.append(" ");

            if (top.getRight() != null) {
                stack.push(top.getRight());
            }

            if (top.getLeft() != null) {
                stack.push(top.getLeft());
            }
        }

        System.out.println("pre-order traversal is " + s.toString());
    }

    public static void preOrderTraversalUsingRecursion(Node<Integer> root) {
        if (root == null) {
            return;
        }

        System.out.print(root.getData() + " ");
        preOrderTraversalUsingRecursion(root.getLeft());
        preOrderTraversalUsingRecursion(root.getRight());
    }

}
