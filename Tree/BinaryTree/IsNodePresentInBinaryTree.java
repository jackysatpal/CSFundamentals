package Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class IsNodePresentInBinaryTree {

    public static boolean isNodePresentUsingIteration(Node<Integer> root, int x) {
        if (root == null) {
            return false;
        }

        Node<Integer> front;
        Queue<Node<Integer>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            front = queue.remove();

            if (front.getData() == x) {
                return true;
            }

            if (front.getLeft() != null) {
                queue.add(front.getLeft());
            }

            if (front.getRight() != null) {
                queue.add(front.getRight());
            }

        }

        return false;
    }

    public static boolean isNodePresentUsingRecursion(Node<Integer> root, int x) {
        if (root == null) {
            return false;
        }

        boolean ans = root.getData().equals(x);

        if (ans) {
            return true;
        }

        ans = ans || isNodePresentUsingRecursion(root.getLeft(), x);
        if (ans) {
            return true;
        }

        ans = ans || isNodePresentUsingRecursion(root.getRight(), x);

        return ans;
    }
}
