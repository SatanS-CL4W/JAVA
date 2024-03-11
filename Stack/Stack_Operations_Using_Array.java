package Stack;

public class Stack_Operations_Using_Array {

    static final int MAX = 1000;
    int top = -1;
    int[] arr = new int[MAX];

    boolean push(int x){
        if(top >= MAX-1) {
            System.out.println("Stack Overflow");
            return false;
        }
        else {
            arr[++top] = x;
            System.out.println("Element pushed: " + x);
            return true;
        }
    }

    int pop() {
        if(top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        }
        else {
            //System.out.print("Popped Element: ");
            int x = arr[top];
            top--;
            return x;
        }
    }

    void display() {
        //System.out.print("Element present: ");
        for (int i = top; i > -1; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    boolean isEmpty() {
        if(top <= (MAX-1)){
            return true;
        }
        else
            return false;
    }

    boolean isFull(){
        if(top >= (MAX-1)) {
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        Stack_Operations_Using_Array s = new Stack_Operations_Using_Array();
        //s.isEmpty();
        s.push(20);
        s.push(30);
        s.push(50);
        s.push(80);
        //s.isFull();
        System.out.print("Elements in stack: ");
        s.display();
        System.out.println();
        System.out.println(s.pop() + " Popped Element");
        System.out.println(s.pop() + " Popped Element");
        System.out.print("Elements in stack: ");
        s.display();
        System.out.println();
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
    }
}
