package Stack;
import java.util.EmptyStackException;

public class MinMaxStack {
    private static class Node {
        int value;
        int min;
        int max;
        Node next;

        public Node(int value, int min, int max) {
            this.value = value;
            this.min = min;
            this.max = max;
        }
    }

    private Node top;

    public void push(int value) {
        if (top == null) {
            top = new Node(value, value, value);
        } else {
            int min = Math.min(value, top.min);
            int max = Math.max(value, top.max);
            Node newNode = new Node(value, min, max);
            newNode.next = top;
            top = newNode;
        }
    }

    public int pop() {
        if (top == null) {
            throw new EmptyStackException();
        }
        int value = top.value;
        top = top.next;
        return value;
    }

    public int peek() {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.value;
    }

    public int getMin() {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.min;
    }

    public int getMax() {
        if (top == null) {
            throw new EmptyStackException();
        }
        return top.max;
    }

    public static void main(String[] args) {
        MinMaxStack stack = new MinMaxStack();

        stack.push(5);
        stack.push(2);
        stack.push(7);
        stack.push(1);

        System.out.println("Minimum element: " + stack.getMin()); // Output: 1
        System.out.println("Maximum element: " + stack.getMax()); // Output: 7

        stack.pop();

        System.out.println("Minimum element after pop: " + stack.getMin()); // Output: 2
        System.out.println("Maximum element after pop: " + stack.getMax()); // Output: 7
    }
}
