package LinkedList;

public class DeletionIn_DoublyLL {
    public class Node{
        int val;
        Node next;
        Node prev;

            public Node(int val) {
                this.val = val;
            }

            public Node(int val, Node next, Node prev) {
                this.val = val;
                this.next = next;
                this.prev = prev;
            }
    }

    public Node head;
    public Node tail = null;
    public int size = 0;

    public Node getRef(int index) {
        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    public void insert(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if(head != null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    public int DeleteAtFirst() {
        int val = head.val;
        head = head.next;
        head.prev = null;
        if(head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int DeleteAtLast() {
        if(size <= 1){
            return DeleteAtFirst();
        }
        Node SecondLast = getRef(size-2) ;
        int val = tail.val;
        tail.prev = null;
        tail = SecondLast;
        tail.next = null;
        size--;
        return val;
    }

    public void display() {
        Node temp = head;
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        while(temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public static void main(String[] args) {
        DeletionIn_DoublyLL list = new DeletionIn_DoublyLL();
        list.insert(21);
        list.insert(31);
        list.insert(41);
        list.insert(51);
        list.insert(61);
        list.insert(71);

        list.display();
        list.DeleteAtFirst();
    }
}
