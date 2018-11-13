package Tree.BinaryTree;

import java.util.Stack;

public class InOrderTraversal {

    public static void inOrderTraversalUsingIteration(Node<Integer> root) {
        if (root == null) {
            return;
        }

        Node<Integer> current;
        StringBuilder s = new StringBuilder();
        Stack<Node<Integer>> stack = new Stack<>();
        current = root;

        while (true) {
            while (current != null) {
                stack.push(current);
                current = current.getLeft();
            }

            if (stack.empty()) {
                System.out.println(s.toString());
                return;
            }

            current = stack.pop();
            s.append(current.getData());
            s.append(" ");
            current = current.getRight();
        }
    }

    public static void inOrderTraversalUsingRecursion(Node<Integer> root) {
        if (root == null) {
            return;
        }

        inOrderTraversalUsingRecursion(root.getLeft());
        System.out.print(root.getData() + " ");
        inOrderTraversalUsingRecursion(root.getRight());
    }
}
