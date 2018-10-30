package SinglyLinkedList;

public class Main {
    public static void main(final String[] args) {
        SinglyLinkedList<Integer> list1 = new SinglyLinkedList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list1.addFirst(0);
        list1.addLast(3);
        list1.add(1, 12);

        System.out.println(list1);
        System.out.println("size is " + list1.size());

        System.out.println("Get First " + list1.getFirst());
        System.out.println("Get Last " + list1.getLast());
        System.out.println("Get "  + list1.get(2));

        System.out.println("Remove First " + list1.removeFirst());
        System.out.println(list1);

        System.out.println("Remove Last " + list1.removeLast());
        System.out.println(list1);
        System.out.println("Remove " + list1.remove(3));
        System.out.println(list1);

        System.out.println("Set " + list1.set(1, 22));
        System.out.println(list1);

        System.out.println(list1.contains(5));
    }
}
