package LinkedList;

public class DeletionIn_SinglyLinkedList {
    public class Node{
        int val;
        Node next;

            public Node(int val){

                this.val = val;
            }
            public Node(int val, Node next){
                this.val = val;
                this.next = next;
            }
    }
    public Node head = null;
    public Node tail = null;
    public int size = 0;

    public void insert(int val){   //Inserting Nodes
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        if(tail == null){
            tail = head ;
        }
        size++;
    }

    public int DeleteAtFirst() {
        int val = head.val;
        head = head.next;

        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }

    public int DeleteAtLast(){
        if(size <= 1) {
            return DeleteAtFirst();
        }

        Node secondLast = get(size-2);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }
    //---------------------------------------------------------------------------------------------------

    /*This will create a reference node same as head to other node
    It's important to understand how things are working internally... this function will point
    a reference pointer to a node in return type of node only, same as head and tail of a linked
    list where head and tail are fixed */
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    //---------------------------------------------------------------------------------------------------

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

    public int Delete(int pos){
        if(pos == 0){
           return DeleteAtFirst();
        }
        if(pos == size){
            return DeleteAtLast();
        }
        Node target = get(pos);
        Node prev = get(pos-1);

        int val = target.val;
        prev.next = target.next;
        target = prev;


        return val;
    }

    public static void main(String[] args) {
        DeletionIn_SinglyLinkedList list = new DeletionIn_SinglyLinkedList();

        list.insert(23);
        list.insert(55);
        list.insert(67);
        list.insert(90);
        list.insert(95);
        list.display();
//        System.out.println("Deleted Element: " + list.DeleteAtFirst());
//        list.display();
//
//        list.size();
//
//        System.out.println("Deleted Element: " + list.DeleteAtLast());
//        list.display();

//        list.size();

        System.out.println("Deleted Elem: " + list.Delete(2));
        list.display();

    }
}


