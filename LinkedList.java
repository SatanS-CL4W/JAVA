class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the end of the linked list
    public void insert(int data) {
        Node newNode = new Node(data);

        // If the linked list is empty, set the new node as the head
        if (head == null) {
            head = newNode;
        } else {
            // Traverse to the end of the linked list
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }

            // Insert the new node at the end
            current.next = newNode;
        }
    }

    // Method to display the elements of the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Inserting nodes into the linked list
        linkedList.insert(10);
//        linkedList.insert(20);
//        linkedList.insert(30);

        // Display the linked list
        System.out.println("Linked List elements:");
        linkedList.display();
    }
}
