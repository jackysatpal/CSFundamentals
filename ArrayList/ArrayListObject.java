package ArrayList;

public class ArrayListObject {
    public static void main(String[] args) {
        ArrayList matches = new ArrayList();
        System.out.println(matches.isEmpty());

        for (int i = 0; i < 5; i++) {
            matches.add(i + 1);
        }

        matches.printElements();
        System.out.println("Size of array is " + matches.size());

        matches.add(6, 12);
        matches.printElements();

        matches.set(3, 120);
        System.out.println(matches.size());
        matches.printElements();

        System.out.println(matches.contains(2));
        System.out.println(matches.get(0));

        matches.remove(2);
        matches.printElements();
        System.out.println(matches.size());
    }
}
