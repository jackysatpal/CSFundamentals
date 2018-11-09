package ArrayList;

public class Main {

    public static void main(final String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(11);
        al.add(12);
        al.add(13);
        al.add(14);
        al.add(15);
        al.add(16);
        al.add(17);
        al.add(18);
        al.add(19);
        al.add(21);
        al.add(8,20);
        System.out.println(al);
        System.out.println(al.size());
        al.remove(8);
        System.out.println(al);
        System.out.println(al.size());
        al.add(9,20);
        System.out.println(al);
        System.out.println(al.size());
    }
}
