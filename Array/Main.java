package Array;

public class Main {

    public static void main(final String[] args) {
        Array<Integer> arr = new Array<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
    }
}
