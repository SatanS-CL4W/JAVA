package LinkedList;

public class InsertionIn_DoublyLL {
    public class Node{
        int val;
        Node next;
        Node prev;

            public Node (int val) {
                this.val = val;
            }
            public Node (int val, Node next, Node prev) {
                this.val = val;
                this.next = next;
                this.prev = prev;
            }
    }
        public Node head;
        public Node tail;
        public int size = 0;

        public void insertFirst (int val) {
            Node node = new Node(val);
            node.next = head;
            node.prev = null;

            if(head != null){
                head.prev = node;
            }
           head = node;
            size++;
        }

        public void insertLast(int val) {
            Node node = new Node(val);
            Node last = head;
            node.next = null;

            if(head == null){
                insertFirst(val);
                return;
            }

            while(last.next != null){
                last = last.next;
            }
            last.next = node;
            node.prev = last;
        size++;
        }

        public void insertBetw(int val, int index) {
            Node node = new Node(val);
            Node p = head;
            Node q = head;
            if(head == null || index < 1) {
                insertFirst(val);
                return;
            }

            if(index == size){
                insertLast(val);
                return;
            }

            for (int i = 0; i < index; i++) {
                p = p.next;
                q = p.next;
            }
            p.next = node;
            node.next = q;

            q.prev = node;
            node.prev = p;

            size++;
        }
        public void display() {
            Node first = head;
            Node last = null;
            while(first != null){
                System.out.print(first.val + " -> ");
                last = first;
                first = first.next;
            }
            System.out.println("End");

            System.out.println("Printing DLL in reverse");

            while(last != null) {
                System.out.print(last.val + " -> ");
                last = last.prev;
            }
            System.out.println("Start");
        }

        public Node pointer(int index) {
            Node p = head;

            for (int i = 1; i < index; i++) {
                p = p.next;
            }

            return p;
        }

//        public void displayRev() {
//            Node last = pointer(size);
//
//            while(last != null) {
//                System.out.println(last.val + " -> ");
//                last = last.prev;
//
//            }
//            System.out.println("Start");
//        }


    public static void main(String[] args) {
        InsertionIn_DoublyLL list = new InsertionIn_DoublyLL();
        list.insertFirst(43);
        list.insertFirst(3);
        list.insertFirst(8);
        list.insertFirst(56);
        list.insertFirst(89);

        list.display();

//        list.insertLast(100);
//        System.out.println("Inserting element at last position");
//        list.display();

        list.insertBetw(1000, list.size);
        list.display();

    }
}
