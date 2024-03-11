package QuestionsLinkedList;

import LinkedList.InsertionIn_SinglyLinkedList;

public class RemoveDublicatesSortedLL {

    public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
    public ListNode head = null;
    public ListNode tail = null;
    public int size = 0;

    public void insertFirst(int val) {
        ListNode node = new ListNode(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }



    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        ListNode node = new ListNode(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void dublicates() {
        ListNode node = head;

        while(node.next != null) {
            if(node.val == node.next.val) {
                node = node.next.next;
                size--;
            }else {
                node = node.next;
            }
        }

        tail = node;
        tail.next = null;
    }

    public static void main(String[] args) {
        RemoveDublicatesSortedLL list = new RemoveDublicatesSortedLL();
        list.insertLast(1);
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(4);

        list.display();

        list.dublicates();

        list.display();
    }

}
