package Array;

public class ArrayObject {
    public static void main(String[] args) {
        Array students = new Array(5);

        students.add("Jacky");
        students.addAtIndex(3, 456);
        //students.add("Jacky");
        //students.add("Jacky");

        students.printElements();

        students.removeAtIndex(0);
        students.printElements();
    }
}
