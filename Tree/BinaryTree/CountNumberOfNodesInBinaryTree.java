package Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class CountNumberOfNodesInBinaryTree {

    public static int countUsingIteration(Node<Integer> root) {
        int count = 0;
        Node<Integer> front;

        if (root != null) {
            count++;
        }

        Queue<Node<Integer>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            front = queue.remove();

            if (front.getLeft() != null) {
                queue.add(front.getLeft());
                count++;
            }

            if (front.getRight() != null) {
                queue.add(front.getLeft());
                count++;
            }
        }

        return count;
    }

    public static int countUsingRecursion(Node<Integer> root) {
        if (root == null) {
            return 0;
        }

        int ans = 1;
        ans += countUsingRecursion(root.getLeft());
        ans += countUsingRecursion(root.getRight());

        return ans;
    }
}
