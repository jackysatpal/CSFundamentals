package CircularSinglyLinkedList;

public class Main {

    public static void main(final String[] args) {
        CircularSinglyLinkedList<Integer> ll = new CircularSinglyLinkedList<Integer>();
        ll.add(3);
        ll.add(4);
        System.out.println(ll);

        ll.addFirst(1);
        System.out.println(ll);

        ll.addLast(5);
        System.out.println(ll);

        ll.add(2, 2);
        System.out.println(ll);

        ll.add(1, 0);
        System.out.println(ll);

        System.out.println(ll.contains(1));
        System.out.println(ll.contains(10));

        //System.out.println(ll.get(10));
        System.out.println("getFirst " + ll.getFirst());
        System.out.println("getLast " + ll.getLast());

        System.out.println("removeFirst " + ll.removeFirst());
        System.out.println("removeLast " + ll.removeLast());

        System.out.println(ll);

        System.out.println("remove " + ll.remove(2));
        System.out.println(ll);

        System.out.println("set " + ll.set(2, 2));
        System.out.println("set " + ll.set(3, 3));
        System.out.println(ll);

        System.out.println("\nsize is " + ll.size());
    }
}
