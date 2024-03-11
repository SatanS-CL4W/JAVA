package LinkedList;

public class InsertionIn_SinglyLinkedList {
    public Node head = null;
    public Node tail = null;
    public int size = 0;

    public class Node{   //Creating Node in Linked List
        int val;
        Node next;


            public Node(int val){    // First constructor which is taking value of node only
                this.val = val;
                this.next = null;
            }

            public Node(int val, Node next) { //This const. taking node value as well as next node address
                this.val = val;                 //It will be useful when we insert node in-between
                this.next = next;
            }
    }

    public void insertAtBeg(int val){   //Insert at Beginning
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if(tail == null){
           tail = head ;
        }
        size++;
    }

    public void insertAtLast(int val){  //Insert at Last
        Node node = new Node(val);

        if(tail == null){
            insertAtBeg(val);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertInBetween(int val, int index) { //Inserting Node in between
        if(index == 0){ //When Node is at First Index
            insertAtBeg(val);
            return;
        }
        if(index == size) { //When Node is at Last Index
            insertAtLast(val);
            return;
        }
        Node temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(val, temp.next);
        temp.next = newNode;
        size++;
    }

    public void display(){     //Displaying Elements of ll
        Node temp = head;
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of Singly Linked list: ");
        while(temp != null){
            System.out.print(temp.val + " -> " );
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public void size(){     //To Determine the size of linked list
        System.out.println("Size of Linked List: " + size);
    }

    public static void main(String[] args) {

        InsertionIn_SinglyLinkedList test = new InsertionIn_SinglyLinkedList();
        test.insertAtBeg(23);
        test.insertAtBeg(59);
        test.insertAtBeg(90);

        test.display();

        test.insertAtLast(78);

        test.display();

        test.insertInBetween(100, 2);

        test.display();

        test.size();



    }
}
