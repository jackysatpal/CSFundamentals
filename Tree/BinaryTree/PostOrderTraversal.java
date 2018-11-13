package Tree.BinaryTree;

import java.util.Stack;

public class PostOrderTraversal {

    public static void postOrderTraversalUsingIteration(Node<Integer> root) {
        if (root == null) {
            return;
        }

        Node<Integer> top;
        StringBuilder s = new StringBuilder();
        Stack<Node<Integer>> stack1 = new Stack<>();
        Stack<Node<Integer>> stack2 = new Stack<>();
        stack1.push(root);

        while (!stack1.empty()) {
            top = stack1.pop();
            stack2.push(top);

            if (top.getLeft() != null) {
                stack1.push(top.getLeft());
            }

            if (top.getRight() != null) {
                stack1.push(top.getRight());
            }
        }

        while (!stack2.empty()) {
            s.append(stack2.pop().getData());
            s.append(" ");
        }

        System.out.println(s.toString());
    }

    public static void postOrderTraversalUsingRecursion(Node<Integer> root) {
        if (root == null) {
            return;
        }

        postOrderTraversalUsingRecursion(root.getLeft());
        postOrderTraversalUsingRecursion(root.getRight());
        System.out.print(root.getData() + " ");
    }
}
