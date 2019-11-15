public class LinkedList {
    //node class
    class Node {
        //class constructor
        Node() {
            value = 0;
            next = null;
            prev = null;
        }

        int value;
        Node next;
        Node prev;
    }

    //class constructor
    LinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    //class member variables
    private Node head;
    private Node tail;
    private int size;

    //class member methods
    public void print() {
        Node current;
        current = head;

        while(current!=null){
            System.out.print(current.value + " ");
            current = current.next;
        }
    }

    public void print_reverse() {
        Node current;
        current = tail;

        while(current!=null){
            System.out.print(current.value + " ");
            current = current.prev;
        }
    }

    public void insert(int val){
        Node current;
        Node prev = new Node();
        Node temp = new Node();
        temp.value = val;
        temp.next = null;
        temp.prev = null;

        //if list is empty
        if(head == null){
            head = temp;
            tail = temp;
            head.next = tail;
            tail.next = null;
        } else {
            current = head;

            while(current != null){
                prev = current;
                current = current.next;
            }

            //insertion point found
            prev.next = temp; //current tail
            tail = temp;
            tail.prev = prev; // old tail
            tail.next = null;
        }

        size++;
    }
}
