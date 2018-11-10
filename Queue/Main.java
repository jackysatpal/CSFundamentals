package Queue;

import CircularDoublyLinkedList.CircularDoublyLinkedList;

public class Main {

    public static void main(final String[] args) {
//        QueueUsingArray<Integer> queue = new QueueUsingArray<>();
//        queue.enqueue(1);
//        queue.enqueue(2);
//        queue.enqueue(3);
//        queue.enqueue(4);
//        queue.enqueue(5);
//        System.out.println(queue);
//        System.out.println("size " + queue.size());
//        System.out.println("front " + queue.peek());
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
//       System.out.println(queue);
//      System.out.println("size " + queue.size());
//       System.out.println("front " + queue.peek());
//        queue.enqueue(11);
//        queue.enqueue(12);
//        queue.enqueue(13);
//        queue.enqueue(14);
//        queue.enqueue(15);
//        System.out.println(queue);
//        System.out.println("size " + queue.size());
//        System.out.println("front " + queue.peek());

//        QueueUsingLinkedList<Integer> queueLL = new QueueUsingLinkedList<>();
//        queueLL.enqueue(1);
//        queueLL.enqueue(2);
//        queueLL.enqueue(3);
//        queueLL.enqueue(4);
//        queueLL.enqueue(5);
//        System.out.println(queueLL);
//        System.out.println("size " + queueLL.size());
//        System.out.println("firstElement " + queueLL.peek());
//        queueLL.dequeue();
//        queueLL.dequeue();
//        System.out.println(queueLL);
//        System.out.println("size " + queueLL.size());

        CircularQueueUsingArray<Integer> cq = new CircularQueueUsingArray<>();
        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);
        cq.enqueue(4);
        cq.enqueue(5);
        System.out.println(cq);
        System.out.println("size " + cq.size());
        System.out.println("firstElement " + cq.peek());
        cq.dequeue();
        System.out.println(cq);
        System.out.println("size " + cq.size());
        System.out.println("firstElement " + cq.peek());
        cq.enqueue(6);
        System.out.println(cq);
        System.out.println("size " + cq.size());
        System.out.println("firstElement " + cq.peek());
    }
}
