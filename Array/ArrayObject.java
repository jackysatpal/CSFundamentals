package Array;

public class ArrayObject {
    public static void main(String[] args) {
        Array students = new Array(5);

        students.add(0,1);
        students.add(1,2);
        students.add(2,3);
        students.add(3,4);
        students.add(4,5);
        students.print();
        System.out.println(students.size());

        students.delete(2);
        students.print();
        System.out.println(students.size());

        students.delete(7);
        students.print();
        System.out.println(students.size());
    }
}
