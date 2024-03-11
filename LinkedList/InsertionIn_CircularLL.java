package LinkedList;

public class InsertionIn_CircularLL {
    public class Node{
        int val;
        Node next;

            public Node(int val) {
                this.val = val;
            }
    }

    public Node head = null;
    public  Node tail = null;

    public void insert(int val) {
        Node node = new Node(val) ;
        if(head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;

    }

    public void display() {
        Node node = head;
        if(head != null){
            do{
                System.out.print(node.val + " -> ");
                if(node.next != null) {
                    node = node.next;
                }
            }while(node != head) ;
        }
        System.out.println("HEAD");
    }

    public static void main(String[] args) {
        InsertionIn_CircularLL list = new InsertionIn_CircularLL();
        list.insert(34);
        list.insert(44);
        list.insert(54);
        list.insert(64);
        list.insert(74);
        list.insert(84);

        list.display();

    }

}
