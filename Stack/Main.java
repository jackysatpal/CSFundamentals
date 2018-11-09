package Stack;

public class Main {

    public static void main(final String[] args) {
//        StackUsingArray<Integer> stack = new StackUsingArray<>();
//        stack.push(5);
//        stack.push(4);
//        stack.push(3);
//        stack.push(2);
//        stack.push(1);
//        System.out.println(stack);
//
//        System.out.println(stack.peek());
//
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        stack.pop();
//        //stack.pop();
//        System.out.println(stack);
//        //System.out.println(stack.peek());
//
//        stack.push(5);
//        System.out.println(stack.peek());
//        System.out.println(stack);

//        StackUsingLinkedList<Integer> stackll = new StackUsingLinkedList<>();
//        stackll.push(1);
//        stackll.push(2);
//        System.out.println(stackll);
//        System.out.println("size " + stackll.size());
//        stackll.pop();
//        //stackll.pop();
//        System.out.println("size " + stackll.size());
//        System.out.println(stackll);
//        stackll.push(11);
//        stackll.push(21);
//        System.out.println(stackll);
//        System.out.println("size " + stackll.size());
//        System.out.println(stackll.peek());
//        System.out.println(stackll.pop());
//        System.out.println(stackll);

        StackUsingArrayList<Integer> sarr = new StackUsingArrayList<>();
        sarr.push(5);
        sarr.push(4);
        sarr.push(3);
        sarr.push(2);
        sarr.push(1);
        sarr.push(1);
        sarr.push(1);
        sarr.push(1);
        sarr.push(1);
        sarr.push(1);
        sarr.push(1);
        sarr.push(1);
        System.out.println(sarr);
        sarr.pop();
        System.out.println(sarr);
        System.out.println("size " + sarr.size());
    }
}
