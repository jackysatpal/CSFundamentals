package Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class HeightOfBinaryTree {

    public static int heightUsingRecursion(Node<Integer> root) {
        if (root == null) {
            return 0;
        }

        int ans = 1;
        int left = ans + heightUsingRecursion(root.getLeft());
        int right = ans + heightUsingRecursion(root.getRight());

        return ((left < right) ? right : left);
    }

    public static int heightUsingIteration(Node<Integer> root) {
        if (root == null) {
            return 0;
        }

        int leftCount = 0;
        int rightCount = 0;
        Node<Integer> front;
        Queue<Node<Integer>> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            front = queue.remove();

            if (front.getLeft() != null) {
                queue.add(front.getLeft());
                leftCount++;
            }

            if (front.getRight() != null) {
                queue.add(front.getRight());
                rightCount++;
            }
        }

        return ((leftCount < rightCount) ? rightCount : leftCount);
    }
}
