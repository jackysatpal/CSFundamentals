package Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    public static void levelOrderTraversal(Node<Integer> root) {
        if (root == null) {
            return;
        }

        StringBuilder s = new StringBuilder();
        Queue<Node<Integer>> queue = new LinkedList<>();
        Node<Integer> front;
        queue.add(root);

        while (!queue.isEmpty()) {
            front = queue.remove();
            s.append(front.getData());
            s.append(" ");

            if (front.getLeft() != null) {
                queue.add(front.getLeft());
            }

            if (front.getRight() != null) {
                queue.add(front.getRight());
            }
        }

        System.out.print(s.toString());
    }

}
