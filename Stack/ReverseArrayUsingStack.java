package Stack;

public class ReverseArrayUsingStack {
    int size;
    int top;
    int[] a;

    ReverseArrayUsingStack(int n) {
        size = n;
        top = -1;
        a = new int[size];
    }

    boolean push(int x) {
        if (top >= size) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = x;
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            int x = a[top--];
            return x;
        }
    }
}
    class test {
        public static void reverse (int[] arr, int n) {
            ReverseArrayUsingStack s = new ReverseArrayUsingStack(n);
            for (int i = 0; i < n; i++) {
                s.push(arr[i]);
            }
            for (int i = 0; i < n; i++) {
                arr[i] = s.pop();
            }
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        public static void main(String[] args) {
            int n = 7;
            int[] arr = new int[] {21, 89, 90, 56, 23, 78, 67};

            reverse(arr, n);
        }
}

