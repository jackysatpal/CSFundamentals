package DoublyLinkedList;

public class Main {

    public static void main(final String[] args) {
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<Integer>();
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(2);
        dll.addLast(3);
        dll.add(1, 1);
        dll.add(2);
        dll.add(3);
        dll.add(4);
        dll.add(5);
        dll.add(6);
        System.out.println(dll);

        System.out.println(dll.contains(1));
        System.out.println(dll.contains(10));

        System.out.println(dll.get(3));
        System.out.println(dll.getFirst());
        System.out.println(dll.getLast());

        System.out.println("\nremoveFirst " + dll.removeFirst());
        System.out.println(dll);
        System.out.println("removeLast " + dll.removeLast());
        System.out.println(dll);
        System.out.println("remove " + dll.remove(2));
        System.out.println(dll);

        System.out.println(dll.set(2, 202));
        System.out.println(dll);
    }
}
