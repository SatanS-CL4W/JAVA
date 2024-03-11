package Stack;

import java.util.Scanner;

public class ReverseStringUsingStack {
    int top;
    char[] b;
    int size;


    ReverseStringUsingStack(int n) {
        top = -1;
        size = n;
        b = new char[size];
    }

    boolean push(char x) {
        if (top >= size) {
            System.out.println("Overflow");
            return false;
        } else {
            b[++top] = x;
            return true;
        }
    }

    public char pop() {
        if (top < 0) {
            System.out.println("Underflow");
            return '0';
        } else {
            char z = b[top--];
            return z;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

}

class stack1 {

    public static String reverseString(String input) {
        int length = input.length();
        ReverseStringUsingStack s = new ReverseStringUsingStack(length);

        for (int i = 0; i < length; i++) {
            s.push(input.charAt(i));
        }

        StringBuilder rev = new StringBuilder();
        while(!s.isEmpty()) {
            rev.append(s.pop());
        }

        return rev.toString();
    }

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str = sc.nextLine();
        //String a = "Hello";
        String reversed = reverseString(str);
        System.out.println("Reversed String: " + reversed);

    }
}
